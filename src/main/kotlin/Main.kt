fun main() {
    // Functions
    sayHello("felix",3)
    sayHello("daniel",5)
    sayHello("john",12)

    val hasInternetConnection = false
    if (hasInternetConnection){
        getData("Some data")
    } else {
        showMessage()
    }
}

fun sayHello(name: String, age: Int) {
    // los parametros de la funcion son val constantes no pueden cambiar
    println("Hello, $name! Your age is $age")
}

fun getData(data: String) {
    println("Your data is: $data")
}

fun showMessage() {
    println("There's no internet connection")
}