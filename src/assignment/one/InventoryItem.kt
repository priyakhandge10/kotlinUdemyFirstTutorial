package oo

abstract class InventoryItem(val title: String, val genre: String, var publication_year: Int, var borrowed: Boolean): Lendable{

    override fun borrow(){
        if(!borrowed){
            borrowed= true
        }
        else{
            println("this item already borrowed")
        }
    }
    override fun toString(): String {
        return "InventoryItem(title='$title', genre='$genre', publication_year=$publication_year, borrowed=$borrowed)"
    }

    abstract fun copy(): InventoryItem
}

class books(title: String,  genre: String,  publication_year: Int, val author: String):InventoryItem(title, genre,publication_year,false){
    fun read(){
        println("reading a book by $author")
    }

    override fun copy(): InventoryItem {
        val copy = books(title, genre, publication_year,author)
        copy.borrowed= this.borrowed
        return copy
    }
}

class DVD(title: String, genre: String, val length : Int,publication_year: Int): InventoryItem(title, genre, publication_year, false){
    fun watch(){
        println("watching a $title")
    }
    override fun copy(): InventoryItem{
        val copy = DVD(title, genre,length,publication_year)
        copy.borrowed= this.borrowed
        return copy
    }
}
