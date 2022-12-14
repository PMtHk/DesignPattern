// 방법 2

public class AbstractClass_2 {
  final void templateMethod() {
    primitiveOperation1();
    primitiveOperation2();
    concreteOperation();
    hook();
  }

  abstract void primitiveOperation1();

  abstract void primitiveOperation2();

  final void concreteOperation() {
    // concreteOperation() 메소드 코드
  }

  void hook() {
  }
}
