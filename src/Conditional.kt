package conditional
import java.util.*
fun main(args: Array<String>) {
val random = Random().nextInt(50)+1

    when(random){
        in 1..10 -> println("in 1 to 10:random")
        in 11..20 -> println("in 11 to 20: random")
        in 21..30 -> println("in 21 to 30:random")
        in 31..40 -> println("in 31 to 40: random")
    else -> println("over 40:random")
    }
}