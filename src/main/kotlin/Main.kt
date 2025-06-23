fun main(){
    // ARRAYS

    val names: Array<String> = arrayOf("John","Stephen","Megan")

    val names1 = arrayOf("John","Stephen","Megan")

    names[2] = "Alex"
    println("First element: ${names[0]}")
    println("First element: ${names[1]}")
    println("First element: ${names[2]}")


    val mixedElements  = arrayOf(4,5,6,7,4,"Name 1", 'a')

    println("The size of the array is: ${names.size}")

    for (i in mixedElements) {
        if (i is String) {
            println(i)
        }

    }

    for ( nam in names1) {
        print(nam)
        print(",")
    }
    println("")
}