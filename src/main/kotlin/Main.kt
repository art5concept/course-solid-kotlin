fun main() {
    // Null pointer exception
    var text: String? = null

    text = "no nulo, ultimo maestro aire"
    var text2 = ""

    if (text != null) {
        text2 = text
    } else {
        text2 = "This variable is null"
    }

    println(text2)
//    Explicacion
//    si text es nulo se asigna "this variable is null...
//    sino es nulo se asigna el valor de text a text2


    //OUTPUT
    //no nulo, ultimo maestro aire

}