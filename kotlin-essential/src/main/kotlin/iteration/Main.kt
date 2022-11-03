package iteration

fun main() {
    println("list")

    val list = listOf(1,2,3)
    println(list[0])

    list.forEach {
        println(it)
    }

    println()
    println("SET")
    val set = setOf(1,2,2,3)
    set.forEach {
        println(it)
    }

    val setNames = setOf("Cris","Cristian","Cris")
    setNames.forEach {
        println(it)
    }

    println()
    println("MAPS")
    val map = mapOf(
        1 to "Cris",
        2 to "Aleja",
        3 to "Juanito"
    )

    map.forEach { (t, u) ->
        println("$t $u")
    }
}