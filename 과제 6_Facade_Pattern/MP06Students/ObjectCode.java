public class ObjectCode {
  private String objFileName;
  
  public ObjectCode(String name){
    this.objFileName = name;
  }

  public String getFileName() {
    return objFileName;
  }

  public void setFileName(String newName) {
    this.objFileName = newName;
  }
}
