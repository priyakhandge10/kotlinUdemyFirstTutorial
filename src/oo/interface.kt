package oo

interface Driveable{
    fun drive()
}

interface Learnable{
    fun learn()
}
class car(val color: String): Driveable, Learnable{
    override fun drive() {
        println("driving a car")
    }

    override fun learn(){
        println("learnable interface")
    }
}

class motorcycle(val color: String): Driveable{
    override fun drive() {
        println("driving a motorcycle")
    }
}

fun main(args: Array<String>)
{
    val car:Driveable = car("pink")
    car.drive()
    val motorcycle:Driveable = motorcycle("blue")
    motorcycle.drive()
}