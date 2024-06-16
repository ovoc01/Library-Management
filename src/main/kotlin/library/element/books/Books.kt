package noardev.demo.library.element.books

abstract class Books {
    lateinit var bookId:String
    var title:String? = null
        set(value) {
            if (value == null) throw IllegalArgumentException("Book title shouldn't be null")
            field = value
        }

    lateinit var author:String

    private var isAvailable = true


    fun borrow(){
        this.isAvailable = false
    }

    fun returnBook(){
        this.isAvailable = true
    }
}