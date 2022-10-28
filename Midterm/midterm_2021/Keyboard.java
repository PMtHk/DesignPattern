public class Keyboard extends AbstractExternalDevice {
  AbstractNotebookComputer computer;
  
  public Keyboard(String type, AbstractNotebookComputer computer){
    super(type);
    this.computer = computer;
  }

  @Override
  public String toString() {
    return computer.toString() + ", " + super.toString();
  }

  public double requiredSpace() {
    return computer.requiredSpace() + 80.0;
  }
}
