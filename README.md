# Praktikum Pra UTS — Pemrograman Berorientasi Objek (Java)

Repositori ini berisi kumpulan kode hasil praktikum Pra UTS mata kuliah **Pemrograman Berorientasi Objek (OOP)** menggunakan bahasa pemrograman Java. Praktikum dibagi menjadi dua sesi: **Pra1** dan **Pra2**.
# Praktikum Pra UTS — Object-Oriented Programming (Java)
Repositori ini berisi kumpulan kode hasil praktikum Pra UTS mata kuliah **Pemrograman Berorientasi Objek (OOP)** menggunakan bahasa pemrograman Java.

---

## Struktur Folder

```
PraUTS/
│
├── Pra1/
│   ├── E1/
│   │   ├── Motor.java
│   │   └── MotorBeraksi.java
│   ├── E1P2/
│   │   ├── Motor2.java
│   │   └── Motor2Beraksi.java
│   ├── E2P3/
│   │   ├── Sepeda.java
│   │   └── SepedaBeraksi.java
│   ├── E3P4/
│   │   ├── MobilBaru.java
│   │   └── MobilBaruBeraksi.java
│   ├── F1P5/
│   │   ├── Mahasiswa.java
│   │   └── Sks.java
│   ├── F2P6/
│   │   └── Main.java
│   ├── F3P7/
│   │   └── HewanPolimor.java
│   └── G1T1/
│       ├── Mahasiswa.java
│       └── MahasiswaBeraksi.java
│
└── Pra2/
    ├── G2T2/
    │   ├── Matematika.java
    │   └── MatematikaBeraksi.java
    ├── G3T3/
    │   ├── MobilLengkap.java
    │   └── MobilLengkapBeraksi.java
    ├── G4P7/
    │   └── HewanPolimor.java
    ├── H1Overriding/
    │   └── BentukBeraksi.java
    ├── H2Overloading/
    │   ├── Hitung.java
    │   └── HitungBeraksi.java
    ├── I1TugasAbstraksi/
    │   ├── MakhlukHidup.java
    │   └── MakhlukHidupBeraksi.java
    └── I2TugasAbstraksi2/
        ├── Kendaraan.java
        ├── Mobil.java
        ├── Sepeda.java
        └── KendaraanBeraksi.java
```

---

## Pra1 — Sesi Praktikum Pertama

### E1 — Membuat Kelas, Objek, dan Memanggil Atribut

**File:** `Motor.java`, `MotorBeraksi.java`
**Package:** `Pra1.E1`

Membuat class `Motor` dengan atribut `warna` dan `merk` bertipe `private`. Constructor menerima dua parameter untuk menginisialisasi atribut saat objek dibuat. Method `tampilkanInfo()` mencetak nilai atribut ke konsol. Objek dibuat dan dijalankan dari class `MotorBeraksi`.

**Konsep:** Class, Object, Constructor, Access Modifier (`private`), Method

**Output:**
```
Warna: Merah
Merk: Honda
```

---

### E1P2 — Membuat dan Memanggil Metode (Setter)

**File:** `Motor2.java`, `Motor2Beraksi.java`
**Package:** `Pra1.E1P2`

Pengembangan dari E1. Class `Motor2` menambahkan dua setter method — `setWarna()` dan `setMerk()` — untuk mengubah nilai atribut setelah objek dibuat. Mendemonstrasikan bahwa state objek bisa dimodifikasi kapan saja melalui method.

**Konsep:** Setter Method, Pemanggilan Method, Mutasi State Objek

**Output:**
```
Warna: Hitam
Merk: Yamaha
Warna: Biru
Merk: Suzuki
```

---

### E2P3 — Membuat Parameter

**File:** `Sepeda.java`, `SepedaBeraksi.java`
**Package:** `Pra1.E2P3`

Class `Sepeda` memiliki atribut `merk` (String) dan `kecepatan` (int). Method `ubahKecepatan(int kecepatanBaru)` menerima parameter untuk memperbarui nilai kecepatan. Mendemonstrasikan penggunaan parameter pada method.

**Konsep:** Parameter Method, Tipe Data `int`, Mutasi Atribut via Parameter

**Output:**
```
Merk: Polygon
Kecepatan: 20 km/jam
Merk: Polygon
Kecepatan: 30 km/jam
```

---

### E3P4 — Membuat Constructor

**File:** `MobilBaru.java`, `MobilBaruBeraksi.java`
**Package:** `Pra1.E3P4`

Class `MobilBaru` menggunakan constructor berparameter `(String warna, String merk)` untuk menginisialisasi atribut saat objek pertama kali dibuat menggunakan keyword `this`.

**Konsep:** Constructor Berparameter, Inisialisasi Objek, `this` Keyword

**Output:**
```
Warna: Putih
Merk: Toyota
```

---

### F1P5 — Enkapsulasi

