package Kotlin基础.pkg11_泛型与协变

/*
 * 协变（covariant）与逆变（controvariant）

  List<Object> 接收Object类型的list
  List<String> 只接收String类型的list
  List<String>并不是List<Object>的子类型。i.e.
      List<String> list = new ArrayList();
      List<Object> list2 = list; // ❌ 编译失败

  因为如果可以这么做，当向list2中添加一个Date类型的元素，i.e. list2.add(new Date())，
  我们在从list中取出该元素的时候，会出现类型转换异常，i.e. String str = list.get(0); (❌ 会出现类型转换异常)

  解决方案: 通配符
  List<? extends Object> list ...

  举例:
      interface Collection<E> {
        // 将另外一个集合的内容，全部添加到这个集合的里面
        void addAll(Collection<E> items);
      }

      // ❌ demo
      void copyAll(Collection<Object> to, Collection<String> from) {
          to.addAll(from); ❌ 编译失败!!
      }

      编译失败原因: copyAll方法是将from集合的元素全部添加到to集合里面，但是from集合的元素类型是String，to集合的元素类型是Object
      根据上面的讲解的 Collection<String>并不是Collection<Object>的子类型


      // ✅ demo
      interface Collection<E> {
        void addAll(Collection<? extends E> items);
      }

      Collection<String>就是Collection<? extends Object>的子类型。
      ? extends Object 这种表示形式 限制了类型的上界。这种情况我们就叫作协变。


      如何理解协变的概念?
        我们只能从集合或者泛型的容器中 读取相关的内容，读取的时候，我们把每个元素当做问号extends后面的那个类型(如，? extends E，就当成E类型看待)，
         而不当成实际类型判断。

      super限制的是下界。
      List<? super String> 表示这个list只能是把String或者String层次体系上面的类型放到list中。 这种情况就叫作逆变。

      协变用于读取，逆变用于写入。

      我们如果只从中读取数据，而不往里面写入内容，那么这样的对象叫做生产者；如果只向里面写入数据，而不从中读取数据，那么这样的数据叫做消费者。

      生产者使用: ? extends E; 消费者使用: ? super E
 */
class MyClass<T>(t: T) {
  private var t: T

  init {
    this.t = t
  }

  fun get(): T = this.t
}

fun myTest(myClass: MyClass<String>) {
  val myObject: MyClass<String> = myClass

  println(myObject.get())
}

fun main() {
  val myClass = MyClass<String>("abc")
  myTest(myClass)
}
