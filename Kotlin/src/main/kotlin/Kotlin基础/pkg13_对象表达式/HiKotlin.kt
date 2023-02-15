package Kotlin基础.pkg13_对象表达式

// 对象表达式(object expression)
// Java的匿名内部类在很多场景下都得到了大量使用
// Kotlin的对象表达式就是为了解决匿名内部类的一些缺陷而产生的
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 回顾:
// 1.匿名内部类是没有名字的类
// 2.Java的匿名内部类一定是继承了某个父类，或是实现了某个接口。匿名内部类不可能同时继承一个类并实现一个接口。要么继承一个类，要么实现一个接口。
// 3.Java运行时会将该匿名内部类当做它所实现的接口或是所继承的父类来看待。如，有一个接口A，同时定义了一个匿名内部类，这个匿名内部类实现了接口A。
//    对于Java运行时来说，就会将匿名内部类当作A的一个实例来看待。
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 对象表达式的格式:
// object [: 若干个父类型，中间用逗号分隔] {
//
// }


interface MyInterface {
  fun myPrint(i: Int)
}

fun main() {

  // 等号右边 返回的是一个匿名的内部类，这个类实现了MyInterface接口
  val myObject = object : MyInterface {
    override fun myPrint(i: Int) {
      println("i的值是$i")
    }
  }

  myObject.myPrint(100)
}