**File:** `Mahasiswa.java`, `Sks.java`
**Package:** `Pra1.F1P5`

Menerapkan prinsip enkapsulasi pada class `Mahasiswa`. Atribut `nama` dan `sks` dibuat `private` sehingga tidak bisa diakses langsung dari luar class. Akses dilakukan melalui getter `getSks()` dan setter `setSks()`.

**Konsep:** Encapsulation, `private`, Getter, Setter

**Output:**
```
Nama: Budi
SKS: 24
Nama: Budi
SKS: 30
```

---

### F2P6 — Pewarisan (Inheritance)

**File:** `Main.java`
**Package:** `Pra1.F2P6`

Semua class ditulis dalam satu file `Main.java`. Class `Orang` berperan sebagai superclass dengan atribut `nama` dan `umur`. Class `Mahasiswa` dan `Dosen` mewarisi `Orang` menggunakan keyword `extends`, masing-masing menambahkan atribut `nim` dan `nidn`.

**Konsep:** Inheritance, Superclass, Subclass, `extends`, Method Inherited

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

### F3P7 — Polimorfisme

**File:** `HewanPolimor.java`
**Package:** `Pra1.F3P7`

Semua class ditulis dalam satu file. Hierarki class: `Hewan` (base) → `Herbivora` dan `Karnivora` → `Kelinci` (subclass dari `Herbivora`). Setiap class meng-override method `suara()`. Di class utama, semua objek disimpan dalam variabel bertipe `Hewan` — output berbeda sesuai tipe objek aktual saat runtime.

**Konsep:** Polymorphism, Method Overriding, Upcasting, Runtime Dispatch

**Output:**
```
Suara hewan
Suara herbivora
Suara karnivora
Suara kelinci
```

---

### G1T1 — Tugas 1: Class Mahasiswa

**File:** `Mahasiswa.java`, `MahasiswaBeraksi.java`
**Package:** `Pra1.G1T1`

Tugas mandiri membuat class `Mahasiswa` dengan atribut `name` dan `nim`, serta tiga method: `tampilkanNama()`, `tampilkanNIM()`, dan `olahraga()`. Tiga objek dibuat untuk merepresentasikan tiga mahasiswa berbeda (Rein, Nei, Sen).

**Konsep:** Class, Object, Multiple Instance, Method

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

## Pra2 — Sesi Praktikum Kedua

### G2T2 — Tugas 2: Class Matematika dengan Parameter

**File:** `Matematika.java`, `MatematikaBeraksi.java`
**Package:** `Pra2.G2T2`

Class `Matematika` memiliki empat method operasi aritmatika: `pertambahan`, `pengurangan`, `perkalian`, dan `pembagian`. Method `pembagian` menggunakan return type `double` dengan casting `(double)` agar hasil desimal tidak terpotong.

**Konsep:** Parameter Method, Return Value, Type Casting, Tipe Data `double`

**Output:**
```
Pertambahan: 40
Pengurangan: 5
Perkalian: 200
Pembagian: 10.5
```

---

### G3T3 — Tugas 3: Class MobilLengkap

**File:** `MobilLengkap.java`, `MobilLengkapBeraksi.java`
**Package:** `Pra2.G3T3`

Class `MobilLengkap` memiliki tiga method void tanpa parameter: `hidupkanMobil()`, `matikanMobil()`, dan `ubahGigi()`. Mendemonstrasikan pemodelan perilaku objek dunia nyata ke dalam method Java.

**Konsep:** Method `void`, Pemodelan Objek, Urutan Pemanggilan Method

**Output:**
```
Mobil dihidupkan
Gigi mobil diubah
Mobil dimatikan
```

---

### G4P7 — Praktik 7: Polimorfisme (Pra2)

**File:** `HewanPolimor.java`
**Package:** `Pra2.G4P7`

Implementasi ulang polimorfisme dengan struktur yang sama seperti F3P7 di Pra1, namun dengan indentasi dan struktur kode yang lebih rapi. Semua class ditulis dalam satu file.

**Konsep:** Polymorphism, Method Overriding, Upcasting

**Output:**
```
Suara hewan
Suara herbivora
Suara karnivora
Suara kelinci
```

---

### H1Overriding — Method Overriding dengan `@Override`

**File:** `BentukBeraksi.java`
**Package:** `Pra2.H1Overriding`

Semua class dalam satu file. Class `Bentuk` memiliki method `gambar()`. Subclass `Segitiga` dan `Persegi` meng-override method tersebut dengan annotation `@Override`. Variabel bertipe `Bentuk` diisi objek subclass — output menyesuaikan tipe objek aktual.

**Konsep:** Method Overriding, `@Override` Annotation, Polymorphism

**Output:**
```
Menggambar bentuk
Menggambar segitiga
Menggambar persegi
```

---

### H2Overloading — Method Overloading

**File:** `Hitung.java`, `HitungBeraksi.java`
**Package:** `Pra2.H2Overloading`

