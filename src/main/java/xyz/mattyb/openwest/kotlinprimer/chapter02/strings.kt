package xyz.mattyb.openwest.kotlinprimer.chapter02

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
    val firstName = "matt"
    val lastName = "berteaux"
    val name = "${firstName.capitalize()} ${lastName.capitalize()}"
    println(name)

    val haiku = """
        |Five syllables here.
        |Seven more syllables here.
        |Are you happy now?
    """.trimMargin()

    println("\"$haiku\"")
}