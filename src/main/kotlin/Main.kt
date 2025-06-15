fun main() {
    // Null pointer exception
    // se debe poner un ? al tipo para que kotlin permita que una variable
    // tenga dato null porque por defecto no se permite
    var text: String? = "name"
    text = null
    if (text != null){
        println("No es null, es $text")
    } else {
        println("Es null, $text")
    }


}