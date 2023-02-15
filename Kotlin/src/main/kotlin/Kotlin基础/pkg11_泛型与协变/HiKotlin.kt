package Kotlin基础.pkg11_泛型与协变

// 密封类（sealed class）
// 密封类表示的是受限的类的层次结构，就是父类和子类的概念。
// 密封类是枚举类的扩展
// 密封类是可以有子类的，密封类和子类必须定义在同一个文件中。
// 密封类本身是抽象的，即不能实例化密封类。密封类内部可以包含一些抽象的成员。

// 密封类在when表达式中用的比较多，可以帮助我们省去else代码块。when要求一定要包含所有的情况。
sealed class Calculator

class Add : Calculator()

class Subtract : Calculator()

//class Multiply : Calculator()

fun calculator(a: Int, b: Int, cal: Calculator) = when (cal) {
  // 在when中就不需要写else了，相当于Calculator只有Add或者Subtract两个操作。
  is Add -> a + b
  is Subtract -> a - b
}

fun main() {
  println(calculator(1, 2, Add()))
  println(calculator(1, 2, Subtract()))
}
