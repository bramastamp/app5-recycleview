package com.smkth.app4_recycleview.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.smkth.app4_recycleview.model.Buku
import com.smkth.app4_recycleview.R
import com.smkth.app4_recycleview.DetailActivity

class BukuAdapter(
    private val context: Context,
    private val bukus: MutableList<Buku>
) : RecyclerView.Adapter<BukuAdapter.BookViewHolder>() {

    class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgBook: ImageView = itemView.findViewById(R.id.imgBook)
        val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
        val tvAuthor: TextView = itemView.findViewById(R.id.tvAuthor)
        val tvYear: TextView = itemView.findViewById(R.id.tvYear)
        val btnDelete: Button = itemView.findViewById(R.id.btnDelete)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_buku, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = bukus[position]
        holder.tvTitle.text = book.judul
        holder.tvAuthor.text = book.penulis
        holder.tvYear.text = book.tahun
        holder.imgBook.setImageResource(R.drawable.book)

        // Klik item → buka detail
        holder.itemView.setOnClickListener {
            Toast.makeText(context, "Memilih: ${book.judul}", Toast.LENGTH_SHORT).show()

            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("title", book.judul)
            intent.putExtra("author", book.penulis)
            intent.putExtra("year", book.tahun)
            context.startActivity(intent)
        }

        // Hapus item ketika tombol ditekan
        holder.btnDelete.setOnClickListener {
            // Buat dialog konfirmasi
            androidx.appcompat.app.AlertDialog.Builder(context)
                .setTitle("Konfirmasi Hapus")
                .setMessage("Apakah Anda yakin ingin menghapus \"${book.judul}\"?")
                .setPositiveButton("Ya") { _, _ ->
                    bukus.removeAt(position)
                    notifyItemRemoved(position)
                    notifyItemRangeChanged(position, bukus.size)
                    Toast.makeText(context, "Buku dihapus", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("Batal", null)
                .show()
        }

    }

    override fun getItemCount(): Int = bukus.size
}
