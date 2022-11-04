package transformation

fun main() {
    val languages = listOf(
        "Java",
        "c",
        "php",
        "swift"
    )

    val strLanguage = languages.map{
        "Language: $it"
    }

    strLanguage.forEach {
        println(it)
    }

    // (Int) -> (String)
    val numbers = listOf(1,2,3)
    val items = numbers.map {
        "$it. Item"
    }
    println(items.joinToString())


    val data = listOf("1", "2", "3", "*", "/", null)
    val dataNumbers = data.mapNotNull {
        it?.toIntOrNull()
    }
    println(dataNumbers)

    val sum = dataNumbers.sum()
    println(sum)
}