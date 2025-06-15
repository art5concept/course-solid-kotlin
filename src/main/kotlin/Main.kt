fun main() {
    val num1 = -5
    val num2 = -4

    var text=
        if (num1 > 0 || num2 > 0) "The condition is true" else if (num1 < 0 || num2 < 0) "The condition is false" else "The condition is other"
    println("$text")

    text =
        if (num1 > 0 || num2 > 0) "The condition is true"  else "The condition is other"
    println("$text")
}