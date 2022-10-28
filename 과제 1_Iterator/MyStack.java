import java.util.ArrayList;
import java.util.Iterator;

public class MyStack<T> implements Iterable<T> {

  private ArrayList<T> list;

  class MyStackIterator<T> implements Iterator<T>{
    private int index;

    public MyStackIterator() {
      index = list.size() - 1;
    }

    public boolean hasNext() {
      return index >= 0;
    }

    public T next() {
      T t = (T) list.get(index);
      index--;
      return t;
    }

  }

  public MyStack() {
    list = new ArrayList<T>();
  }

  public void push(T t) {
    list.add(t);
  }

  public T pop() {
    if (!isEmpty()) {
      T t = list.get(list.size() - 1);
      list.remove(list.size() - 1);
      return t;
    }
    return null;
  }
  
  public boolean isEmpty() {
    return list.size() == 0;
  }

  public Iterator<T> iterator() {
    return new MyStackIterator<T>();
  }
}
