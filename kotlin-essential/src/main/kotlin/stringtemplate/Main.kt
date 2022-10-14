package stringtemplate

fun main() {
    val price = 15.25
    val tax = 0.16

    val out = "the quantity de $price after taxes is: $${price - (1 + tax)}"
    println(out)

    val disclaimer = "the currency is \$MXN"
    println(disclaimer)

    val total = price.times(tax.plus(1))
    println(total.toFloat())
}