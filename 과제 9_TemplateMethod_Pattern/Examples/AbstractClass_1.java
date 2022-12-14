// 방법 1

abstract class AbstractClass_1 {
  final void templateMethod() {
    primitiveOperation1();
    primitiveOperation2();
    concreteOperation();
  }

  abstract void primitiveOperation1();

  abstract void primitiveOperation2();

  void concreteOperation() {
    // concreteOperation() 메소드 코드
  }
}