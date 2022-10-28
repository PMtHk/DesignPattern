import java.util.ArrayList;
import java.time.LocalTime;

public class DateTime implements Runnable, Subject{
  private static final int SLEEPTIME = 1000; // 1000ms -> 1초
  private LocalTime time;
  private String timeToText;
  private ArrayList<Observer> obs = new ArrayList<>();
  private boolean stopRunning = false;

  public void stopRunning() { stopRunning = true; }

  public void startRunning() {
      stopRunning = false;
      run();
  }

  private void generateNowDateTime() {
    while(stopRunning == false) {
      time = LocalTime.now(); // now()를 호출해서 현재 시각 정보를 얻음
      System.out.println("" + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
      timeToText = "" + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond();
      notifyObservers(timeToText);
      try {
        Thread.sleep(SLEEPTIME); // 1초 쉼
      } catch (Exception e) {
        e.printStackTrace();      
      }
    }
  }

  @Override
  public void run() {
    generateNowDateTime();
  }

  @Override
  public void registerObserver(Observer o) {
    obs.add(o);
  }

  @Override
  public void unregisterObserver(Observer o) {
    obs.remove(o);
  }

  @Override
  public void notifyObservers(String msg) {
    for (Observer o : obs){
      o.updateText(msg);
    }
  }
}
