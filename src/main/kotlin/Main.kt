fun main() {
    val max = getMax(2, 4)
    val min = getMin(2, 4)
    val min2 = getMin2(2, 4)
    println(max)
    println(min)
    println(min2)
}

fun getMax(a: Int, b: Int): Int {
    val max = if (a > b) a else b
    return max
}

// forma consisa

fun getMin(a: Int, b: Int): Int {
    return if (a < b) a else b
}

// aun mas conciso si solo se tiene una linea de codigo en funciones asi

fun getMin2(a: Int, b: Int) = if (a < b) a else b


// OUTPUT
// 4
// 2