public abstract class PizzaStore {
  void prepareToBoxing(Pizza pizza) {
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
  }

  public Pizza orderPizza(String type) {
    Pizza pizza = createPizza(type);
    prepareToBoxing(pizza);
    return pizza;
  }

  // 팩토리 메소드
  abstract Pizza createPizza(String type);
}