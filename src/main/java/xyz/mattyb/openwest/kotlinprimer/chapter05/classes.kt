package xyz.mattyb.openwest.kotlinprimer.chapter05

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
    val toCheck: Any = "Checking"

    val isAny = toCheck is Any
    val isNumber = toCheck is Number

    println("String is any: $isAny, is number: $isNumber")

    if (toCheck is String) {
        val upper = toCheck.toUpperCase()

        println(upper)
    }

    val indented = (toCheck as String).prependIndent()
    println(indented)
}