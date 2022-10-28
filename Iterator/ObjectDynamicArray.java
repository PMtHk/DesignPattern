import java.util.Iterator;

public class ObjectDynamicArray implements Iterable<Object> {
    private int length;
    private int capacity;
    private Object[] data;

    public ObjectDynamicArray() {
        length = 0;
        capacity = 10;
        data = new Object[10];
    }

    public boolean add(Object t) {
        if (length >= capacity) {
            boolean b = resizeArray();
            if (b == false)
                return false;
        }
        data[length] = t;
        length++;
        return true;
    }

    public Object get(int index) {
        if (index >= 0 && index < length) {
            return data[index];
        }
        return null;
    }

    public int size() { return length; }

    private boolean resizeArray() {
        Object[] data2 = new Object[capacity + 10];
        if (data2 == null)
            return false;
        for (int i = 0; i < length; i++) {
            data2[i] = data[i];
        }
        capacity += 10;
        data = data2;
        return true;
    }

    public Iterator<Object> iterator() {
        return new ODAIterator(this);
    }
}
