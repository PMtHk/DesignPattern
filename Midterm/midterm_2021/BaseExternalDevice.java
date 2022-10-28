public abstract class BaseExternalDevice extends AbstractExternalDevice {
  private AbstractNotebookComputer computer;

  public BaseExternalDevice(String type, AbstractNotebookComputer computer){
    super(type);
    this.computer = computer;
  }

  @Override
  public String toString() {
    return computer.toString() + ", " + super.toString();
  }

  public double requiredSpace() {
    return computer.requiredSpace() + this.getSpace();
  }

  public abstract double getSpace();
}
