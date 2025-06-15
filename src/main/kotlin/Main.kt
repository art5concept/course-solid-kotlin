fun main() {
    var numero = 0

    outer@ while (numero<5){
        numero++
        println(numero)

        var i = 0

        while (i < 4) {
            if (i == 2 && numero==2) break@outer
            i++
            println("***$i")
        }
    }
}

//      OUTPUT
//        1
//        ***1
//        ***2
//        ***3
//        ***4
//        2
//        ***1
//        ***2