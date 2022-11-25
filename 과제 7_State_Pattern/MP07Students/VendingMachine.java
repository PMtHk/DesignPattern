public class VendingMachine {
  State STATE_0;
  State STATE_LESS_500;
  State STATE_500;
  State STATE_LESS_1000;
  State STATE_EQUAL_OR_MORE_1000;

  private State state;
  private int balance = 0;
  private String msg= "";

  public VendingMachine() {
    STATE_0 = new STATE_0(this);
    STATE_LESS_500 = new STATE_LESS_500(this);
    STATE_500 = new STATE_500(this);
    STATE_LESS_1000 = new STATE_LESS_1000(this);
    STATE_EQUAL_OR_MORE_1000 = new STATE_EQUAL_OR_MORE_1000(this);
    state = STATE_0;
  }

  public void addHundred() {
    state.addHundred();
  }

  public void addFiveHundred() {
    state.addFiveHundred();
  }

  public void addThousand() {
    state.addThousand();
  }

  public void returnChanges() {
    state.returnChanges();
  }

  public void selectBeverage() {
    state.selectBeverage();
  }

  public int getBalance() {
    return this.balance;
  }

  public void setBalance(int newBalance) {
    this.balance = newBalance;
  }

  public void setState(State newState) {
    this.state = newState;
  }

  public String getMsg() {
    return this.msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }
}
