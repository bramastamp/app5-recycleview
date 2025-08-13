package com.smkth.app4_recycleview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // Data buku statis
        val bookList = mutableListOf(
            Book("Laskar Pelangi", "Andrea Hirata", "2005"),
            Book("Bumi", "Tere Liye", "2014"),
            Book("Negeri 5 Menara", "Ahmad Fuadi", "2009"),
            Book("Perahu Kertas", "Dee Lestari", "2009"),
            Book("Pulang", "Tere Liye", "2015")
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = BookAdapter(bookList)
    }
}
