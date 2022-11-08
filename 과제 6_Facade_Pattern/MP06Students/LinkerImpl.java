import java.util.List;

public class LinkerImpl implements Linker {

  @Override
  public Executable link(String exeFileName, ObjectCode[] objFiles) {
    String s = "";
    for (int i = 0; i<objFiles.length; i++){
      s = s + "\n" + objFiles[i].getFileName();
    }
    System.out.println("Linking" + s);
    return new Executable(exeFileName, s);
  }

  @Override
  public Executable link(String exeFileName, List<ObjectCode> objFiles) {
    String s = "";
    for (int i = 0; i<objFiles.size(); i++){
      s = s + "\n" + objFiles.get(i).getFileName();
    }
    System.out.println("Linking" + s);
    return new Executable(exeFileName, s);
  }
  
}
