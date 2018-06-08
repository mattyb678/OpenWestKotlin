package xyz.mattyb.openwest.kotlinprimer.chapter03

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
    // Will it compile?
    // val salary: Long = null
    var salary: Long? = null

    println("salary before job: $salary")

    // Get a job
    salary = 1_000_000_000_000_000

    println("salary after job: $salary")

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
     */

    val bob = Employee()

    val headNameLength = bob?.department?.head?.name?.length

    println("head name length: $headNameLength")
}