Class `Hitung` mendemonstrasikan overloading dengan tiga versi method `tambah()`: dua parameter `int`, dua parameter `double`, dan tiga parameter `int`. Java memilih method yang tepat berdasarkan tipe dan jumlah argumen saat compile time.

**Konsep:** Method Overloading, Compile-time Polymorphism, Method Signature

**Output:**
```
Pertambahan 2 angka (int): 8
Pertambahan 2 angka (double): 8.8
Pertambahan 3 angka (int): 6
```

---

### I1TugasAbstraksi — Tugas Abstraksi 1: MakhlukHidup

**File:** `MakhlukHidup.java`, `MakhlukHidupBeraksi.java`
**Package:** `Pra2.I1TugasAbstraksi`

`MakhlukHidup` dideklarasikan sebagai `abstract class` dengan satu abstract method `bernapas()`. Class `Manusia` dan `Hewan` mengimplementasikan method tersebut dengan perilaku berbeda. Abstract class tidak bisa diinstansiasi langsung.

**Konsep:** Abstract Class, Abstract Method, Implementasi Abstract Method

**Output:**
```
Manusia bernapas dengan paru-paru
Hewan bernapas dengan berbagai cara
```

---

### I2TugasAbstraksi2 — Tugas Abstraksi 2: Kendaraan

**File:** `Kendaraan.java`, `Mobil.java`, `Sepeda.java`, `KendaraanBeraksi.java`
**Package:** `Pra2.I2TugasAbstraksi2`

Berbeda dari I1, setiap class ditulis di file terpisah. `Kendaraan` adalah abstract class dengan abstract method `bergerak()`. Class `Mobil` dan `Sepeda` masing-masing mengimplementasikan `bergerak()`. Variabel bertipe `Kendaraan` dipakai untuk menyimpan objek konkret (upcasting).

**Konsep:** Abstract Class, File Terpisah per Class, Upcasting ke Abstract Type

**Output:**
```
Mobil bergerak dengan roda
Sepeda bergerak dengan pedal
```

---

## Cara Menjalankan

Semua file menggunakan `package`, jadi harus di-compile dari **root folder** `PraUTS/`.

**1. Compile:**
```bash
javac Pra1/E1/*.java
javac Pra1/E1P2/*.java
javac Pra1/E2P3/*.java
javac Pra1/E3P4/*.java
javac Pra1/F1P5/*.java
javac Pra1/F2P6/*.java
javac Pra1/F3P7/*.java
javac Pra1/G1T1/*.java
javac Pra2/G2T2/*.java
javac Pra2/G3T3/*.java
javac Pra2/G4P7/*.java
javac Pra2/H1Overriding/*.java
javac Pra2/H2Overloading/*.java
javac Pra2/I1TugasAbstraksi/*.java
javac Pra2/I2TugasAbstraksi2/*.java
```

**2. Jalankan (gunakan nama package penuh):**
```bash
java Pra1.E1.MotorBeraksi
java Pra1.E1P2.Motor2Beraksi
java Pra1.E2P3.SepedaBeraksi
java Pra1.E3P4.MobilBaruBeraksi
java Pra1.F1P5.Sks
java Pra1.F2P6.Main
java Pra1.F3P7.HewanPolimor
java Pra1.G1T1.MahasiswaBeraksi
java Pra2.G2T2.MatematikaBeraksi
java Pra2.G3T3.MobilLengkapBeraksi
java Pra2.G4P7.HewanPolimor
java Pra2.H1Overriding.BentukBeraksi
java Pra2.H2Overloading.HitungBeraksi
java Pra2.I1TugasAbstraksi.MakhlukHidupBeraksi
java Pra2.I2TugasAbstraksi2.KendaraanBeraksi
```

---

## Ringkasan Konsep OOP

| Konsep | Lokasi |
|--------|--------|
| Class & Object | E1, E1P2, E2P3, E3P4 |
| Constructor | E1, E3P4 |
| Access Modifier (`private`) | E1, E1P2, F1P5 |
| Setter & Getter | E1P2, F1P5 |
| Encapsulation | F1P5 |
| Inheritance (`extends`) | F2P6 |
| Polymorphism | F3P7, G4P7 |
| Method Overriding + `@Override` | F3P7, H1Overriding |
| Method Overloading | H2Overloading |
| Abstract Class & Method | I1TugasAbstraksi, I2TugasAbstraksi2 |

---

## Teknologi

| Info | Detail |
|------|--------|
| Bahasa | Java |
| IDE | Visual Studio Code |
| Build | Manual (`javac` / `java`) |
| Package System | Java Package (`Pra1.*`, `Pra2.*`) |

---

## Mata Kuliah

| Info | Detail |
|------|--------|
| Mata Kuliah | Pemrograman Berorientasi Objek |
| Fakultas | FILKOM |
| Semester | 2 |
| Jenis | Praktikum Pra UTS |