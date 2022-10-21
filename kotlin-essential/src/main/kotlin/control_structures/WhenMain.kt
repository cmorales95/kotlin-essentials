package control_structures

import kotlin.math.roundToInt

fun main() {
    val isLogged = true
    when (isLogged) {
        true -> println("user is logged")
        false -> println("user is not logged")
    }

    println()

    val userStatus = 17
    val userStatusString = when (userStatus) {
        0 -> "Logged Out"
        1 -> "Logged In"
        -1 -> "User is down"
        in 10..20 -> "Inactive for $userStatus minute(s)"
        else -> "User not found"
    }

    println(userStatusString)

    val productPrices: Any = doubleArrayOf(15.99, 11.10, 45.99)
    val total = when (productPrices) {
        is DoubleArray -> productPrices.sum().roundToInt().toString()
        is Double -> productPrices.roundToInt().toString()
        is Int -> productPrices.toString()
        else -> productPrices.toString()
    }

    println("Totals: $total")

    val hasAddress = true
    val user = "cmorales"
    val message = when {
        isLogged and hasAddress -> "List of addresses of : $user"
        isLogged and !hasAddress -> "$user does not has a list of addresses"
        else -> ""
    }
    println(message)
}