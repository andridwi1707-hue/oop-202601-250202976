# Catatan Minggu 06: UML dan SOLID

## Yang saya kerjakan

Pada minggu ini saya membuat Class Diagram dan Sequence Diagram berdasarkan kode yang sudah saya kerjakan pada minggu sebelumnya. Saya juga membuat dokumentasi penerapan dua prinsip SOLID, yaitu Open/Closed Principle (OCP) dan Liskov Substitution Principle (LSP), sesuai dengan struktur project.

## Keputusan desain

Saya membuat diagram UML yang sesuai dengan kode program, bukan berdasarkan rancangan baru. Untuk prinsip SOLID, saya memilih OCP karena setiap jenis aset memiliki implementasi `hitungDenda()` masing-masing melalui override, dan LSP karena objek `Ruang`, `Laptop`, dan `AlatLab` dapat digunakan sebagai objek `Aset`.

## Kendala

Kendala yang saya alami adalah menentukan relasi pada Class Diagram dan menyusun Sequence Diagram agar sesuai dengan alur program. Saya juga sempat bingung memilih prinsip SOLID yang sesuai dengan kode, kemudian mencocokkannya kembali dengan implementasi yang sudah dibuat.

## Penggunaan AI

- Alat yang dipakai: ChatGPT
- Bagian yang dibantu AI: Membantu menjelaskan relasi pada Class Diagram, menyusun Sequence Diagram, serta menjelaskan penerapan prinsip SOLID berdasarkan kode yang sudah dibuat.
- Prompt utama:
  1. "Pandu aku mengerjakan"
  2. "validasi Sequence dan class Diagram."
  3. "apa itu SOLId Principal?"
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya menyesuaikan isi diagram dan penjelasan SOLID agar sesuai dengan struktur project dan hasil implementasi yang saya buat sendiri.
- Satu hal yang saya pahami lebih baik sekarang: Saya lebih memahami cara membaca dan membuat diagram UML serta mengetahui bahwa prinsip SOLID membantu membuat kode lebih mudah dikembangkan dan dipelihara.