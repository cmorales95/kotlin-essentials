package control_structures

fun main() {
    for (i in 0..4) {
        println(i)
    }
    println()

    for (i in 'a'..'c') {
        println(i)
    }
    println()

    for (i in 'c'.downTo('a')) {
        println(i)
    }
    println()

    val greetings = arrayOf("Hi", "Hello", "Welcome!", "Hola!", "Hallo")
    for (greeting in greetings) {
        println(greeting)
    }
    println()

    for (i in 0..greetings.size - 1) {
        println(greetings[i])
    }
    println()

    for (i in greetings.indices) {
        println(greetings[i])
    }
    println()

    for (i in 0 until greetings.size) {
        println(greetings[i])
    }
    println()
}