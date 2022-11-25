public class STATE_LESS_500 implements State {
  VendingMachine vMachine;

  public STATE_LESS_500(VendingMachine vendingMachine) {
    vMachine = vendingMachine;
  }

  public void addHundred() {
    vMachine.setBalance(vMachine.getBalance() + 100);
    if (vMachine.getBalance() == 500) {
      vMachine.setState(vMachine.STATE_500);
    }
  }

  public void addFiveHundred() {
    vMachine.setBalance(vMachine.getBalance() + 500);
    vMachine.setState(vMachine.STATE_LESS_1000);
  }

  public void addThousand() {
    vMachine.setBalance(vMachine.getBalance() + 1000);
    vMachine.setState(vMachine.STATE_EQUAL_OR_MORE_1000);
  }

  public void returnChanges() {
    vMachine.setMsg("" + vMachine.getBalance() + "원을 반환합니다.");
    vMachine.setState(vMachine.STATE_0);
  }

  public void selectBeverage() {
    vMachine.setMsg("1000원 이상을 넣은 후에 눌러주세요.");
  }
}
