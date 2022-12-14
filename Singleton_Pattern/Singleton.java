// singleton pattern

public class Singleton {

  // 생성자 호출되지 않도록 private 으로
  private static Singleton instance;

  private Singleton() {
    System.out.println("객체 생성됨");
  }

  // 멀티쓰레딩인 경우 문제가 발생할 수 있음
  // public static synchronized ... -> 불필요하게 딜레이 발생 가능

  public static Singleton getInstance() {
    if(instance == null) {
      // 생성 객체 없다면 하나 만들기.
      instance = new Singleton();
    }
    return instance;
  }

  
  // //불필요한 딜레이 막기 위해 double-checked locking 메커니즘 이용
  // public static Singleton getInstance() {
  //   if (instance == null) {
  //     synchronized (Singleton.class) {
  //       if (instance == null) {
  //         instance = new Singleton();
  //       }
  //     }
  //   }
  //   return instance;
  // }


  // 객체.doSomething()
  public void doSomething() {
    System.out.println("Something is Done.");
  }
}

// // lock-free thread-safe singleton
// public class Singleton {
//   // java에 한해서 static을 사용할 수 있다.
//   // TODO
//   private static Singleton instance = new Singleton();

//   private Singleton() {
//       System.out.println("객체 생성됨");
//   }

//   public static Singleton getInstance() {
//       return instance;
//   }

//   public void doSomething() {
//       System.out.println("Something is Done.");
//   }
// }