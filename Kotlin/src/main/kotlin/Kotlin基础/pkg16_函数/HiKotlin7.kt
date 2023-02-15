package Kotlin学习.pkg16_函数

// 内联函数（inline function）

inline fun myCalculate(a: Int, b: Int) = a + b

fun main() {
  println(myCalculate(1, 2))
}

// javap -c HiKotlin7KT
