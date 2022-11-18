public interface Subject { // Subject 인터페이스 생성
    public void registerObserver(Observer o);
    public void unregisterObserver(Observer o);
    public void notifyObservers(); // 값을 받는 경우도 있다.
}
