public class Sorter {
  SortAlg sortAlg;

  public Sorter(SortAlg sortAlg) {
    this.sortAlg = sortAlg;
  }

  public void setSorter(SortAlg sortAlg){
    this.sortAlg = sortAlg;
  }

  public void sort(int[] data) {
    sortAlg.sort(data);
  }
}
