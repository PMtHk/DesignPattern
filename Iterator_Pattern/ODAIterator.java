import java.util.Iterator;

class ODAIterator implements Iterator {
    ObjectDynamicArray arr;
    int index;

    public ODAIterator(ObjectDynamicArray arr) {
        this.arr = arr;
        index = 0;
    }

    public boolean hasNext() {
        return index < arr.size();
    }

    public Object next() {
        Object o = arr.get(index);
        index++;
        return o;
    }
}