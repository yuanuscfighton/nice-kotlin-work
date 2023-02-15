package Kotlin基础.pkg15_委托.p2_属性委托.l4_map委托

import java.util.Date

/**
 * map委托: 将属性存储到map中
 *
 * 常见的应用场景:将属性值存储到map中，在这种情况中，可以将map实例作为委托，作为类中属性的委托。
 */
class Student(map: Map<String, Any?>) {

  val name: String by map

  val address: String by map

  val age: Int by map

  val birthday: Date by map
}

fun main() {
  val s = Student(mapOf(
    "name" to "张三",
    "address" to "上海",
    "age" to 20,
    "birthday" to Date()
  ))

  println(s.name)
  println(s.address)
  println(s.age)
  println(s.birthday)

}
