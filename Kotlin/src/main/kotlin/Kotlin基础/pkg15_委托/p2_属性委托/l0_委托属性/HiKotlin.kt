package Kotlin基础.pkg15_委托.p2_属性委托.l0_委托属性

import kotlin.reflect.KProperty

/**
 * @description 委托属性: 有4种情况在实际开发中比较有用:
 *                延迟属性、可观测属性、非空属性、map属性
 * @date        2022/11/8 10:07 PM
 */

// 对于被委托的属性，setter和getter方法就不是由kotlin编译器为其生成了，而是转移给委托方
class MyDelegate {
  // param1 thisRef: 被委托属性对象
  // param2 property: 被委托属性的本身
  operator fun getValue(thisRef: Any?, property: KProperty<*>): String =
    "$thisRef, your delegated property name is ${property.name}"

  operator fun setValue(thisRef: Any?, property: KProperty<*>, newVal: String) =
    println("$thisRef, new value is $newVal")
}

class MyPropertyClass {
  var str: String by MyDelegate()
  // 将str的setter和getter方法转移给MyDelegate(委托方)来做
}

fun main() {
  val myPropertyClass = MyPropertyClass()
  myPropertyClass.str = "hello world"
  println(myPropertyClass.str)
}
