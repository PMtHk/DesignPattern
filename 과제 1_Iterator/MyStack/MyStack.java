import java.util.ArrayList;
import java.util.Iterator;

public class MyStack<E> implements Iterable<E> {
  private ArrayList<E> list;
  //list.size() -> ArrayList 에서 지원. int 타입 반환.

// --------------------------------------------------
  class MyStackIterator<E> implements Iterator<E> {
    private int index; // 인덱스 관리.

    public MyStackIterator() { 
      index = list.size() - 1; // 위부터 아래로 Stack 이므로
    }

    public boolean hasNext() {
      return index >= 0;
    }

    public E next() {
      E e = (E) list.get(index); // typecast 를 반드시 하자.
      index--;
      return e;
    }
  }
// --------------------------------------------------
  public MyStack() {
    list = new ArrayList<E>();
  }

  public void push(E e) {
    list.add(e);
  }

  public E pop() {
    if (!isEmpty()){
      E e = list.get(list.size() -1); // 받아오고,
      list.remove(list.size() -1);  // 제거 -> 실질적으로 pop하기위함.
      return e;
    }
    return null;
  }

  public boolean isEmpty() {
    return list.size() == 0;
  }

  public Iterator<E> iterator() { // public 
    return new MyStackIterator<E>();
  }
}
