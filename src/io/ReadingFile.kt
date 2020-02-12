package io

import java.io.File
fun main(args: Array<String>)
{
    var lineNumber = 0
File("src/io/Read").forEachLine{
    ++lineNumber
    println("#$lineNumber: $it")
}
}