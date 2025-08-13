package com.smkth.app4_recycleview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.smkth.app4_recycleview.model.Book

class BookDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_detail)

        val imgBook: ImageView = findViewById(R.id.imgBookDetail)
        val tvTitle: TextView = findViewById(R.id.tvTitleDetail)
        val tvAuthor: TextView = findViewById(R.id.tvAuthorDetail)
        val tvYear: TextView = findViewById(R.id.tvYearDetail)

        // Ambil data dari intent
        val title = intent.getStringExtra("title")
        val author = intent.getStringExtra("author")
        val year = intent.getStringExtra("year")

        imgBook.setImageResource(R.drawable.book)
        tvTitle.text = title
        tvAuthor.text = author
        tvYear.text = year
    }
}
