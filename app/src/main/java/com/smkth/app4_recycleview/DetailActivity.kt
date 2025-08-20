package com.smkth.app4_recycleview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_buku)

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
