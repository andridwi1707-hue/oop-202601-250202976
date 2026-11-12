# Catatan Minggu 07: Koleksi

## Yang saya kerjakan

Pada minggu ini saya mengerjakan class `JadwalPeminjaman`. Saya mengimplementasikan method `bentrok()`, `semuaUrutMulai()`, `perAset()`, dan `hapus()`. Selain itu, saya juga membuat `BatasBentrokTest` untuk menguji keputusan mengenai batas waktu bentrok pada jadwal peminjaman.

## Keputusan desain

Saya menggunakan `List` sebagai struktur data utama untuk menyimpan data peminjaman karena sesuai dengan kebutuhan project. Untuk method `perAset()`, saya mengelompokkan data menggunakan `Map` berdasarkan kode aset. Saya juga memutuskan bahwa jika waktu selesai suatu peminjaman sama dengan waktu mulai peminjaman berikutnya pada aset yang sama, maka keduanya **tidak dianggap bentrok**.

## Kendala

Kendala yang saya alami adalah memahami cara mengecek bentrok waktu antar peminjaman dan menggunakan koleksi seperti `List`, `Map`, serta `Comparator`. Saya juga sempat mengalami beberapa syntax error karena penempatan kurung kurawal dan penulisan method, kemudian memperbaikinya setelah mengecek kembali struktur kode.

## Penggunaan AI

- Alat yang dipakai: ChatGPT
- Bagian yang dibantu AI: Implementasi method `bentrok()`, `semuaUrutMulai()`, `perAset()`, `hapus()`, pembuatan `BatasBentrokTest`, serta penjelasan penggunaan koleksi dan `Comparator`.
- Prompt utama:
  1. "Bantu mengerjakan JadwalPeminjaman.java."
  2. "Validasi kode saya"
  3. "apa yang harus saya lakukan di file BentrokTest.java?"
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya menyesuaikan implementasi dengan template project dan keputusan yang saya pilih mengenai batas waktu bentrok agar sesuai dengan kebutuhan pengujian.
- Satu hal yang saya pahami lebih baik sekarang: Saya lebih memahami penggunaan `List`, `Map`, dan `Comparator`, serta cara mengelompokkan, mengurutkan, dan memeriksa bentrok data pada koleksi di Java.