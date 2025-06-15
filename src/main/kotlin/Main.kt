fun main() {
    sum(1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4)

}

fun sum(vararg numbers: Int) {
    numbers.forEach { println(it) }
}
