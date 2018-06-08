package xyz.mattyb.openwest.kotlinprimer.chapter07

fun main(args: Array<String>) {
    /**
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     * Don't want to give away how functions work ;-)
     */
    val strings = listOf("Kotlin", "So", "Hot")

    println(strings.joinToString(". "))

    val ratings = mapOf("Java" to 70,
                        "Clojure" to 90,
                        "Kotlin" to 95)

    println(ratings.minBy { entry ->  entry.value })

    val range = 0..100

    println(range.sum())

    val max = range.filter { num -> num % 2 == 0 }
            .map { it * 2 }
            .max()

    println(max)
}