package oo

class Animal{
    var age: Int = 2
        get() = field
    set(value) {
field = value
    }
}

fun main(args: Array<String>){
val animal = Animal()
    animal.age = 2
    println(animal.age)
}