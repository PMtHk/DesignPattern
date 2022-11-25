public class STATE_EQUAL_OR_MORE_1000 implements State {
  VendingMachine vMachine;

  public STATE_EQUAL_OR_MORE_1000(VendingMachine vendingMachine) {
    vMachine = vendingMachine;
  }

  public void addHundred() {
    vMachine.setBalance(vMachine.getBalance() + 100);
    vMachine.setMsg("이미 충분한 돈이 투입되었습니다. 음료를 선택하세요");
  }

  public void addFiveHundred() {
    vMachine.setBalance(vMachine.getBalance() + 500);
    vMachine.setMsg("이미 충분한 돈이 투입되었습니다. 음료를 선택하세요");
  }

  public void addThousand() {
    vMachine.setBalance(vMachine.getBalance() + 1000);
    vMachine.setMsg("이미 충분한 돈이 투입되었습니다. 음료를 선택하세요");
  }

  public void returnChanges() {
    vMachine.setMsg("" + vMachine.getBalance() + "원을 반환합니다.");
    vMachine.setBalance(0);
    vMachine.setState(vMachine.STATE_0);
  }

  public void selectBeverage() {
    String temp_msg = "음료를 내보냅니다. 배출구를 확인하세요.";
    vMachine.setBalance(vMachine.getBalance() - 1000);
    if (vMachine.getBalance() > 0) {
      temp_msg = temp_msg + " 거스름돈 " + vMachine.getBalance() + "원을 반환합니다.";
      vMachine.setBalance(0);
    }
    vMachine.setMsg(temp_msg);
    vMachine.setState(vMachine.STATE_0);
  }
}

