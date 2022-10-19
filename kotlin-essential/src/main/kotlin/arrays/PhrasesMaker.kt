package arrays

fun main() {
    val greetings = arrayOf("Hi", "Hello", "Welcome!", "Hola!", "Hallo")

    val introductions = arrayOf("my name is", "you can call me", "usually people call me", "I am")

    val names = arrayOf("Cristian", "Cris", "David")

    val randomIndexGreeting = (Math.random() * greetings.size).toInt()
    val randomIndexIntroductions = (Math.random() * introductions.size).toInt()
    val randomIndexNames = (Math.random() * names.size).toInt()

    val phrase = "${greetings[randomIndexGreeting]} ${introductions[randomIndexIntroductions]} ${names[randomIndexNames]}"
    println(phrase)
}