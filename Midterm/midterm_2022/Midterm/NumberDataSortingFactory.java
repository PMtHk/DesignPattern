public class NumberDataSortingFactory extends NumberData {
  public SortAlg createSortAlg(String sorter) {
    if (sorter.equals("Bubble")) {
      return new BubbleSort();

    } else if (sorter.equals("Insertion")) {
      return new InsertionSort();

    } else if (sorter.equals("Selection")) {
      return new SelectionSort();
    } 
    return null;
  }
}
