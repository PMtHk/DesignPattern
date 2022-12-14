public class Client {
  public static void main(String[] args) {
    
    // Singleton s1 = new Singleton(); 불가...
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();

    if (s1 == s2) {
      System.out.println("동일 인스턴스");
    } else {
      System.out.println("동일하지 않은 인스턴스");
    }

    s1.doSomething();
    s2.doSomething();
  }
  
}
// 멀티쓰레딩의 경우 문제 발생 가능
