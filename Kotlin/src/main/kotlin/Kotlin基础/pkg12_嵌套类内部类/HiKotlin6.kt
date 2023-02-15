package Kotlin基础.pkg12_嵌套类内部类

// demo:在外部类的外面，创建内部类的对象
class OuterClass6 {

  inner class NestedClass6(str: String) {
    init {
      println("str:$str")
    }
  }
}

fun main() {
  val nestedClass2: OuterClass6.NestedClass6 = OuterClass6().NestedClass6("hello world")
}
