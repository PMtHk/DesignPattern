public class SourceCode {
  private String srcFileName;
  
  public SourceCode(String name){
    this.srcFileName = name;
  }

  public String getFileName() {
    return srcFileName;
  }

  public void setFileName(String newName) {
    this.srcFileName = newName;
  }
}
