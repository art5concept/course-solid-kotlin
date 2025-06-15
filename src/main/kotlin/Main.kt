fun main() {
    val max = getMax(2, 4)
    val min = getMin(2, 4)
    println(max)
    println(min)
}

fun getMax(a: Int, b: Int): Int {
    val max = if (a > b) a else b
    return max
}

fun getMin(a: Int, b: Int): Int {
    return if (a < b) a else b
}

// OUTPUT
// 4
// 2