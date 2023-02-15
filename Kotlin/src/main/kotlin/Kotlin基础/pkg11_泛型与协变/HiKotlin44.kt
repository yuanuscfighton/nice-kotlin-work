package Kotlin基础.pkg11_泛型与协变

class MyClass4<out T, in M>(t: T, m: M) {
  private val t: T
  private var m: M

  init {
    this.t = t
    this.m = m
  }

  fun get(): T = this.t
  fun set(m: M) {
    this.m = m
  }
}

fun myTest4(myClass: MyClass4<String, Number>) {
  val myObject: MyClass4<Any, Int> = myClass // 接收的泛型是Any, Int，但传进来的是String, Number
  // 读取的时候，以Any读取。写入的时候，要求Int，实际传入Number

  // Java代码中，应该这么写  ? extends Any, ? super Int
  println(myObject.get())
}

fun main() {
  val myClass = MyClass4<String, Number>("bbbbbb", 666)
  myTest4(myClass)
}
