package arrays

fun main() {
    val greetings = arrayOf("Hi", "Hello", "Welcome!", "Hola!", "Hallo")
    val introductions = arrayOf("my name is", "you can call me", "usually people call me", "I am")
    val names = arrayOf("Cristian", "Cris", "David")

    val phrase = "${randomValue(greetings)} ${randomValue(introductions)} ${randomValue(names)}"
    println(phrase)
}

fun randomValue(data: Array<String>): String = data[(Math.random() * data.size).toInt()]