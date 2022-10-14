package casting

fun main() {
    val productLowStock: Byte = 20
    val productStock: Int = productLowStock.toInt()

    println(productStock)

    val numberString = "1"
    val numberByte: Byte = numberString.toByte()
    println("the number is $numberByte")

    val numberDouble = numberString.toDouble()
    println("the number double is: $numberDouble")

    val unicodeInt = 0x2764
    val unicodeChar = unicodeInt.toChar()
    val unicode = unicodeChar.toString()

    println(unicodeChar)
    println(unicode)

}