package Kotlin基础.pkg12_嵌套类内部类

// demo:在外部类的外面，创建嵌套类的对象
class OuterClass5 {

  // 嵌套类
  class NestedClass5 {
    init {
      println("NestedClass5构造块执行了")
    }
  }
}

fun main() {
  // nestedClass5类型是OuterClass5.NestedClass5
  val nestedClass5: OuterClass5.NestedClass5 = OuterClass5.NestedClass5()
}
