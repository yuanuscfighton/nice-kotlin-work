package Kotlin基础.pkg9_扩展

class CC {
  // 类里的函数优先级比同名的扩展函数优先级更高一些
  fun foo() {
    println("member")
  }

  // 扩展支持重载
  fun fn() {
    println("fn method")
  }
}

fun CC.foo() {
  println("member1")
}

fun CC.fn(i: Int) {
  println("fn method!!!")
}

fun main() {
  val cc = CC()
  cc.foo()

  cc.fn(1)
}
