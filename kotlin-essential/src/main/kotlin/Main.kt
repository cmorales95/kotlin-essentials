fun main() {
}

fun numbers() {
    // byte
    val age: Byte = 27
    val newAge: Byte = 127

    // int
    val productId: Int = 2_147_483_647

    // long
    var userId = 9_223_372_036_854_775
}

fun decimals() {
    val myDouble = 2.12345678901234567
    val myFloat = 2.12345678901234567F

    println(myDouble)
    println(myFloat)
}

fun booleans() {
    val isLoggedIn = true
    val hasAddress = false

    println(isLoggedIn && hasAddress)
    println(isLoggedIn.and(hasAddress))
    println(isLoggedIn and hasAddress)

    println(!isLoggedIn)
    println(isLoggedIn.not())
}


fun char() {
    val myChar = 'a'
}
