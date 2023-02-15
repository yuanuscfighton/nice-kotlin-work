package Kotlin基础.pkg11_泛型与协变

class ParameterizedProducer<out T>(private val value: T) {
  fun get(): T {
    return this.value
  }
}

fun main() {
  val parameterizedProducer = ParameterizedProducer("Welcome")
  val myRef: ParameterizedProducer<Any> = parameterizedProducer

  // 上面👆两行代码相当于Java的
  // List<String> list = new ArrayList<>();
  // List<? extends Object> list1 = list; ? extends Object 相当于Kotlin中的out(协变)

  println(myRef is ParameterizedProducer<Any>) // true
}
