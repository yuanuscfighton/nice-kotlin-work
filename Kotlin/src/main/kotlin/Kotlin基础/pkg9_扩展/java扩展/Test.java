package Kotlin基础.pkg9_扩展.java扩展;

public class Test {
  public void fn(Clazz clazz) {
    // 哪个foo()被调用，不取决于clazz声明的类型，而是clazz引用实际指向的类型。
    // 即，如果在运行期，传进来一个Clazz类型的实例，就会调用Clazz中的foo()方法，
    // 如果在运行期，传进来一个SubClazz类型的实例，就会调用SubClazz中的foo()方法
    clazz.foo();
  }
}
