package Kotlin基础.pkg15_委托.p1_类委托

import kotlin.reflect.KProperty

// 2.委托属性:
// (1) 定义一个普通的属性
// (2) 自己定义一个委托类，

class MyPropertyClass {
  // 把str的setter/getter方法转移给委托的一方进行
  var str: String by MyDelegate()
}

// 自己定义一个委托类
class MyDelegate {

  // param1: 被委托属性所在的对象
  // param2: 被委托属性的本身
  operator fun getValue(thisRef: Any?, property: KProperty<*>) = "$thisRef, your delegated property name is ${property.name}"

  operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) = println("$thisRef, new value is $value")
}

fun main() {
  val myPropertyClass = MyPropertyClass()

  myPropertyClass.str = "hello world" // 输出: Kotlin基础.pkg15_委托.p1_类委托.MyPropertyClass@5197848c, new value is hello world

  println(myPropertyClass.str) // 输出: Kotlin基础.pkg15_委托.p1_类委托.MyPropertyClass@5197848c, your delegated property name is str
}

/**
 * 有4种情况在实际开发中比较有用:
 * 1.延迟属性: 第1次访问属性的时候，会执行一次计算，后面再次访问的时候，就不再执行计算了，而是使用第一次缓存的结果
 * 2.可观测属性: 当给一个属性赋值的时候，相当于这个属性有监听器，在赋值之前/之后，监听器都会收到通知
 * 3.非空属性:
 * 4.map属性:
 */
