package functions

fun main() {
   val productPrices = doubleArrayOf(5.0, 3.0, 2.0)
    println(getProductPrices(productPrices, productPrices.size - 1))
}

fun getProductPrices(productPrices: DoubleArray, maxIndex: Int): Double {
    if (maxIndex == 0) return productPrices[0]

    return productPrices[maxIndex] + getProductPrices(productPrices, maxIndex - 1)
}