import java.util.Iterator;

public class ObjectDynamicArray implements Iterable<Object> {
    //처음 생성시 10개 씩 공간 할당.
    private int length;
    private int capacity;
    private Object[] data;
//------------------------Iterator 구현부-----------------------
    class ODAIterator implements Iterator<Object> {
        int index;

        public ODAIterator() {
            index = 0;
        }

        public boolean hasNext() { return index < length; }

        public Object next() {
            Object o = get(index); // get 구현 필요 -> 아래 구현.
            // Object o = data[index]; 형태로 구현 가능 : 내부클래스이므로!
            index++;
            return o;
        }
    }
//------------------------------------------------------------
    public ObjectDynamicArray() {
        length = 0;
        capacity = 10;
        data = new Object[10];
    }

    public boolean add(Object t) {
        if (length >= capacity) {
            boolean b = resizeArray();
            if (b == false)
                return false; // Dead Code
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
        return new ODAIterator();
    }
}
