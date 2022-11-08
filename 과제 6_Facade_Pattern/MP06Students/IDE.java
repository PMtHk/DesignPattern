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
    ObjectCode[] objs = new ObjectCode[sourceCodes.length];
    for (int i=0; i < sourceCodes.length; i++){
      objs[i] = compiler.compile(preprocessor.preprocess(sourceCodes[i]));
    }
    Executable exe = linker.link(ProjectName, objs);
    return exe;
  }
  // Executable build(List<SourceCode> sourceCodes){}

}
