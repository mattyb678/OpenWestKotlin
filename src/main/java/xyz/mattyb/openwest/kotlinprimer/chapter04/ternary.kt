package xyz.mattyb.openwest.kotlinprimer.chapter04

import java.util.*

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
    val x = rand()
    val outcome = if (x > 75) "Awesome Sauce" else "Not too shabby"

    println("$x is $outcome")

    val maybe = maybeNull()

    val result = maybe ?: "Better luck next time"

    println(result)
}

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
private fun rand(): Int {
    return Random().nextInt(100)
}

private fun maybeNull() : String? {
    if (rand() % 2 == 0) {
        return null;
    }
    return "Totes not null"
}

