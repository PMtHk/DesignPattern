public abstract class CaffeineBeverageWithHook {
  public final void prepareReceipe() {
    boilWater();
    brew();
    pourInCup();
    if (customerWantsCondiments()) {
      addCondiments();
    }
  }

  public abstract void brew();

  public abstract void addCondiments();

  public void boilWater() {
    System.out.println("물 끓이는 중");
  }

  public void pourInCup() {
    System.out.println("컵에 물 따르는중");
  }

  boolean customerWantsCondiments() {
    // Hook
    return true;
  }
}
