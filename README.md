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
(penjelasan)  
**📂 Toast Message**
<img width="1110" height="547" alt="Screenshot 2025-08-19 184418" src="https://github.com/user-attachments/assets/8539ab84-aa67-4d34-a6db-496285800cf0" />
(penjelasan)  
**📂 Dialog Box (Konfirmasi)**  
<img width="1045" height="509" alt="Screenshot 2025-08-19 182531" src="https://github.com/user-attachments/assets/ce6e7813-77e3-43de-8bc4-479cb9dc010c" />
(penjelasan)  
## ✨ Output  
