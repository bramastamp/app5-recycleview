# Project Recycle View - Daftar Buku Perpustakaan
Materi ini membahas pembuatan aplikasi Android sederhana bertema Daftar Buku Perpustakaan menggunakan Android Studio dengan beberapa fitur utama, yaitu Splash Screen sebagai tampilan pembuka dengan logo/nama perpustakaan selama 2–3 detik, RecyclerView untuk menampilkan daftar minimal 5 buku beserta judul, penulis, tahun terbit, dan icon dalam CardView, serta Intent untuk berpindah ke halaman detail saat buku dipilih. Selain itu, aplikasi menampilkan Toast sebagai notifikasi singkat ketika buku dipilih.

## 👥 Tim
1.Bramasta Marga Pangukuh (06)  
2.Chyntia Fitri Ramadhani (09)  
3.Faradhina Nazura (14)  
4.Imam Maulana Malik (17)   
5.Jovita Acid Rahayu (18)  

## 🔧 Teknologi
- Kotlin
- Android Studio
- Git + GitHub
  
## 📱 Fitur yang ada
**📂 SplashScreen**  

<img width="1053" height="566" alt="Screenshot 2025-08-19 181638" src="https://github.com/user-attachments/assets/6e6181ff-f4e2-4da9-9144-420d81fb9106" />

Kode program tersebut merupakan implementasi Splash Screen pada aplikasi Android menggunakan bahasa Kotlin. Kelas SplashActivity mewarisi AppCompatActivity dan di dalam metode onCreate() dipanggil setContentView(R.layout.activity_splash) untuk menampilkan layout splash. Selanjutnya digunakan Handler(Looper.getMainLooper()).postDelayed() untuk memberikan jeda selama 3000 milidetik (3 detik) sebelum berpindah ke halaman utama (MainActivity). Di dalam blok postDelayed, dibuat sebuah Intent untuk berpindah dari SplashActivity menuju MainActivity, kemudian dijalankan dengan startActivity(intent). Setelah itu dipanggil finish() agar SplashActivity ditutup dan tidak bisa diakses kembali saat pengguna menekan tombol back. Dengan logika ini, splash screen akan otomatis muncul selama 3 detik ketika aplikasi pertama kali dibuka, lalu secara otomatis berpindah ke halaman utama.
Untuk file layout splashscreen ada activity_splash.xml, fungsinya untuk menentukan tampilan layar pembuka (splashscreen) saat aplikasi pertama kali dijalankan.  

**📂 RecyclerView**   

<img width="602" height="133" alt="Screenshot 2025-08-19 183506" src="https://github.com/user-attachments/assets/500ec1ed-cddb-42e0-8d5c-16b17c78a409" />  

Kode tersebut merupakan deklarasi komponen RecyclerView di dalam file layout XML Android. RecyclerView adalah widget yang digunakan untuk menampilkan daftar data dalam jumlah banyak secara lebih efisien dibandingkan ListView. Pada kode ini, diberikan atribut android:id="@+id/recyclerView" yang berfungsi sebagai identitas unik sehingga RecyclerView dapat diakses dan dihubungkan dengan kode Kotlin/Java pada Activity atau Fragment. Sementara itu, atribut android:layout_width="match_parent" dan android:layout_height="match_parent" berarti ukuran RecyclerView akan menyesuaikan penuh dengan lebar dan tinggi layar (mengisi seluruh area yang tersedia). Dengan pengaturan ini, RecyclerView siap digunakan untuk menampilkan daftar item buku dalam bentuk list atau grid sesuai kebutuhan aplikasi.



<img width="971" height="409" alt="Screenshot 2025-08-19 183624" src="https://github.com/user-attachments/assets/49dd00d1-54c0-42fa-b861-35d380f16b4b" />  

Kode program tersebut adalah implementasi Adapter untuk RecyclerView bernama BookAdapter, yang berfungsi menghubungkan data buku dengan tampilan daftar di aplikasi. BookAdapter menerima dua parameter, yaitu context untuk mengakses resource aplikasi, dan books berupa daftar buku (MutableList<Book>) yang akan ditampilkan. Kelas ini mewarisi RecyclerView.Adapter dengan BookViewHolder sebagai ViewHolder. Di dalamnya terdapat kelas BookViewHolder yang bertugas mereferensikan elemen-elemen tampilan dari item buku, seperti imgBook (ImageView untuk menampilkan icon atau cover buku), tvTitle (TextView untuk judul buku), tvAuthor (TextView untuk penulis), tvYear (TextView untuk tahun terbit), serta btnDelete (Button untuk menghapus data atau melakukan aksi tertentu). Semua komponen tersebut dihubungkan dengan layout menggunakan findViewById, sehingga setiap item buku dalam RecyclerView dapat diisi dengan data yang sesuai. Dengan struktur ini, BookAdapter menjadi penghubung antara data list buku dengan tampilan item yang ditampilkan secara dinamis dalam RecyclerView.
Untuk file layout tampilan untuk satu item ada di file item_book.xml  

