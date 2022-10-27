package functions

fun main() {
    val printHello = {
        println("Hello Lambda")
    }

    printHello()

    val printText  = { text: String ->
        println(text)
    }

    printText("Hello Lambda 2")

    val addOneTo = { x: Int ->
        x + 1
    }

    println(addOneTo(4))

    val addFiveTo: (Int) -> Int = {
        it  + 5
    }

    println(addFiveTo(5))

    val sum: (Int, Int, String) -> Int = { x: Int, y: Int, _:String ->
        x + y
    }

    println(sum(5,3, ""))

    val sum2: (Int, Int, String) -> Int = { x: Int, y: Int, message:String ->
        val total = x + y
        println("$message $total")
        total
    }

    println(sum2(5,3, "the result is: "))
}