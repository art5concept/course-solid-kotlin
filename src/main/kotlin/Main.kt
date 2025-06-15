fun main() {
    // Como pasar parametros a la siguiente entrada de la funcion
    sendMessage(
        name = "Alexa"
    )
}

fun sendMessage(name: String = "User", message: String = sendText()) {
    println("Name = $name and message = $message")
}

fun sendText(): String {
    return "Some text"
}

// OUTPUT
// Name = User and message = hola