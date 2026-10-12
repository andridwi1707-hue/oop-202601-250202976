# Catatan Minggu 01: Paradigma Pemrograman dan Setup

## Yang saya kerjakan

Pada minggu pertama ini saya mempelajari perbedaan paradigma pemrograman prosedural, OOP, dan fungsional menggunakan bahasa Java. Saya mengubah tiga file yaitu `HelloProsedural`, `HelloOOP`, dan `HelloFungsional` agar dapat menghasilkan output yang sama. Selain itu saya juga mengisi data mahasiswa pada file `mahasiswa.properties` dan menjalankan pengujian menggunakan Maven.

## Keputusan desain

Saya menggunakan format kalimat sapaan yang sama pada ketiga program agar lebih mudah melihat perbedaan setiap paradigma. Pada program prosedural saya menggunakan fungsi static untuk membuat sapaan. Pada program OOP saya menggunakan class dengan field private untuk menyimpan nama dan NIM. Sedangkan pada program fungsional saya menggunakan lambda yang dikembalikan oleh sebuah fungsi.

## Kendala

Kendala yang saya alami adalah saat melakukan setup Maven karena perintah `mvn` belum terbaca oleh terminal. Saya mengatasinya dengan melakukan installasi Maven pada environment variable sehingga Maven dapat dijalankan. Selain itu saya juga masih perlu memahami perbedaan konsep antara prosedural, OOP, dan fungsional.

## Penggunaan AI

**Alat yang dipakai:** ChatGPT

**Bagian yang dibantu AI:** Membantu memahami konsep paradigma pemrograman dan membantu dengan lagkah langkah apa yang harus saya lakukan pada file `HelloProsedural`, `HelloOOP`, dan `HelloFungsional selain itu juga saya menggunakan AI tersebut untuk membantu installisasi maven yang menurut saya cukup membingungkan

**Prompt utama:**
1. Jelaskan perbedaan paradigma prosedural, OOP, dan fungsional dalam Java.
2. Apa saja yang harus diisi di 3 file tersebut?
3. Jelaskan error Maven "mvn is not recognized" dan cara mengatasinya.
4. Apa yang terjadi saat saya sudah mengubah dan menjalankan 3 file tersebut?

**Yang saya ubah atau tolak dari saran AI, dan alasannya:**

Saya menyesuaikan kode yang diberikan dengan struktur kode dari dosen dan tidak mengubah nama class maupun method karena sudah digunakan pada file pengujian. Saya juga menyesuaikan isi data mahasiswa dengan identitas saya sendiri.

**Satu hal yang saya pahami lebih baik sekarang:**

Saya memahami bahwa satu masalah dapat dibuat menggunakan beberapa paradigma pemrograman. Prosedural lebih fokus pada fungsi dan langkah kerja, OOP menggunakan objek untuk mengatur data dan perilaku, sedangkan fungsional menggunakan fungsi sebagai nilai

## Kelebihan dan Keterbatasan Tiap Gaya

- **Prosedural**
  1. Kelebihan: Mudah dibuat untuk program sederhana.
  2. Keterbatasan: Sulit dikelola jika program semakin besar.

- **OOP**
  1. Kelebihan: Program lebih rapi karena data dan fungsi dikelompokkan dalam class.
  2. Keterbatasan: Membutuhkan lebih banyak class dan konsep.

- **Fungsional**
  1. Kelebihan: Fungsi dapat digunakan kembali dan kode lebih ringkas.
  2. Keterbatasan: Konsep lambda masih cukup sulit dipahami bagi pemula.
