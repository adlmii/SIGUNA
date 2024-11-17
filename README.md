# 📦 SIGUNA - Sistem Inventory Gudang Alfamart
SIGUNA adalah aplikasi inventory management berbasis Java yang dirancang untuk memudahkan pengelolaan stok barang di gudang Alfamart. Menggunakan antarmuka pengguna Java Swing yang sederhana dan intuitif, aplikasi ini mendukung pengelolaan inventaris, transaksi, dan laporan keuangan dengan efisien.

## ✨ Fitur Utama
### 👤 Kepala Cabang
- 🛠️ Konfigurasi Awal: Pengaturan awal aplikasi, termasuk data cabang, alamat, dan kontak.
- 🧑‍💼 Kelola Staff: Menambah, mengedit, dan menghapus data staff yang bertugas di gudang.
- 📊 Laporan Keuangan: Menampilkan laporan transaksi penjualan, pembelian, dan perhitungan keuntungan.
### 🔄 Staff (On-going)
- 📦 Kelola Stok Barang: Mengelola data barang, menambah, mengurangi, dan memperbarui stok.
- 🚚 Pengelolaan Penerimaan Barang: Mencatat penerimaan barang dari supplier.
- 🗂️ Pencatatan Transaksi: Memasukkan data transaksi penjualan dan pengeluaran stok.

## 🛠️ Teknologi yang Digunakan
- Bahasa Pemrograman: Java
- Antarmuka Pengguna: Java Swing
- Database: MySQL
- JDBC: Untuk koneksi antara aplikasi Java dan MySQL

## 📦 Instalasi
Ikuti langkah-langkah berikut untuk menjalankan aplikasi SIGUNA secara lokal:

### Prasyarat
- Java JDK minimal versi 11
- MySQL telah terpasang dan dikonfigurasi
- IDE seperti IntelliJ IDEA atau Eclipse

```bash
# Clone repositori ini
git clone https://github.com/adlmii/SIGUNA.git

# Masuk ke direktori proyek
cd SIGUNA

# Buat database di MySQL
# Jalankan skrip berikut untuk membuat database dan tabel
source database/Script.sql

# Konfigurasi file koneksi database di aplikasi
# Edit file di src/config/DatabaseConfig.java

# Jalankan aplikasi melalui IDE
```

## 🗂️ Struktur Proyek
```bash
SIGUNA/
├── src/
│   ├── config/         # Pengaturan koneksi database
│   ├── controller/     # Logika aplikasi dan pengelolaan data
│   ├── model/          # Struktur data aplikasi
│   ├── view/           # Antarmuka pengguna (Java Swing)
│   └── img/            # Gambar dan ikon
├── database/
│   └── Script.sql      # Skrip pembuatan tabel dan data awal
├── README.md
└── LICENSE
```

## 📚 Fitur yang Akan Dikembangkan
- 🔒 Login dan Hak Akses: Memastikan pengguna yang login sesuai dengan hak akses (Kepala Cabang atau Staff).
