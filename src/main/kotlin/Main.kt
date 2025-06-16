fun main() {
    // FUN CHALLENGE
    // Find even numbers in consecutive way and count the total using only null and just one "0"
    var n = zero()

    do {

        if (findEven(n) != null) {
            println(findEven(n))
        }

        n++

    } while (n < (two() * two() + (two() / two())) * two())

    println("The total of even numbers are: ${n / two()}")

}

fun findEven(a: Int): Any? {
    return if (a % two(a) == zero(a)) a else null
}

fun zero(a: Int = 0): Int {
    return a xor a
}

fun one(a: Int = zero()): Int {
    return -zero(a).inv()
}

fun two(a: Int = zero()): Int {
    return one(a) + one(a)
}

// Techniques used - COMPLETE LIST:
// 0.[*] XOR Identity Law (a XOR a = 0) - Used to generate zero without using literal 0
// 1.[*] Two's Complement Arithmetic - Using bitwise NOT (~) and negation to create numbers
// 2.[*] Bitwise Operations - XOR and bitwise complement (.inv())
// 3.[*] Recursive Function Building - Building complex numbers from simpler ones
// 4.[*] Default Parameter Values - Using default parameters to avoid passing literals
// 5.[*] Nullable Return Types - Using Any? to represent success/failure states
// 6.[*] Arithmetic Progression - Building consecutive numbers without literals
// 7.[*] Functional Composition - Combining simple functions to create complex behavior
// 8.[*] String Interpolation - For output formatting
// 9.[*] Conditional Expression - Ternary-like if-else for return values


// Intermediate expressions used
// ~n invierte todos los bits de n (NOT bit a bit)
// -() calcula el complemento a dos, lo que efectivamente suma 1
// -n.inv()

// Resumen de la operacion
// Operation in esence
//            -(not 0) = -(not 0000 0000)
//            = -(1111 1111)     [1111 1111 es -1 en decimal]
//            = -(-1)
//            = +1
//            = 0000 0001

//    (n / (one(zero(n)) + one(zero(n))) + one(zero(n)))

//    (n / (two(n))) + one(n)

//    (n / ((-((zero(n)).inv())) + (-((n xor n).inv())))) + (-((n xor n).inv()))
