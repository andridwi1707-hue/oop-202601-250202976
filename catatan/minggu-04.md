# Catatan Minggu 04: Polymorphism

## Yang saya kerjakan

Pada minggu ini saya menerapkan konsep polymorphism pada sistem Aset-Pinjam. Saya membuat method `hitungDenda(int)` pada class `Aset` dan melakukan override pada class `Ruang`, `Laptop`, dan `AlatLab` dengan aturan denda yang berbeda. Selain itu saya membuat overload method `cari()` pada class `KatalogAset` untuk mencari aset berdasarkan nama dan jenis aset.

## Keputusan desain

Pada bagian denda saya mengikuti aturan yang sudah ditentukan, yaitu setiap jenis aset memiliki pengali yang berbeda. `Ruang` menggunakan pengali 1x, `Laptop` menggunakan pengali 2x, dan `AlatLab` menggunakan pengali 4x. Pada `KatalogAset`, saya menggunakan dua method dengan nama sama tetapi parameter berbeda sebagai penerapan overloading.

## Kendala

Kendala yang saya alami adalah memahami perbedaan antara overriding dan overloading. Saya juga mengalami error pada method `getJenis()` karena tipe data return tidak sesuai dengan class induk. Setelah mengecek kembali class `Aset`, saya menyesuaikan tipe data agar sama dengan yang digunakan pada project.

## Penggunaan AI

- Alat yang dipakai: ChatGPT
- Bagian yang dibantu AI: Method `hitungDenda(int)` pada class `Ruang`, `Laptop`, dan `AlatLab`, serta method `cari()` pada class `KatalogAset`.
- Prompt utama:
  1. "Jelaskan pekerjaan Minggu 4 Polymorphism dan file yang harus dikerjakan."
  2. "Cek kode Java ini apakah sudah benar."
  3. "Kenapa method override getJenis() error return type tidak sesuai?"

- Yang saya ubah atau tolak dari saran AI, dan alasannya:
  Saya menyesuaikan beberapa bagian kode dengan struktur project yang sudah diberikan, terutama tipe return pada method `getJenis()` dan aturan yang ada pada file project.

- Satu hal yang saya pahami lebih baik sekarang:
  Saya lebih memahami bahwa overriding digunakan ketika class turunan mengganti isi method dari class induk, sedangkan overloading digunakan ketika membuat beberapa method dengan nama sama tetapi parameter berbeda.