**📂 Intent ke Detail Activity**

<img width="886" height="823" alt="Screenshot 2025-08-19 181848" src="https://github.com/user-attachments/assets/f83b7b64-1dd5-4791-8e4b-db86efc4c511" />

Kode program tersebut merupakan implementasi kelas BookDetailActivity yang berfungsi untuk menampilkan detail informasi sebuah buku ketika pengguna memilih item dari daftar RecyclerView. Kelas ini mewarisi AppCompatActivity dan pada metode onCreate() memanggil setContentView(R.layout.activity_book_detail) untuk menampilkan layout detail buku. Di dalamnya, beberapa komponen UI dihubungkan dengan elemen layout menggunakan findViewById, yaitu imgBook (ImageView untuk ikon/cover buku), tvTitle (TextView judul buku), tvAuthor (TextView penulis buku), dan tvYear (TextView tahun terbit). Selanjutnya, data dikirim dari Activity sebelumnya melalui Intent dan diambil menggunakan intent.getStringExtra() untuk mendapatkan nilai title, author, dan year. Nilai-nilai tersebut kemudian diatur ke dalam komponen UI, dengan imgBook.setImageResource(R.drawable.book) untuk menampilkan gambar buku, serta tvTitle.text, tvAuthor.text, dan tvYear.text untuk menampilkan data sesuai dengan buku yang dipilih. Dengan demikian, setiap kali pengguna memilih sebuah buku, Activity ini akan menampilkan detail lengkapnya.

**📂 Toast Message**

<img width="1110" height="547" alt="Screenshot 2025-08-19 184418" src="https://github.com/user-attachments/assets/8539ab84-aa67-4d34-a6db-496285800cf0" />

Kode tersebut merupakan implementasi dari fungsi onBindViewHolder dalam RecyclerView.Adapter yang bertugas untuk menghubungkan data buku dengan tampilan item pada daftar. Pertama, objek book diambil dari books[position], kemudian data judul, penulis, dan tahun buku diatur ke dalam komponen TextView (tvTitle, tvAuthor, tvYear), sedangkan ikon buku ditampilkan melalui imgBook.setImageResource(R.drawable.book). Selanjutnya, ditambahkan aksi klik pada setiap item dengan holder.itemView.setOnClickListener. Saat item diklik, akan muncul notifikasi singkat menggunakan Toast.makeText yang menampilkan teks “Memilih: [judul buku]” sebagai feedback kepada pengguna. Setelah itu, dibuat Intent untuk berpindah ke BookDetailActivity, di mana data buku (judul, penulis, tahun) dikirim melalui putExtra agar dapat ditampilkan di halaman detail. Akhirnya, Activity baru dijalankan menggunakan context.startActivity(intent). Dengan demikian, kode ini mengatur tampilan item buku sekaligus menyediakan interaksi berupa navigasi ke halaman detail ketika pengguna memilih salah satu buku.

**📂 Dialog Box (Konfirmasi)**  

<img width="1045" height="509" alt="Screenshot 2025-08-19 182531" src="https://github.com/user-attachments/assets/ce6e7813-77e3-43de-8bc4-479cb9dc010c" />

Kode program tersebut merupakan implementasi logika penghapusan data pada RecyclerView ketika tombol Delete ditekan. Pertama, dipasang event listener setOnClickListener pada tombol btnDelete yang ada di setiap item. Saat tombol ditekan, dibuat sebuah dialog konfirmasi menggunakan AlertDialog.Builder(context) dengan judul "Konfirmasi Hapus" dan pesan "Apakah Anda yakin ingin menghapus [judul buku]?", di mana [judul buku] diambil dari properti book.judul. Jika pengguna menekan tombol positif ("Ya"), maka item buku pada posisi tersebut akan dihapus dari daftar books dengan books.removeAt(position). Setelah itu, adapter diberi tahu bahwa data telah berubah menggunakan notifyItemRemoved(position) agar RecyclerView memperbarui tampilannya, serta notifyItemRangeChanged(position, books.size) untuk memperbarui posisi item lainnya agar tetap sinkron. Sebagai umpan balik, ditampilkan notifikasi Toast singkat dengan pesan "Buku dihapus". Sebaliknya, jika pengguna menekan tombol negatif ("Batal"), maka dialog akan ditutup tanpa melakukan perubahan apa pun. Dengan demikian, kode ini memastikan penghapusan data dilakukan dengan aman melalui konfirmasi pengguna dan pembaruan tampilan RecyclerView secara dinamis.


