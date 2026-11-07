# Catatan Minggu 05: Abstraction

## Yang saya kerjakan

Pada minggu ini saya menerapkan konsep abstraction pada sistem Aset-Pinjam. Saya mengubah class `Aset` menjadi abstract class, mengisi method `bisaDipinjam()`, dan mengubah `hitungDenda()` menjadi abstract agar diimplementasikan oleh setiap subclass. Selain itu, saya mengimplementasikan interface `AturanDenda` pada class `DendaFlat` dan `DendaProgresif`.

## Keputusan desain

Saya menggunakan rumus denda progresif berupa `denda flat + (hari terlambat × hari terlambat)`. Rumus ini dipilih karena memenuhi aturan yang diberikan, yaitu denda tidak lebih murah dari denda flat, nilainya terus meningkat ketika hari keterlambatan bertambah, dan pada hari ke-30 lebih besar daripada denda flat.

## Kendala

Kendala yang saya alami adalah memahami perbedaan antara abstract class dan interface. Saya juga sempat mengalami error saat mengubah method menjadi abstract karena masih menuliskan isi method. Setelah mempelajari kembali aturan abstract method, saya memperbaikinya dengan menghapus isi method dan hanya menyisakan deklarasinya.

## Penggunaan AI

- Alat yang dipakai: ChatGPT
- Bagian yang dibantu AI: Perubahan pada `Aset.java`, implementasi `DendaFlat.java`, `DendaProgresif.java`, serta penjelasan konsep abstract class dan interface.
- Prompt utama:
  1. "Jelaskan aturan Minggu 5 Abstraction."
  2. "Bagian yang diubah abstract syntax error."
  3. "Buat implementasi DendaFlat dan DendaProgresif sesuai aturan."
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya menyesuaikan implementasi dengan struktur project dan template yang sudah diberikan dosen agar sesuai dengan pengujian.
- Satu hal yang saya pahami lebih baik sekarang: Saya memahami bahwa abstract class digunakan sebagai class induk yang tidak dapat dibuat objek secara langsung, sedangkan interface digunakan sebagai kontrak yang harus diimplementasikan oleh class lain.