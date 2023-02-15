package Kotlin基础.pkg11_泛型与协变

class ParameterizedClass<A>(private val value: A) {
  fun getValue(): A {
    return this.value
  }
}

fun main() {
  val parameterizedClass = ParameterizedClass<String>("Hello World")
  val result = parameterizedClass.getValue()

  println(result is String)
}
