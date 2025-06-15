import kotlin.math.sin

fun main() {
    var number = 0
    while (number < 5){
        println(number)
        number++
    }

    println("===== 1")
    // forma de hacer lo anterior en forma mas resumida
    number = 0
    while (number < 5) println(number++)

    println("====== 2")
    // prefix en un ciclo while
    number = 0
    while (number < 5) println(++number)

    println("===== 3")
    // hace el codigo al menos una vez inclusive si el while esta siendo falso
    number = 0
    do {
        println(number)
        number++
    } while (number < 2)

    println("====== 4")
    number = 0

    while (number<10){
        number++
        if (number == 7){
            continue
        }
        println(number)
    }

    println("====== 5")
    number = 0

    while (number<10){
        number++
        if (number >2 && number < 8){
            continue
        }
        println(number)
    }

    println("====== 6")
    number = 0

    while (number<10){
        number++
        if (number in 3..7){
            continue
        }
        println(number)
    }

    println("====== 7")
    number = 0

    while (number<10){
        number++
        if (number == 4) {
            break
        }
        println(number)
    }

    println("====== 8")
    for (i in 0..10){
        if (i in 3..8){
            continue
        }
        println(i)
    }



    println("====== 9")
    for (i in 0..10){
        if (i ==  4){
            break
        }
        println(i)
    }

}
// OUTPUT
//        0
//        1
//        2
//        3
//        4
//        ===== 1
//        0
//        1
//        2
//        3
//        4
//        ====== 2
//        1
//        2
//        3
//        4
//        5
//        ===== 3
//        0
//        1
//        ====== 4
//        1
//        2
//        3
//        4
//        5
//        6
//        8
//        9
//        10
//        ====== 5
//        1
//        2
//        8
//        9
//        10
//        ====== 6
//        1
//        2
//        8
//        9
//        10
//        ====== 7
//        1
//        2
//        3
//        ====== 8
//        0
//        1
//        2
//        9
//        10
//        ====== 9
//        0
//        1
//        2
//        3