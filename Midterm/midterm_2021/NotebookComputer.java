public class NotebookComputer extends AbstractNotebookComputer {
  private String owner;

  public NotebookComputer(String ownerName) {
    this.owner = ownerName;
  }

  public String toString(){
    return owner + "`s Notebook computer";
  }

  @Override
  double requiredSpace() {
    return 250.0;
  }
}
