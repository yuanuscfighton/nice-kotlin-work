package Kotlin基础.pkg12_嵌套类内部类

class OuterClass2 {

  fun getName(): String {

    // 定义一个局部嵌套类
    class LocalNestedClass {
      val name: String = "local-nested-class"
    }

    val localNestedClazz = LocalNestedClass()
    return localNestedClazz.name
  }
}

fun main() {
  println(OuterClass2().getName())
}
