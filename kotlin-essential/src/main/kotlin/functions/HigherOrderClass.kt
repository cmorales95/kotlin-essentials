package functions

fun main() {
    val isValid = isValid(5, {
        it  > 4
    })

    consultProductId { getOnNextProductIDBehavior() }
}

fun getOnNextProductIDBehavior(): (productId: String) -> Unit {
   return {
       println("Go to product Detail Screen with product Id: $it")
   }
}

fun isValid(x: Int, validate: (x: Int) -> Boolean): Boolean = validate(x)

fun consultProductId(onNext: (productId: String) -> Unit) {
    val productId = "WERT123"
    onNext(productId)
}