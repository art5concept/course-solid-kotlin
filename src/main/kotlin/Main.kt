fun main() {
    val num1 = -5
    val num2 = -4

   val text = if (num1 > 0 || num2 > 0){
        "The condition is true"
    } else if (num1 < 0 || num2 < 0) {
        "The condition is false"
    } else {
        "The condition is other"
   }
    println("$text")
}