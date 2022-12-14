public class Mouse extends AbstractExternalDevice {
  AbstractNotebookComputer computer;
  
  public Mouse(String type, AbstractNotebookComputer computer){
    super(type);
    this.computer = computer;
  }

  @Override
  public String toString() {
    return computer.toString() + ", " + super.toString();
  }

  public double requiredSpace() {
    return computer.requiredSpace() + 30.0;
  }
}
