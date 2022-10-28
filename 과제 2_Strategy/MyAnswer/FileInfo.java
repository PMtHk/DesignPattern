import java.util.Date;

public class FileInfo {
  private String name;
  private String type;
  private int size;
  private Date modifiedDate;

  public FileInfo(String name, String type, int size, Date modifieDate){
    this.name = name;
    this.type = type;
    this.size = size;
    this.modifiedDate = modifieDate;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public int getSize() {
    return size;
  }

  public Date getModifieDate() {
    return modifiedDate;
  }

  public String toString() {
    return "Name: " + this.name + "\n" 
        + "Type: " + type + "\n"
        + "Size: " + size + "\n"
        + "ModifiedDate: " + modifiedDate.toString();
  }
}
