package functions

fun main() {
    // My fabulous app
    // welcome to the best experience
    // <name>

    val appName = "My fabulous app"
    println(addStarsFormat(appName, 5))

    val welcome = "Welcome to the best experience"
    println(addStarsFormat(welcome, 2))

    val name = "Cristian Morales"
    println(addStarsFormat(name, 1))
    println(addStarsFormat(name))
}

fun addStarsFormat(text: String, starsNumbers: Int): String {
    val textBuilder = StringBuilder(text)
    textBuilder.insert(0, " ")
    textBuilder.insert(textBuilder.length, " ")
    for (i in 0 until starsNumbers) {
        textBuilder.insert(0, "*")
        textBuilder.insert(textBuilder.length, "*")
    }

    return textBuilder.toString()
}

fun addStarsFormat(text: String): String = addStarsFormat(text, 2)