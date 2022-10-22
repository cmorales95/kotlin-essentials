package control_structures

import kotlin.system.measureNanoTime

fun main() {
    val forInRange = measureNanoTime {
        for (i in 0..1000) {
            i
        }
    }

    val forEachRange = measureNanoTime {
        (0..1000).forEach {
            it
        }
    }

    println("forInRange: $forInRange")
    println("forEachRange: $forEachRange")

    val objectsList = (0..1000).toList()

    val forInLIst = measureNanoTime {
        for (i in objectsList) {
            i
        }
    }

    val forEachList = measureNanoTime {
        objectsList.forEach {
            it
        }
    }
    println("forInList: $forInLIst")
    println("forEachList: $forEachList")
}