# Praktikum Pra UTS — Object-Oriented Programming (Java)

Repositori ini berisi kumpulan kode hasil praktikum Pra UTS mata kuliah **Pemrograman Berorientasi Objek (OOP)** menggunakan bahasa pemrograman Java.

---

## Struktur Folder

```
PraUTS/
├── F2P6/
│   ├── Orang.java
│   ├── Mahasiswa.java
│   ├── Dosen.java
│   └── Main.java
├── E1P1/
│   ├── Motor.java
│   └── MotorBeraksi.java
├── E1P2/
│   ├── Motor2.java
│   └── Motor2Beraksi.java
├── E2P3/
│   ├── Sepeda.java
│   └── SepedaBeraksi.java
├── E3P4/
│   ├── MobilBaru.java
│   └── MobilBaruBeraksi.java
├── F1P5/
│   ├── Mahasiswa.java
│   └── Sks.java
├── F2P6/
│   ├── Orang.java
│   ├── Mahasiswa.java
│   ├── Dosen.java
│   └── Main.java
├── F3P7/
│   ├── Hewan.java
│   ├── Herbivora.java
│   ├── Karnivora.java
│   ├── Kelinci.java
│   └── HewanPolimor.java
└── G1Tugas/
    ├── Mahasiswa.java
    └── MahasiswaBeraksi.java
```

---

## Daftar Praktikum

### E.1 — Praktik 1: Membuat Kelas, Objek, dan Memanggil Atribut
Membuat class `Motor` dengan atribut `warna` dan `merk`, lalu menginstansiasi objeknya di class `MotorBeraksi`.

**Konsep:** Class, Object, Atribut, Constructor, Method

**Output:**
```
Warna: Merah
Merk: Honda
```

---

### E.1 — Praktik 2: Membuat dan Memanggil Metode
Mengembangkan class `Motor2` dengan menambahkan setter method `setWarna()` dan `setMerk()` untuk mengubah nilai atribut setelah objek dibuat.

**Konsep:** Method, Setter, Pemanggilan Method

**Output:**
```
Warna: Hitam
Merk: Yamaha
Warna: Biru
Merk: Suzuki
```

---

### E.2 — Praktik 3: Membuat Parameter
Membuat class `Sepeda` dengan method `ubahKecepatan(int kecepatanBaru)` yang menerima parameter untuk mengubah nilai atribut `kecepatan`.

**Konsep:** Parameter Method, Argument

**Output:**
```
Merk: Polygon
Kecepatan: 20 km/jam
Merk: Polygon
Kecepatan: 30 km/jam
```

---

### E.3 — Praktik 4: Membuat Constructor
Membuat class `MobilBaru` dengan constructor berparameter untuk menginisialisasi atribut `warna` dan `merk` saat objek pertama kali dibuat.

**Konsep:** Constructor, Inisialisasi Objek

**Output:**
```
Warna: Putih
Merk: Toyota
```

---

### F.1 — Praktik 5: Enkapsulasi
Membuat class `Mahasiswa` dengan atribut `private` dan menyediakan akses melalui getter (`getSks()`) dan setter (`setSks()`).

**Konsep:** Encapsulation, Access Modifier (`private`), Getter, Setter

**Output:**
```
Nama: Budi
SKS: 24
Nama: Budi
SKS: 30
```

---

### F.2 — Praktik 6: Pewarisan (Inheritance)
Membuat class induk `Orang` dengan atribut `nama` dan `umur`, lalu diturunkan ke class `Mahasiswa` dan `Dosen` menggunakan keyword `extends`.

**Konsep:** Inheritance, Superclass, Subclass, `extends`

**Catatan:** Setiap class (`Orang`, `Mahasiswa`, `Dosen`) dibuat dalam file terpisah. Compile dengan perintah:
```
javac Orang.java Mahasiswa.java Dosen.java Main.java
java Main
```

**Output:**
```
Nama: Budi
Umur: 20
NIM: 123456
Nama: Dr. Ahmad
Umur: 40
NIDN: 654321
```

---

### F.3 — Praktik 7: Polimorfisme
Membuat hierarki class `Hewan` → `Herbivora` / `Karnivora` → `Kelinci`, lalu mendemonstrasikan polimorfisme dengan menyimpan berbagai subclass ke dalam variabel bertipe `Hewan`.

**Konsep:** Polymorphism, Method Overriding, Upcasting

**Output:**
```
Suara hewan
Suara herbivora
Suara karnivora
Suara kelinci
```

---

### G.1 — Tugas 1: Membuat Class Mahasiswa
Membuat class `Mahasiswa` dengan atribut `nama` dan `nim`, serta tiga method: `tampilkanNama()`, `tampilkanNim()`, dan `olahraga()`. Diinstansiasi dengan tiga objek berbeda.

**Output:**
```
Nama: Rein
NIM: 109397
Olahraga Favorite: Sepak Bola, Bola Voli
Nama: Nei
NIM: 781394
Olahraga Favorite: Sepak Bola, Bola Voli
Nama: Sen
NIM: 241902
Olahraga Favorite: Sepak Bola, Bola Voli
```

---

**Konsep:** Class, Object, Method, Multiple Instance

---

## Cara Menjalankan

1. Pastikan **Java JDK** sudah terinstal.
2. Buka terminal / command prompt di dalam folder praktikum yang dituju.
3. Compile semua file Java:
   ```
   javac *.java
   ```
4. Jalankan class utama:
   ```
   java NamaClassUtama
   ```
   Contoh:
   ```
   java MotorBeraksi
   java Main
   java HewanPolimor
   ```

---

## Teknologi

- **Bahasa:** Java
- **IDE:** Visual Studio Code
- **JDK:** Java SE (versi menyesuaikan)

---

## Mata Kuliah

| Info | Detail |
|------|--------|
| Mata Kuliah | Pemrograman Berorientasi Objek |
| Fakultas | FILKOM |
| Semester | 2 |
| Jenis | Praktikum Pra UTS |