## Cara Kerja RecyclerView
Cara kerja project Daftar Buku Perpustakaan ini dimulai dari Splash Screen, yaitu tampilan awal yang muncul selama 2–3 detik untuk menampilkan logo atau nama aplikasi sebelum masuk ke halaman utama. Setelah itu pengguna diarahkan ke halaman utama yang menggunakan RecyclerView untuk menampilkan daftar buku dengan informasi berupa judul, penulis, tahun terbit, serta ikon buku yang dikemas dalam CardView agar terlihat rapi. Setiap item buku dapat diklik oleh pengguna, dan saat itu akan muncul Toast sebagai notifikasi singkat berisi judul buku yang dipilih. Selanjutnya, aplikasi membuat Intent untuk membuka BookDetailActivity, yaitu halaman detail buku. Pada saat berpindah Activity, data buku seperti judul, penulis, dan tahun dikirim menggunakan putExtra dan kemudian ditampilkan pada layout detail. Selain itu, tersedia tombol dengan Dialog Box konfirmasi sebelum benar-benar membuka detail buku, sehingga pengguna lebih sadar terhadap pilihan yang diambil. Dengan alur kerja ini, aplikasi mampu menampilkan daftar buku sekaligus detailnya dengan interaksi sederhana namun jelas.


## Struktur File

1. DaftarBukuPerpustakaan/  
2. │  
3. ├── app/  
4. │   ├── src/  
5. │   │   ├── main/  
6. │   │   │   ├── java/com/smkth/app4_recyclerview/  
7. │   │   │   │   ├── SplashActivity.kt         // Activity untuk Splash Screen  
8. │   │   │   │   ├── MainActivity.kt           // Activity utama menampilkan RecyclerView  
9. │   │   │   │   ├── BookDetailActivity.kt     // Activity untuk menampilkan detail buku  
10. │   │   │   │   ├── BookAdapter.kt            // Adapter RecyclerView  
11. │   │   │   │   ├── Book.kt                   // Model data buku (judul, penulis, tahun)  
12. │   │   │   │  
13. │   │   │   ├── res/  
14. │   │   │   │   ├── drawable/  
15. │   │   │   │   │   ├── book.png              // Icon buku  
16. │   │   │   │   │   └── splash_logo.png       // Logo untuk Splash Screen  
17. │   │   │   │   │  
18. │   │   │   │   ├── layout/  
19. │   │   │   │   │   ├── activity_splash.xml   // Layout untuk SplashActivity  
20. │   │   │   │   │   ├── activity_main.xml     // Layout utama berisi RecyclerView  
21. │   │   │   │   │   ├── activity_book_detail.xml // Layout detail buku  
22. │   │   │   │   │   └── item_book.xml         // Layout item untuk RecyclerView (CardView)  
23. │   │   │   │   │  
24. │   │   │   │   ├── values/  
25. │   │   │   │   │   ├── colors.xml            // Warna aplikasi  
26. │   │   │   │   │   ├── strings.xml           // Teks string aplikasi  
27. │   │   │   │   │   └── styles.xml            // Tema aplikasi  
28. │   │   │   │  
29. │   │   │   └── AndroidManifest.xml           // Manifest aplikasi  
30. │   │   │  
31. │   │   └── test/                             // Unit test (opsional)  
32. │   │  
33. │   └── build.gradle                          // Konfigurasi Gradle module app  
34. │  
35. ├── build.gradle                              // Konfigurasi Gradle project  
36. ├── settings.gradle                           // Setting module project  
37. └── gradle.properties                         // Properti Gradle


📌 Alur File Penting:

- SplashActivity.kt → Menampilkan logo/nama selama 3 detik.

- MainActivity.kt → Memuat RecyclerView daftar buku.

- BookAdapter.kt → Adapter untuk menghubungkan data Book ke RecyclerView.

- BookDetailActivity.kt → Menampilkan detail buku yang dipilih.

- item_book.xml → Desain item buku dalam daftar (judul, penulis, tahun, icon, tombol).



## Kesimpulan

Project aplikasi Daftar Buku Perpustakaan ini berhasil mengintegrasikan beberapa fitur dasar Android seperti Splash Screen, RecyclerView dengan CardView, Intent untuk navigasi antar Activity, Toast sebagai notifikasi singkat, serta Dialog Box sebagai konfirmasi, sehingga menghasilkan aplikasi sederhana namun fungsional untuk menampilkan daftar buku beserta detail informasinya. Dengan struktur kode yang terorganisir, aplikasi ini tidak hanya menampilkan data buku secara menarik dan interaktif, tetapi juga melatih pemahaman tentang cara menghubungkan data dengan tampilan, mengelola interaksi pengguna, serta memanfaatkan komponen Android untuk membuat aplikasi yang lebih dinamis dan user-friendly.


## ✨ Hasil
**Splash Screen**

![1000210503](https://github.com/user-attachments/assets/29c1d0e8-fea9-4a0b-be92-6fed7983b52b)


**Halaman Utama**

![1000210512](https://github.com/user-attachments/assets/78303518-bf17-42f4-95b8-734f5406f9c9)


**Dialog Box**

![1000210509](https://github.com/user-attachments/assets/2321f253-e2cc-41bf-a7e6-2b1810924582)


**Detail**

![1000210505](https://github.com/user-attachments/assets/4e3a14b3-c7dc-4b69-a4b1-88f803095989)
