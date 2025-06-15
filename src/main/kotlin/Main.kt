fun main() {
    // Como pasar parametros a la siguiente entrada de la funcion
    sendMessage(message = "hola")
}

fun sendMessage(name: String = "User", message: String = "") {
    println("Name = $name and message = $message")
}

// OUTPUT
// Name = User and message = hola