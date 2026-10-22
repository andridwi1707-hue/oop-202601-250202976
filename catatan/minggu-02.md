# Catatan Minggu 02: Struktur OOP: Class, Object, Encapsulation

## Yang saya kerjakan

Pada minggu kedua ini saya mengerjakan class Aset menggunakan konsep OOP. Saya menambahkan field, konstruktor, getter, setter, dan validasi pada data aset sesuai dengan yang diinstruksikan. Setelah selesai mengubah kode, saya menjalankan test menggunakan Maven dan hasilnya berhasil.

## Keputusan desain

Saya membuat semua field menjadi private agar data tidak bisa diubah secara langsung dari luar class. Saya tidak membuat setter untuk kode karena kode aset dianggap sebagai identitas yang tidak perlu diganti. Untuk nama, status, dan kondisi saya memberikan validasi agar tidak bisa menerima data kosong atau null.

## Kendala

Kendala yang saya alami adalah masih sedikit bingung dengan fungsi getter, setter, dan cara kerja encapsulation. Saya mencoba memahami dari contoh kode dan melihat test yang diberikan agar kode yang dibuat sesuai aturan.

## Penggunaan AI

**Alat yang dipakai:** ChatGPT

**Bagian yang dibantu AI:** Membantu memahami konsep OOP, encapsulation, dan membantu mengecek bagian TODO pada file Aset.java apakah sudah betul atau tidak.

**Prompt utama:**
1. Jelaskan langkah mengerjakan tugas Minggu 2 tentang class, object, dan encapsulation.
2. Jelaskan fungsi konstruktor, getter, dan setter pada Java.
3. Cek apakah kode Aset.java apakah sudah sesuai dengan aturan Minggu 2 atau belum. 

**Yang saya ubah atau tolak dari saran AI, dan alasannya:**

Saya tetap mengikuti struktur kode dari dosen dan tidak mengubah nama class atau method karena sudah digunakan pada test.

**Satu hal yang saya pahami lebih baik sekarang:**

Saya mulai memahami bahwa encapsulation digunakan untuk menjaga data dalam class agar lebih aman. Data dibuat private lalu diakses menggunakan getter dan setter yang bisa diberi aturan.