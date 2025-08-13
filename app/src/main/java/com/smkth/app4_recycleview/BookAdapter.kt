package com.smkth.app4_recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(
    private val books: MutableList<Book>
) : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgBook: ImageView = itemView.findViewById(R.id.imgBook)
        val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
        val tvAuthor: TextView = itemView.findViewById(R.id.tvAuthor)
        val tvYear: TextView = itemView.findViewById(R.id.tvYear)
        val btnDelete: Button = itemView.findViewById(R.id.btnDelete)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_book, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = books[position]
        holder.tvTitle.text = book.judul
        holder.tvAuthor.text = book.penulis
        holder.tvYear.text = book.tahun
        holder.imgBook.setImageResource(R.drawable.book)

        // Hapus item ketika tombol ditekan
        holder.btnDelete.setOnClickListener {
            books.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position, books.size)
        }
    }

    override fun getItemCount(): Int = books.size
}
