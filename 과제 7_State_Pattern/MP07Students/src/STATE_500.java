public class STATE_500 implements State {
  VendingMachine vMachine;

  public STATE_500(VendingMachine vendingMachine) {
    vMachine = vendingMachine;
  }

  public void addHundred() {
    vMachine.setBalance(vMachine.getBalance() + 100);
    vMachine.setState(vMachine.STATE_LESS_1000);
  }

  public void addFiveHundred() {
    vMachine.setBalance(vMachine.getBalance() + 500);
    vMachine.setState(vMachine.STATE_EQUAL_OR_MORE_1000);
  }

  public void addThousand() {
    vMachine.setBalance(vMachine.getBalance() + 1000);
    vMachine.setState(vMachine.STATE_EQUAL_OR_MORE_1000);
  }

  public void returnChanges() {
    vMachine.setMsg("" + vMachine.getBalance() + "원을 반환합니다.");
    vMachine.setBalance(0);
    vMachine.setState(vMachine.STATE_0);
  }

  public void selectBeverage() {
    vMachine.setMsg("1000원 이상을 넣은 후에 눌러주세요.");
  }
}
