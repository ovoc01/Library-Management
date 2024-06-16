package noardev.demo.library.member

import noardev.demo.library.element.books.Books
import java.util.Date

class Member {
    lateinit var memberId:String
    lateinit var name:String
    lateinit var dateOfEntrance:Date
    var booksBorrowed:List<Books>? = null

    fun borrowBook(books: Books){
        TODO()
    }

    fun returnBook(books: Books){
        TODO()
    }
}