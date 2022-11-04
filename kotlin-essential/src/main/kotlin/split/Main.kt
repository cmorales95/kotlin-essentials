package split

fun main() {
    val superMarket = listOf(
        "Milk",
        "Eggs",
        "Juice",
        "Meat",
        "Rice"
    )

    // take n firsts elements
    val breakfast = superMarket
        .take(3)
        .filterNot {
            it == "Eggs"
        }
    println(breakfast.joinToString())

    // take the last n elements
    val dinnerList = superMarket.drop(3)
    println(dinnerList.joinToString())


}
