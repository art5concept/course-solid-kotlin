fun main() {
    // Null pointer exception
    var text: String? = null

    // usando operador non null asserted !!.
    println(text!!.length)

    //OUTPUT


    //Exception in thread "main" java.lang.NullPointerException
    //	at MainKt.main(Main.kt:7)
    //	at MainKt.main(Main.kt)

}