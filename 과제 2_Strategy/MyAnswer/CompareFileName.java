public class CompareFileName implements Comparable {
  public int compareTo(Object o1, Object o2) {
    String data1 = ((FileInfo) o1).getName();
    String data2 = ((FileInfo) o2).getName(); 
    return data1.compareTo(data2);
  }
}
