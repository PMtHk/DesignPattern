import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ObjectDynamicArray arr = new ObjectDynamicArray();
        for (int i = 0; i < 35; i++) {
            arr.add(i);
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.printf("data[%d] = %d\n", i, (int) arr.get(i));
        }
//------------------------------------------------------------------------------
        System.out.println("iterator 직접 사용");
        int j = 0;
        Iterator<Object> iter = arr.iterator();
        // arr 내부 iterator()는 Iterator<T> 제네릭스형태로 반환 따라서, 이경우에 Object.
        while (iter.hasNext()) {
            Object o = iter.next();
            System.out.printf("data[%d] = %d\n", j, (int) o); // unboxing
            j++;
        } // 이작업을 아래 forEach 가 똑같이 진행한다.
//------------------------------------------------------------------------------
        System.out.println("for-each 사용");
        int i = 0;
        for (Object o : arr) { // arr의 모든 요소를 하나씩 불러온다.
            // Iterable<E> 인터페이스를 구현하면, 위와 같이 사용할 수 있다.
            // Iterable 인터페이스 내에는 iterator() 가 구현이 되어있으면,
            // forEach에 사용가능한 컬렉션 사용가능.
            // 위 동작이 내부적으로 iterator 를 사용해서, 각 요소에 접근.
            System.out.printf("data[%d] = %d\n", i, (int) o);
            i++;
        }
    }
}