package Kotlin基础.pkg15_委托.p2_属性委托.l2_非空属性

import kotlin.properties.Delegates

// 2.委托属性 -- 非空属性
// notNull适用于那些无法在初始化阶段就确定的属性值的场合
class MyPerson {
  var address: String by Delegates.notNull<String>()
}

fun main() {
  val myPerson = MyPerson()
  myPerson.address = "上海"
  println(myPerson.address)
}
