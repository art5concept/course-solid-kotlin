fun main() {
    val num1 = -5
    val num2 = -4
//Esto daria error porque si es string y la condicion cae en el else el 5 no es string
//    val text: String = if (num1 > 0 || num2 > 0) "The condition is true" else 5
//    println("$text")

    val text2 = if (num1 > 0 || num2 > 0) "The condition is true" else 5
    println("$text2")
}