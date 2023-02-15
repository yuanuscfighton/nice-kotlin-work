package Kotlin基础.pkg15_委托.p2_属性委托.l3_可观测属性

import kotlin.properties.Delegates

// 2.委托属性 -- 可观测属性
class Person {

  // param1: initialValue
  // param2: onChange: (property: KProperty<*>, oldValue: T, newValue: T) -> Unit
  //              onChange方法:
  //                  (1) 接收3个参数
  //                      (i) property (ii) oldValue (iii) newValue
  //                  (2) 返回值是Unit
  var age: Int by Delegates.observable(20) {
      prop, oldValue, newValue -> println("${prop.name}, oldValue: $oldValue, newValue: $newValue")
  }
}

fun main() {
  val p = Person()
  p.age = 30
  p.age = 40
}
