fun main() {
    // Operators haciendo calculos con el operador de asignacion
    val x = 5.0
    val y = 3


    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    println("3 + 3 * 4 = ${3 + 3 * 4}")

    var result = x + y

    println("0 result = $result")


    // ESTA ES UNA FORMA INTERESANTE DE HACERLO NO SE PARA QUE SIRVE
    (result + 2).also { result = it }
    println("1 result = $result")

    result -= 2
    println("2 result = $result")

    result *= 2
    println("3 result = $result")

    result /= 2
    println("4 result = $result")

    result %= 2
    println("5 result = $result")


}