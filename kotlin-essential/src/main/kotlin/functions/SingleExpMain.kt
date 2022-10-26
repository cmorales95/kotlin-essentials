package functions

fun main() {
    val welcomeText = getWelcomeText()
    println(welcomeText)
    println(cleanText(welcomeText))
}

fun getWelcomeText(): String = "** welcome to the best experience **"

fun cleanText(text: String): String = text
    .removePrefix("**")
    .removeSuffix("**")
    .trim()