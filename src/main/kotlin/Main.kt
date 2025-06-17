fun main() {
    // FUN CHALLENGE
    // Find even numbers in consecutive way and count the total using only null and just one "0"
    var n = zero()

    do {

        findEven(n)?.let { println(it) }

        n++

    } while (n < (two() * two() + (two() / two())) * two())

    println("The total of even numbers are: ${n / two()}")

}

fun findEven(a: Int): Int? {
    return if (a % two() == zero()) a else null
}

fun zero(): Int {
    return 0
}

fun one(): Int {
    return -zero().inv()
}

fun two(): Int {
    return one() + one()
}

// agregarle la funcion de poder usar introducir el upper limit usando la funciones del programa y texto