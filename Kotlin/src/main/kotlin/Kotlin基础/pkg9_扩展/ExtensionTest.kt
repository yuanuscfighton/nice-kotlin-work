package Kotlin基础.pkg9_扩展

// 扩展: extension
class ExtensionTest {

  fun add(a: Int, b: Int) = a + b

  fun sub(a: Int, b: Int) = a - b
}

// 给ExtensionTest增加一个乘法操作
// multiply叫作ExtensionTest类的扩展函数(扩展方法)，
// 相当于ExtensionTest类拥有了multiply这个方法，实际上multiply方法并没有被插入到ExtensionTest类里面。
fun ExtensionTest.multiply(a: Int, b: Int) = a * b


fun main() {
  val extensionTest = ExtensionTest()
  println(extensionTest.add(1, 2))
  println(extensionTest.multiply(2, 3))
}


// 装饰模式的作用是，在不修改类的情况下，可以动态的给这个类增加一些额外的功能。
