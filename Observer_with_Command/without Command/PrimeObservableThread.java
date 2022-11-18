import java.util.ArrayList;

public class PrimeObservableThread implements Runnable, Subject {
    private static final int SLEEPTIME = 500;

    private int primeNumber;
    private int numCount = 1;
    private boolean stopRunning = false;

    private ArrayList<Observer> observers = new ArrayList<>();
    // 옵저버 리스트, 생성자 따로없으므로, 여기서 초기화.

    public int getPrimeNumber() { return primeNumber; }

    public void stopRunning() { stopRunning = true; }

    public void startRunning() {
        stopRunning = false;
        run();
    }

    private void generatePrimeNumber() {
        primeNumber = 2;
        System.out.println(primeNumber);
        while (stopRunning == false) {
            numCount += 2; // 2를 제외한 짝수는 소수가 될 수 없음. 따라서 홀수만 검사
            if (isPrimeNumber(numCount)) {
                primeNumber = numCount;
                System.out.println(primeNumber);
                notifyObservers(); // 소수를 찾은경우 노티파이!
            }
            try {
                Thread.sleep(SLEEPTIME); // 1초 쉼
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isPrimeNumber(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() { generatePrimeNumber(); }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(primeNumber); // primeNumber 변경에 대해 업데이트
        }
    }
}
