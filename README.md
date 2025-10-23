# **Post Test Pertemuan Ketiga Praktikum Pemrograman Mobile**
Nama: Reynard Rakha Fatin Nugraha 

NIM: 2300018234 

Slot: Rabu, 16.45 - 18.15

# **Deskripsi Singkat Proyek**
Proyek ini adalah aplikasi Android yang dikembangkan menggunakan Kotlin. Fokus utama proyek ini adalah pembuatan layout dan implementasi navigasi antar-aktivitas (Activity) dengan membawa data.

Aplikasi ini terdiri dari dua aktivitas utama:

1. Halaman Pendaftaran (MainActivity): Menyajikan Form Pendaftaran yang menggunakan layout berbasis ScrollView dan LinearLayout.

- Komponen UI: Menggunakan berbagai elemen seperti EditText untuk input data (Full Name, Username, Age, Email, Password, Confirm Password) dan RadioGroup untuk pilihan Gender (Laki-laki/Perempuan).
- Validasi: Menerapkan validasi dasar pada data input sebelum berpindah ke halaman hasil. Validasi mencakup pengecekan semua kolom tidak boleh kosong, kolom Age harus berisi angka, dan Password harus cocok dengan Confirm Password.
- Navigasi: Data yang valid akan diteruskan ke ResultActivity menggunakan objek Intent.

2. Halaman Hasil Pendaftaran (ResultActivity): Berfungsi untuk menampilkan kembali data yang telah diinputkan oleh pengguna dari MainActivity.
- Tampilan: Data diterima melalui Intent dan ditampilkan menggunakan beberapa komponen TextView dengan judul "Registration Result".
- Proyek ini berhasil mendemonstrasikan perancangan layout formulir yang interaktif dan mekanisme pengiriman data antar-komponen aplikasi Android.
