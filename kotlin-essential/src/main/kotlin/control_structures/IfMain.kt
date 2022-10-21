package control_structures

fun main() {
    val isLoggedin = true
    val hasAddress = false

    if (isLoggedin) {
        println("user is logged")
        if (hasAddress) {
            println("Show list of directions")
        } else {
            println("user does not has address")
        }
    } else {
        println("user is not logged")
    }

    val userLoggedInStatus = if (isLoggedin) "logged" else "not logged"
    println(userLoggedInStatus)
}