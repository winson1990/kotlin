// IGNORE_BACKEND: JS_IR
// Auto-generated by GeneratePrimitiveVsObjectEqualityTestData. Do not edit!

val nx: Short? = 0.toShort()
val nn: Short? = null
val x: Short = 0.toShort()
val y: Short = 1.toShort()

fun box(): String {
    val ax: Short? = 0.toShort()
    val an: Short? = null
    val bx: Short = 0.toShort()
    val by: Short = 1.toShort()

    return when {
        nx != 0.toShort() -> "Fail 0"
        nx == 1.toShort() -> "Fail 1"
        !(nx == 0.toShort()) -> "Fail 2"
        !(nx != 1.toShort()) -> "Fail 3"
        nx != x -> "Fail 4"
        nx == y -> "Fail 5"
        !(nx == x) -> "Fail 6"
        !(nx != y) -> "Fail 7"
        nn == 0.toShort() -> "Fail 8"
        !(nn != 0.toShort()) -> "Fail 9"
        nn == x -> "Fail 10"
        !(nn != x) -> "Fail 11"
        ax != 0.toShort() -> "Fail 12"
        ax == 1.toShort() -> "Fail 13"
        !(ax == 0.toShort()) -> "Fail 14"
        !(ax != 1.toShort()) -> "Fail 15"
        ax != x -> "Fail 16"
        ax == y -> "Fail 17"
        !(ax == x) -> "Fail 18"
        !(ax != y) -> "Fail 19"
        ax != bx -> "Fail 20"
        ax == by -> "Fail 21"
        !(ax == bx) -> "Fail 22"
        !(ax != by) -> "Fail 23"
        an == 0.toShort() -> "Fail 24"
        !(an != 0.toShort()) -> "Fail 25"
        an == x -> "Fail 26"
        !(an != x) -> "Fail 27"
        an == bx -> "Fail 28"
        !(an != bx) -> "Fail 29"
        else -> "OK"
    }
}
