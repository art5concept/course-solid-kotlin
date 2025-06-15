fun main() {
    // loops
    for (i in 1..4) {
        println("i = $i")
    }

    println("===============")

    for (i in 1 until 4) {
        println("i = $i")
    }

    println("===============")

    for (i in 4 downTo 1){
        println("i = $i")
    }

    println("===============")

    for (i in 1 until 10 step 2){
        println("i = $i")
    }


}
