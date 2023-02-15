package Kotlin基础.pkg12_嵌套类内部类

// 嵌套类(Nested Class)
// 在一个类内部再定义一个类，类似Java的静态内部类
class OuterClass {

  private val str: String = "hello world"

  class NestedClass {
    fun nestedMethod() = "welcome"
  }
}

fun main() {

  // OuterClass.NestedClass()表示创建了NestedClass的一个对象
  println(OuterClass.NestedClass().nestedMethod())
}
/*
静态的只能访问静态的，不能访问非静态的
非静态的可以访问静态的，也能访问非静态的。
因为静态的不属于类本身，而是属于这个类的Class对象，
 */
