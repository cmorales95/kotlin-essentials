package exercises

fun main() {
    reviewTemperature()
}

fun validateCredentials() {
    val username = "cmorales"
    val password = "password"
    var isValid = false

    while (!isValid) {
        println("write the username")
        val inputUserName: String = readLine()!!

        println("write the password")
        val inputPassword: String = readLine()!!

        if (username == inputUserName && password == inputPassword) {
            isValid = true
        }
    }
    println("you are logged")
}

fun reviewTemperature() {
    println("set temperature")
    val input = readLine()!!
    val inputInt = input.toInt()

    when {
        inputInt <= 20 -> println("Use a jacket, is cold!")
        inputInt in 21..29 -> println("jacket is optional, mild weather")
        else -> println("use light clothing, is hot!")
    }
}