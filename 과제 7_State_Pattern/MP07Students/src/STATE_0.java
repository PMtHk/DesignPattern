public class STATE_0 implements State {
  VendingMachine vMachine;

  public STATE_0(VendingMachine vendingMachine){
    vMachine = vendingMachine;
  }

  public void addHundred() {
    vMachine.setBalance(100);
    vMachine.setState(vMachine.STATE_LESS_500);
  }

  public void addFiveHundred() {
    vMachine.setBalance(500);
    vMachine.setState(vMachine.STATE_500);
  }

  public void addThousand() {
    vMachine.setBalance(1000);
    vMachine.setState(vMachine.STATE_EQUAL_OR_MORE_1000);
  }

  public void returnChanges() {
    vMachine.setMsg("");
  }

  public void selectBeverage() {
    vMachine.setMsg("돈을 넣은 후에 눌러주세요");
  }
}