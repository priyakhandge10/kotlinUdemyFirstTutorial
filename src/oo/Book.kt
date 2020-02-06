package oo

class Book(val title: String, val author: String, val publicationYear: Int, var borrowed: Boolean) {

    fun borrow(): Boolean {
        if (!borrowed) {
            borrowed = true
            return true
        } else {
            println("Sorry, the book is already borrowed.")
            return false;
        }
    }


    fun returnBook(): Boolean {
        if (borrowed) {
            borrowed = false
            return true
        } else {
            println("The book was not borrowed so it cannot be returned.")
            return false
        }
    }

    fun print() {
        println("Book [title=$title, author=$author, publicationYear=$publicationYear]")
    }
}

fun main(args: Array<String>) {
    val book = Book("The One Thing", "Gary Keller", 2013, false)
    book.returnBook()   // Does not work because we did not borrow it yet.
    book.borrow()       // Let's borrow it.
    book.borrow()       // We cannot borrow again without returning.
    book.returnBook()   // Let's return it.
    book.print()        // And print it out.
}