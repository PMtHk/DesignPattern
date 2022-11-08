public class PreProcessorImpl implements Preprocessor {
  @Override
  public SourceCode preprocess(SourceCode srcCode) {
    String oldSrcCodeName = srcCode.getFileName();

    System.out.println("Preprocessing C code: " + oldSrcCodeName);
    SourceCode newSrcCode = new SourceCode("preprocessed_" + oldSrcCodeName);
    System.out.println("Generating a new C code: " + newSrcCode.getFileName());
    
    return newSrcCode;
  }
}
