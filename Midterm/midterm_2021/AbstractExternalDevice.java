public abstract class AbstractExternalDevice extends AbstractNotebookComputer{
  private String deviceType;
  
  public AbstractExternalDevice(String type){
    this.deviceType = type;
  }

  public String toString(){
    return deviceType;
  }

  abstract double requiredSpace();
}
