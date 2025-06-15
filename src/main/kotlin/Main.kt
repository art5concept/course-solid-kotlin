fun main() {
// Functions Overloading es hacer funciones con el mismo nombre pero con distintos tipos o numero de parametros
    val min = getMin(3, 4, 2)
    println(min)
}

fun getMin(a: Int, b: Int) = if (a < b) a else b
fun getMin(a: Int, b: Int, c: Int): Int {
    if (a <= b && a <= c) {
        return a
    } else if (b <= a && b <= c) {
        return b
    } else {
        return c
    }

}

fun getMin(a: Double, b: Double) = if (a < b) a else b


// OUTPUT
// 2