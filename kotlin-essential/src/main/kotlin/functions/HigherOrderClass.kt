package functions

fun main() {
    val isValid = isValid(5, {
        it  > 4
    })

    println(isValid)
}

fun isValid(x: Int, validate: (x: Int) -> Boolean): Boolean = validate(x)