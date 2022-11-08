import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IDE implements Builder {
  private String ProjectName;
  private Preprocessor preprocessor;
  private Compiler compiler;
  private Linker linker;

  public IDE(String prjName, Preprocessor prep, Compiler comp, Linker link) {
    createProject(prjName);
    this.preprocessor = prep;
    this.compiler = comp;
    this.linker = link;
  }

  public void createProject(String prj_name){
    this.ProjectName = prj_name;
  }

  public Executable build(SourceCode[] sourceCodes){
    System.out.println("\nIDE에서 소스 코드 배열을 이용해서 빌드 후 실행");
    ObjectCode[] objs = new ObjectCode[sourceCodes.length];
    for (int i=0; i < sourceCodes.length; i++){
      objs[i] = compiler.compile(preprocessor.preprocess(sourceCodes[i]));
    }
    Executable exe = linker.link(ProjectName, objs);
    exe.execute();
    return exe;
  }

  public Executable build(List<SourceCode> sourceCodes){
    System.out.println("\nIDE에서 소스 코드 리스트를 이용해서 빌드 후 실행");
    List<ObjectCode> objList = new ArrayList<ObjectCode>();
    for (int i=0; i < sourceCodes.size(); i++) {
      objList.add(compiler.compile(preprocessor.preprocess(sourceCodes.get(i))));
    }
    Executable exe = linker.link(ProjectName, objList);
    exe.execute();
    return exe;
  } 
}