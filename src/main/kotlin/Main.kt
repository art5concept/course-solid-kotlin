fun main() {
    var number =0

    while (number<5){
        number++
        println(number)

        var i = 0

        while (i<3){
            if (i==2) break
            i++
            println("***$i")
        }
    }
}