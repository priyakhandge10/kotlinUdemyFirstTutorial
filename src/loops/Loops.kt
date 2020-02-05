package loops

fun main(args: Array<String>) {
    for (i in 1..10) {
        println(i)
    }
    for (n in 1 until 10) {
        println(n)
    }

    val names = listOf("priya", "rahul","shelke")
    for(name in names)
    {
        println(name)
    }
}