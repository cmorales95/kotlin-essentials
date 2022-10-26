package functions

fun main() {
    val user = "cmorales"
    showMeWelcomeMessage("Hola")
    showMeWelcomeMessage("hi")
    showMeWelcomeMessage("Good Morning")
    showMeWelcomeMessage(message="Welcome", user=user)
}

fun showMeWelcomeMessage(message: String, user: String = "") = println("$message $user".trim()) 