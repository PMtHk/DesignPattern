public class Sorter {
    private Comparable comparable = null;
    // comparable 기본값 없도록.

    public Sorter(Comparable comp) {
        this.comparable = comp;
    }

    public void setComparable(Comparable comp){
        comparable = comp;
    }

    public void bubbleSort(Object[] data){
        for (int i = 0; i < data.length - 1; i++){
            for (int j = 0; j < data.length - i - 1; j++){
                if ((comparable != null) && comparable.compareTo(data[j], data[j+1]) > 0) {
                    Object temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }
}