package io

import java.util.*

fun main(args: Array<String>){
    val number = Random().nextInt(100)+1
    var input : String?
    var guess = -1

    while ( guess != number){
        print("guess a number between 1 to 100")
        input = readLine()

        if(input != null)
        {
            guess = input.toInt()
        }
        if(guess < number){
            println("too low")
        }
        else if(guess > number){
            println("too large")
        }
        else{
            println("you won")
        }
    }
}
