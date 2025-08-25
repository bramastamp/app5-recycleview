# Project Recycle View - Menampilkan data dari API ke Recycle View
Project Recycle View ini merupakan aplikasi Android yang berfungsi untuk menampilkan data dari API ke dalam tampilan daftar menggunakan RecyclerView. Data diambil melalui koneksi API menggunakan Retrofit, kemudian diproses dan ditampilkan secara dinamis ke dalam item RecyclerView sehingga lebih efisien dan ringan saat menampilkan banyak data. Setiap item yang ditampilkan bisa berisi informasi seperti judul, penulis, tahun, dan gambar cover yang didapat dari API, serta dapat diarahkan ke halaman detail untuk menampilkan informasi lebih lengkap.


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

<img width="921" height="537" alt="Screenshot 2025-08-25 162616" src="https://github.com/user-attachments/assets/5be573f9-7aa5-4120-a4a6-ee38fc0fbb0f" />  

Kode di atas merupakan file layout XML untuk halaman Splash Screen pada aplikasi Android. Layout utamanya menggunakan `LinearLayout` dengan atribut `match_parent` pada lebar dan tinggi sehingga memenuhi layar penuh, orientasi `vertical`, gravitasi `center` untuk memusatkan elemen, dan latar belakang berwarna biru (#2196F3). Di dalamnya terdapat komponen `ImageView` dengan ukuran 120dp x 120dp yang menampilkan gambar dari folder drawable bernama `logo_tunas` serta memiliki deskripsi konten “Logo Tunas” untuk mendukung aksesibilitas. Struktur ini digunakan untuk menampilkan logo aplikasi saat pertama kali dijalankan.



<img width="1078" height="783" alt="Screenshot 2025-08-25 163315" src="https://github.com/user-attachments/assets/0bc86384-997f-4ea4-9c1f-f4520d438ea5" />  

Kode di atas merupakan class `SplashScreen` pada aplikasi Android yang ditulis menggunakan Kotlin dan mewarisi `AppCompatActivity`. Pada metode `onCreate`, layout yang digunakan adalah `activity_splash_screen`. Terdapat pengaturan tampilan dengan `ViewCompat.setOnApplyWindowInsetsListener` untuk menyesuaikan padding sesuai dengan sistem bar perangkat agar tampilan tetap rapi di berbagai ukuran layar. Selain itu, digunakan `Handler` dengan `postDelayed` untuk menunda eksekusi selama 2000 milidetik (2 detik), kemudian memulai `MainActivity` menggunakan `Intent` dan menutup `SplashScreen` dengan `finish()`. Fungsionalitas ini umumnya digunakan untuk menampilkan layar pembuka sebelum masuk ke halaman utama aplikasi.




**📂 RecyclerView**   

<img width="1023" height="698" alt="Screenshot 2025-08-25 162647" src="https://github.com/user-attachments/assets/cdb07427-3e86-4534-8253-abc52a3c5029" />  

Kode tersebut merupakan layout XML untuk halaman utama yang menggunakan `ConstraintLayout` sebagai root view. Layout ini memiliki ukuran penuh layar (`match_parent`) dan digunakan oleh `MainActivity`. Di dalamnya terdapat komponen `RecyclerView` dengan ID `rvBuku` yang akan menampilkan daftar data secara efisien dalam bentuk list atau grid. Atribut `layout_width` dan `layout_height` diatur ke `0dp` untuk mengikuti constraint, dan setiap sisi (`top`, `bottom`, `left`, `right`) dikaitkan ke parent agar memenuhi seluruh area layar. `RecyclerView` ini nantinya digunakan untuk menampilkan data yang diambil dari sumber, seperti API atau database, secara dinamis.



<img width="1156" height="798" alt="Screenshot 2025-08-25 162759" src="https://github.com/user-attachments/assets/aa483516-96a8-4df2-9bd8-86a98b88b0f4" />  

Kode di atas adalah layout XML untuk item tampilan di dalam sebuah list menggunakan `CardView` sebagai container utama. `CardView` diberi margin 8dp, lebar penuh (`match_parent`), tinggi menyesuaikan isi (`wrap_content`), sudut melengkung 8dp, dan bayangan (elevation) 4dp agar terlihat seperti kartu. Di dalamnya terdapat `LinearLayout` dengan orientasi horizontal, padding 12dp, dan gravitasi `center_vertical` untuk menyusun komponen secara sejajar di tengah. Komponen pertama adalah `ImageView` dengan ID `ivCover` yang memiliki ukuran 48dp x 48dp untuk menampilkan ikon buku menggunakan gambar `logo_tunas` dari folder drawable, serta memiliki deskripsi konten “Icon Buku” untuk aksesibilitas dan margin akhir 12dp untuk memberi jarak ke komponen berikutnya. Layout ini umumnya digunakan sebagai item dalam `RecyclerView` untuk menampilkan daftar data dengan desain yang rapi dan interaktif.



<img width="757" height="708" alt="Screenshot 2025-08-25 162822" src="https://github.com/user-attachments/assets/ced377bd-d411-4b5b-b2c4-58a96bd9932e" />  

Kode di atas merupakan bagian dari layout item yang menampilkan informasi buku menggunakan `LinearLayout` dengan orientasi vertikal untuk menumpuk teks secara ke bawah. `LinearLayout` ini memiliki lebar 0dp dengan `layout_weight` 1 agar menyesuaikan ruang yang tersedia, dan tinggi mengikuti konten. Di dalamnya terdapat dua `TextView`: yang pertama (`tvJudul`) menampilkan teks “Judul Buku” dengan gaya tebal, ukuran huruf 18sp, dan warna hitam (#000000), sedangkan yang kedua (`tvPenulis`) menampilkan teks “Penulis” dengan ukuran 14sp dan warna abu-abu (#555555). Kedua `TextView` memiliki lebar dan tinggi `wrap_content` sehingga menyesuaikan isi. Bagian ini biasanya digunakan untuk melengkapi item `RecyclerView` dengan menampilkan detail informasi buku seperti judul dan nama penulis.



<img width="920" height="814" alt="Screenshot 2025-08-25 162849" src="https://github.com/user-attachments/assets/05cf381d-6c01-4925-87d2-cfc46be5b8b6" />

Kode di atas adalah layout XML untuk halaman detail buku pada aplikasi Android, menggunakan `LinearLayout` dengan orientasi vertikal, padding 20dp, dan ukuran penuh layar (`match_parent`). Layout ini terhubung dengan `DetailActivity` dan menampilkan konten secara terpusat. Di dalamnya terdapat `ImageView` dengan ID `ivCoverDetail` untuk menampilkan gambar sampul buku berukuran 300dp x 450dp, berada di tengah, dan menggunakan `scaleType` `centerCrop` agar gambar menyesuaikan ukuran tanpa merusak proporsi. Di bawahnya terdapat `TextView` dengan ID `tvJudulDetail` untuk menampilkan judul buku, memiliki lebar penuh, tinggi menyesuaikan isi, margin atas 16dp, teks “Judul Buku”, dan posisi teks rata tengah. Layout ini biasanya digunakan untuk menampilkan informasi detail dari item yang dipilih pada daftar buku.




**📂 Networking Layer**

<img width="582" height="271" alt="Screenshot 2025-08-25 163043" src="https://github.com/user-attachments/assets/9ac7ea01-24e8-45c6-be20-89e9ba0edc86" />  

Kode di atas merupakan deklarasi interface `ApiService` pada package `utils` yang digunakan untuk mengakses API menggunakan Retrofit di aplikasi Android. Di dalamnya terdapat anotasi `@GET("buku")` yang menunjukkan bahwa metode ini akan melakukan permintaan HTTP GET ke endpoint `buku`. Fungsi `getBuku()` akan mengembalikan objek `Call<List<Buku>>`, yaitu permintaan asinkron yang menghasilkan daftar data bertipe `Buku`. Interface ini nantinya akan diimplementasikan oleh Retrofit untuk memudahkan proses pengambilan data dari server dan menampilkannya pada aplikasi, misalnya ke dalam `RecyclerView`.



<img width="872" height="530" alt="Screenshot 2025-08-25 163052" src="https://github.com/user-attachments/assets/d4e22785-6c8b-4992-9ac0-78603f1db85e" />

Kode di atas adalah implementasi `RetrofitClient` pada Kotlin yang digunakan untuk mengatur koneksi API di aplikasi Android. Objek ini memiliki konstanta `BASE_URL` yang menyimpan alamat dasar API yaitu `https://api.abdyllaan.cc/`. Di dalamnya, terdapat properti `instance` bertipe `ApiService` yang dibuat dengan `by lazy`, artinya objek hanya akan dibuat saat pertama kali diakses untuk efisiensi memori. `Retrofit.Builder()` digunakan untuk membangun instance Retrofit dengan menetapkan `baseUrl`, menambahkan `GsonConverterFactory` untuk mengonversi data JSON menjadi objek Kotlin/Java, lalu memanggil `build()` untuk menyelesaikan proses pembuatan. Terakhir, `retrofit.create(ApiService::class.java)` mengembalikan implementasi `ApiService` yang dapat digunakan untuk memanggil endpoint API sesuai deklarasi.




**📂 Activity**  

*splashactivity*

<img width="1078" height="783" alt="Screenshot 2025-08-25 163315" src="https://github.com/user-attachments/assets/982cdc84-7aa8-4e89-ac6d-618c13dd56b6" />  

Kode tersebut adalah class `SplashScreen` yang ditulis dalam bahasa Kotlin dan berfungsi sebagai tampilan pembuka (splash screen) di aplikasi Android. Class ini mewarisi `AppCompatActivity` dan pada method `onCreate` memanggil `enableEdgeToEdge()` untuk memaksimalkan area tampilan serta menetapkan layout `activity_splash_screen` sebagai konten utama. Dengan menggunakan `ViewCompat.setOnApplyWindowInsetsListener`, aplikasi menyesuaikan padding agar sesuai dengan sistem bar perangkat. Selain itu, `Handler` digunakan untuk menunda eksekusi selama 2 detik (`2000` milidetik) sebelum menavigasi pengguna ke `MainActivity` menggunakan `Intent`, kemudian memanggil `finish()` agar halaman splash ditutup dan tidak dapat kembali.



*detailactivity*  

<img width="895" height="808" alt="Screenshot 2025-08-25 164156" src="https://github.com/user-attachments/assets/e674fbbd-ffab-4758-9cbb-6b1f87867b6a" />  

Kode tersebut adalah class `DetailActivity` dalam bahasa Kotlin yang digunakan untuk menampilkan detail data buku pada aplikasi Android. Class ini mewarisi `AppCompatActivity` dan di dalam method `onCreate` layout `detail_buku` dipasang sebagai tampilan utama. Empat komponen UI diambil menggunakan `findViewById`, yaitu `TextView` untuk judul, penulis, dan tahun terbit, serta `ImageView` untuk cover buku. Data yang dikirim dari activity sebelumnya diambil menggunakan `intent.getStringExtra()` lalu ditampilkan ke komponen masing-masing. Untuk gambar cover, library `Glide` digunakan untuk memuat dan menampilkan gambar dari URL atau path yang diterima melalui `intent`.



*mainactivity*

<img width="1475" height="840" alt="Screenshot 2025-08-25 164224" src="https://github.com/user-attachments/assets/b06dc2b2-2a49-4d1f-9a09-1a0781947c42" />  

Program pada gambar tersebut adalah kode Kotlin untuk class `MainActivity` yang merupakan turunan dari `AppCompatActivity` pada aplikasi Android, di mana digunakan sebuah `RecyclerView` bernama `rvBuku` untuk menampilkan daftar data buku. Pada metode `onCreate()`, layout utama dihubungkan dengan `setContentView(R.layout.activity_main)`, kemudian `rvBuku` diinisialisasi dengan `findViewById` dan diberikan `LinearLayoutManager` agar data ditampilkan secara vertikal. Selanjutnya dilakukan pemanggilan API menggunakan `RetrofitClient.instance.getBuku().enqueue()` untuk mengambil data buku dari server secara asynchronous. Jika response sukses (`isSuccessful`), maka data yang diterima (`listBuku`) dimasukkan ke dalam `BukuAdapter` dan dihubungkan ke `rvBuku.adapter` sehingga data dapat tampil di RecyclerView. Jika gagal, ditampilkan pesan error menggunakan `Toast.makeText()` dengan keterangan "Gagal" beserta pesan error yang diterima. Dengan demikian, kode ini mengatur alur dari pengambilan data buku melalui API hingga menampilkannya dalam bentuk daftar di RecyclerView pada aplikasi Android.




## Kesimpulan

Kesimpulan dari project ini adalah aplikasi berhasil mengimplementasikan RecyclerView untuk menampilkan data secara dinamis yang diambil dari API menggunakan Retrofit. Proses pengambilan data, pengolahan, dan penampilan dilakukan dengan efisien sehingga memudahkan pengguna melihat daftar data buku secara terstruktur. Selain itu, aplikasi juga menyediakan fitur untuk melihat detail setiap item dengan tampilan yang lebih lengkap, termasuk teks dan gambar, sehingga meningkatkan pengalaman pengguna dalam mengakses informasi.



## ✨ Hasil
**Splash Screen**  
![WhatsApp Image 2025-08-25 at 16 49 27](https://github.com/user-attachments/assets/59a7cc52-343d-42cd-807a-edaea7dea852)


**Halaman Utama**  




**Detail**  


