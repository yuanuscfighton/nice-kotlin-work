package Kotlin基础.pkg9_扩展.kotlin可见性

// 可见性
// Kotlin提供了4种可见性修饰符：private, protected, internal, public

// 什么都不写，默认是public
fun method() {

}

class Clazz

open class Clazz1 {

  private val b = 3

  // protected 当前类及其子类可以使用
  protected open val c = 4

  internal val d = 5
}

class SubClazz : Clazz1() {

}
