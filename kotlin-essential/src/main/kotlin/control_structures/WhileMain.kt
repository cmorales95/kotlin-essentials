package control_structures

fun main() {
    val greetings = arrayOf("Hi", "Hello", "Welcome!", "Hola!", "Hallo")

    var i = 0
    while (i < greetings.size) {
        println(greetings[i])
        i++
    }
    println()

    var j = 0
    do {
       val greeting = greetings[j]
        println(greeting)
        j++
    } while (greeting.length > 2 && j < greetings.size)
    println()

    var k = 0
    while (k < greetings.size) {
        val greeting = greetings[k]

        if (greeting.length <= 2) break // continue

        println(greeting)
        k++
    }
}