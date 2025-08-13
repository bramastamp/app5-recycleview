package com.smkth.app4_recycleview.utils

import com.smkth.app4_recycleview.model.Book

object DummyData {
    fun getBooks(): MutableList<Book> {
        return mutableListOf(
            Book("Laskar Pelangi", "Andrea Hirata", "2005"),
            Book("Bumi", "Tere Liye", "2014"),
            Book("Negeri 5 Menara", "Ahmad Fuadi", "2009"),
            Book("Perahu Kertas", "Dee Lestari", "2009"),
            Book("Pulang", "Tere Liye", "2015")
        )
    }
}
