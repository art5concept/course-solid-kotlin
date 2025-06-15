fun main() {
    // Null pointer exception
    var text: String? = null

//    text = "no nulo, ultimo maestro airre"
    val text2 = text ?: "The text is null and i print this."

    println(text2)
//    Explicacion
//    si text es nulo se asigna "the text is null...
//    sino es nulo se asigna el valor de text a text2



    //OUTPUT
    //The text is null and i print this.

}