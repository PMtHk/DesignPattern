public class LEDMonitor extends BaseExternalDevice {
  public LEDMonitor(String type, AbstractNotebookComputer computer) {
    super(type, computer);
  }

  @Override
  public double getSpace() {
    return 150.0;
  }
}
