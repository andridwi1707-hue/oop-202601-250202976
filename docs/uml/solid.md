# Penerapan SOLID

## 1. Open/Closed Principle (OCP)

**Kelas:** `Aset`, `Ruang`, `Laptop`, `AlatLab`

**Alasan:**

Class `Aset` menjadi class induk, sedangkan `Ruang`, `Laptop`, dan `AlatLab` mengubah perilaku method `hitungDenda()` dengan cara override tanpa mengubah kode pada class `Aset`. Jika di kemudian hari ada jenis aset baru, cukup membuat subclass baru tanpa mengubah class yang sudah ada.

---

## 2. Liskov Substitution Principle (LSP)

**Kelas:** `Ruang`, `Laptop`, `AlatLab`

**Alasan:**

Ketiga class tersebut merupakan turunan dari `Aset` sehingga dapat digunakan sebagai objek bertipe `Aset`. Masing-masing memiliki implementasi `hitungDenda()` sendiri, tetapi tetap dapat diperlakukan sebagai `Aset` tanpa mengubah cara kerja program.

---

## Kesimpulan

Project ini telah menerapkan beberapa prinsip SOLID, terutama Open/Closed Principle (OCP) melalui penggunaan inheritance dan method overriding, serta Liskov Substitution Principle (LSP) karena setiap subclass dapat menggantikan class induknya tanpa menyebabkan perubahan perilaku program.