# Catatan Minggu 03: Inheritance

## Yang saya kerjakan

Pada minggu ini saya membuat hubungan inheritance pada sistem Aset-Pinjam. Saya membuat class `Ruang`, `Laptop`, dan `AlatLab` sebagai turunan dari class `Aset` menggunakan `extends`. Saya menambahkan field khusus pada masing-masing class, membuat constructor dengan `super`, getter, serta method `getJenis()` sesuai jenis aset.

## Keputusan desain

Saya memutuskan field yang sama seperti kode, nama, status, dan kondisi tetap berada di class induk `Aset` karena semua aset memiliki data tersebut. Field khusus seperti kapasitas pada `Ruang`, spesifikasi dan nomor inventaris pada `Laptop`, serta laboratorium dan tingkat risiko pada `AlatLab` dibuat pada subclass masing-masing karena hanya digunakan oleh jenis aset tertentu.

## Kendala

Kendala yang saya alami adalah memahami penggunaan inheritance dan penempatan field antara class induk dan class turunan. Saya juga mengalami error pada method `getJenis()` karena tipe return tidak sesuai dengan class `Aset`. Setelah mengecek kembali class induk, saya menyesuaikan tipe return agar sesuai.

## Penggunaan AI

- Alat yang dipakai: ChatGPT
- Bagian yang dibantu AI: Class `Ruang`, `Laptop`, dan `AlatLab`, terutama constructor, validasi, getter, dan method `getJenis()`.
- Prompt utama:
  1. "Jelaskan file yang harus diisi pada tugas Minggu 3 Inheritance."
  2. "Cek kode Java ini apakah sudah benar."
  3. "Kenapa getJenis() error This return type is incompatible with Aset.getJenis()?"

- Yang saya ubah atau tolak dari saran AI, dan alasannya:
  Saya menyesuaikan bagian `getJenis()` dengan kode yang sudah ada pada project, karena awalnya saran menggunakan tipe `String`, sedangkan pada project menggunakan tipe data lain dari class `Aset`.

- Satu hal yang saya pahami lebih baik sekarang:
  Saya lebih memahami bahwa inheritance digunakan ketika sebuah class memiliki hubungan "adalah" dengan class lain. Class turunan dapat memakai atribut dan method dari class induk, tetapi tetap bisa memiliki atribut khusus sendiri.