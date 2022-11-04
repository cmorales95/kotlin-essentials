package iteration

fun main() {
    println("MUTABLE LIST")
    val list = listOf(1,2,3)
    val anotherMutableList = list.toMutableList()

    val mutableList = mutableListOf(1, 2, 2, 3)
    mutableList.add(4)
    mutableList[2] = 3
    mutableList.removeAt(3)

    mutableList.forEach {
        println(it)
    }

    println()
    println("MAPS")
    val map = mutableMapOf(
        1 to "Cris",
        2 to "Aleja",
        3 to "Juanito"
    )
    map[4] = "Abuelo"

    map.forEach { (t, u) ->
        println("$t $u")
    }
}