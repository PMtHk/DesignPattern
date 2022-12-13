public class TurkeyAdapter implements Duck {
  Turkey turkey;

  public TurkeyAdapter(Turkey tk) {
    turkey = tk;
  }

  public void quack() {
    turkey.gobble();
  }

  public void fly() {
    for (int i = 0; i < 5; i++) {
      turkey.fly();
    }
  }
}