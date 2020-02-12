package io

fun main(args: Array<String>){
    println("Enter the word to guess")
    val word = readLine()
    if (word == null)
    {
        println("No word given, game ended")
        return
    }
    for (i in 1..100){
        println()
    }
    val letters = word.toLowerCase().toCharArray().toHashSet()
    val correctGuessess = mutableSetOf<Char>()
    var fails = 0

    while(letters != correctGuessess){
    printExploreWord(word,correctGuessess)
        println("#wrong guessess: $fails\n\n")
        print("guess letter:")
        val input = readLine()
    if(input ==null){
        continue
    }
        else if(input.length != 1){
        println("enter one latter")
        continue
    }
        if (word.toLowerCase().contains(input.toLowerCase())){
            correctGuessess.add(input[0].toLowerCase())
        }else{
            ++fails
        }
    }
    printExploreWord(word,correctGuessess)
    println("#wrong guessess: $fails\n\n")
    println("well done")
//    printExploreWord("kotlin", mutableSetOf('o','l'))
    //printExploreWord("kotlin", mutableSetOf('k','o','l'))
  //  printExploreWord("kotlin", mutableSetOf())

}

fun printExploreWord(word: String, correctGussess: Set<Char>){
for(character in word.toLowerCase()){
    if(correctGussess.contains(character)){
        print(character + "")
    }
    else{
        println("_")
    }
}
}