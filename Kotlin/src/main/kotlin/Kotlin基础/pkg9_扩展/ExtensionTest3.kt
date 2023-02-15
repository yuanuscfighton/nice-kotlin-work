package Kotlin基础.pkg9_扩展

// 扩展可以对一个可空类型进行扩展。
// 可空类型就是，一个类型后面加上一个问号

fun Any?.toString(): String {
  // 检查如果类型本身是空的话，就返回"null"字符串
  if (null == this) {
    return "null"
  }
  // 当前对象不是null
  return toString()
}
