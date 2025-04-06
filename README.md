# 🧊 Smart Fridge System

Smart Fridge System adalah simulasi sederhana dari sistem kulkas pintar yang dapat mengelola bahan makanan secara otomatis. Sistem ini dibuat dengan pendekatan modular berbasis interface untuk mencerminkan hubungan antar komponen dalam sistem perangkat pintar.

---

## 🧠 Pendahuluan

Smart Fridge System bertujuan untuk:
- 📦 Memantau dan mengelola bahan makanan secara efisien.
- 🔄 Menyediakan layanan sinkronisasi data ke pusat penyimpanan.
- 📱 Memberikan antarmuka kontrol dan tampilan yang interaktif.
- 💡 Menjadi contoh penerapan arsitektur berbasis interface dalam pemrograman Java.

---

## 🧱 Arsitektur Sistem

### ✅ Interface (Layanan yang disediakan)
- **IngredientControl**  
  Menyediakan layanan untuk menambah dan menghapus bahan makanan.

- **IngredientViewer**  
  Menyediakan layanan untuk melihat dan mengecek bahan makanan.

- **SyncService**  
  Layanan untuk menyinkronkan data bahan makanan ke pusat data.

### 🧩 Kelas (Pengguna dan Penyedia Layanan)
- **FridgeUnit**  
  Mengimplementasikan `IngredientControl` dan `IngredientViewer`.  
  Mewakili kulkas dan penyimpanan bahan makanan.

- **DataCenter**  
  Mengimplementasikan `SyncService`.  
  Menyimpan dan mengelola data hasil sinkronisasi.

- **ControlPanel**  
  Memerlukan `IngredientControl` dan `SyncService`.  
  Panel kendali utama yang digunakan pengguna untuk mengelola bahan makanan.

- **DisplayPanel**  
  Memerlukan `IngredientViewer`.  
  Menampilkan isi kulkas secara visual ke pengguna.

---

## 🛗 Provide dan Require Interface



---

## 📃 UML Class Diagram


---

## 💻 Cara Menjalankan di Lokal

Ikuti langkah-langkah berikut untuk menjalankan program ini di komputer kamu:

### 1. Clone Repository

```bash
git clone https://github.com/username/smart-fridge-system.git
cd smart-fridge-system
```

> Ganti `username` dengan akun GitHub kamu.

### 2. Compile Semua File

```bash
javac *.java
```

### 3. Jalankan Aplikasi

```bash
java Main
```

---

## 🧪 Contoh Tampilan

```
=== Smart Fridge Control Panel ===
1. Tambah Bahan
2. Hapus Bahan
3. Sinkronisasi Data
4. Keluar
Pilih opsi:
```

---

## 🤝 Kontribusi

Pull request sangat diterima! Kamu bebas untuk fork dan kembangkan sistem ini, misalnya:
- Menambah fitur penyimpanan ke file.
- Integrasi GUI.
- Simulasi koneksi dengan perangkat IoT.

---

## 📄 Lisensi

Proyek ini dirilis dengan lisensi MIT – silakan gunakan dan modifikasi untuk kebutuhan pembelajaran atau pengembangan lebih lanjut.

---

## 👯 Contributors

- Farhanul Khair (2208107010076)
- Alfi Zamriza (2208107010080)

---

<p align="center"><b>Build with ❤️ for UTS PLBK</b></p>
