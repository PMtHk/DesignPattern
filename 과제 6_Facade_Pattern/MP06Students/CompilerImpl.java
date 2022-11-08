public class CompilerImpl implements Compiler {
  public ObjectCode compile(SourceCode srcCode){
    String srcCodeName = srcCode.getFileName();
    String newObjCodeName = srcCodeName.replace(".c", ".obj");
    
    System.out.println("Compiling code: " + srcCodeName);
    ObjectCode newObjCode = new ObjectCode(newObjCodeName);
    System.out.println("Generating object code :" + newObjCodeName);

    return newObjCode;
  }
}
