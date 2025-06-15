fun main() {
    println(sum(1, 2, 3, 4,1,2,3,4,1,2,3,4))

}

fun sum(vararg numbers: Int): Int {
    var result = 0
    for (number in numbers){
        result += number
    }
    return result
}
