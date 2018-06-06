// IGNORE_BACKEND: JS_IR
class Dummy {
  override fun equals(other: Any?) = true
}

data class A(val v: Any?)

fun box() : String {
  val a = A(Dummy())
  val b: A? = null
  return if(a != b && b != a) "OK" else "fail"
}