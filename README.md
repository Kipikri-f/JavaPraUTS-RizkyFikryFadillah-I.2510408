# Pre-Midterm Practicum — Object-Oriented Programming (Java)

This repository contains Java source code from the **Object-Oriented Programming (OOP)** Pre-Midterm Practicum. The practicum is divided into two sessions: **Pra1** and **Pra2**.

---

## Folder Structure

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

## Pra1 — First Practicum Session

### E1 — Creating a Class, Object, and Calling Attributes

**Files:** `Motor.java`, `MotorBeraksi.java`
**Package:** `Pra1.E1`

Defines a `Motor` class with two `private` attributes: `warna` (color) and `merk` (brand). A parameterized constructor initializes both attributes when an object is created. The `tampilkanInfo()` method prints the attribute values to the console. The object is instantiated and run from the `MotorBeraksi` class.

**Concepts:** Class, Object, Constructor, Access Modifier (`private`), Method

**Output:**
```
Warna: Merah
Merk: Honda
```

---

### E1P2 — Creating and Calling Methods (Setter)

**Files:** `Motor2.java`, `Motor2Beraksi.java`
**Package:** `Pra1.E1P2`

An extension of E1. The `Motor2` class adds two setter methods — `setWarna()` and `setMerk()` — allowing attribute values to be changed after the object has been created. Demonstrates how object state can be mutated through methods.

**Concepts:** Setter Method, Method Invocation, Object State Mutation

**Output:**
```
Warna: Hitam
Merk: Yamaha
Warna: Biru
Merk: Suzuki
```

---

### E2P3 — Creating Method Parameters

**Files:** `Sepeda.java`, `SepedaBeraksi.java`
**Package:** `Pra1.E2P3`

The `Sepeda` class holds two attributes: `merk` (String) and `kecepatan` (int). The `ubahKecepatan(int kecepatanBaru)` method accepts a parameter to update the speed value. Demonstrates how parameters are used to pass data into methods.

**Concepts:** Method Parameters, `int` Data Type, Attribute Mutation via Parameter

**Output:**
```
Merk: Polygon
Kecepatan: 20 km/jam
Merk: Polygon
Kecepatan: 30 km/jam
```

---

### E3P4 — Creating a Constructor

**Files:** `MobilBaru.java`, `MobilBaruBeraksi.java`
**Package:** `Pra1.E3P4`

The `MobilBaru` class uses a parameterized constructor `(String warna, String merk)` to initialize its attributes at the moment the object is created, using the `this` keyword to distinguish instance variables from parameters.

**Concepts:** Parameterized Constructor, Object Initialization, `this` Keyword

**Output:**
```
Warna: Putih
Merk: Toyota
```

---

### F1P5 — Encapsulation

**Files:** `Mahasiswa.java`, `Sks.java`
**Package:** `Pra1.F1P5`

Applies the encapsulation principle to the `Mahasiswa` class. The attributes `nama` and `sks` are declared `private`, preventing direct external access. They are exposed through a getter `getSks()` and a setter `setSks()`. Demonstrates how to control data access and protect object integrity.

**Concepts:** Encapsulation, `private` Access Modifier, Getter, Setter

**Output:**
```
Nama: Budi
SKS: 24
Nama: Budi
SKS: 30
```

---

### F2P6 — Inheritance

**Files:** `Main.java`
**Package:** `Pra1.F2P6`

All classes are written inside a single file `Main.java`. The `Orang` class acts as the superclass, holding `nama` and `umur` attributes. Both `Mahasiswa` and `Dosen` inherit from `Orang` using the `extends` keyword and each adds its own attribute (`nim` and `nidn` respectively). The `Main` class instantiates both subclasses and calls methods from both the superclass and subclass.

**Concepts:** Inheritance, Superclass, Subclass, `extends`, Inherited Methods

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

### F3P7 — Polymorphism

**Files:** `HewanPolimor.java`
**Package:** `Pra1.F3P7`

All classes are written in a single file. The class hierarchy is: `Hewan` (base) → `Herbivora` and `Karnivora` → `Kelinci` (subclass of `Herbivora`). Each class overrides the `suara()` method. In the main class, all objects are stored in variables of type `Hewan` — each call to `suara()` produces a different output depending on the actual runtime type of the object.

**Concepts:** Polymorphism, Method Overriding, Upcasting, Runtime Dispatch

**Output:**
```
Suara hewan
Suara herbivora
Suara karnivora
Suara kelinci
```

---

### G1T1 — Assignment 1: Mahasiswa Class

**Files:** `Mahasiswa.java`, `MahasiswaBeraksi.java`
**Package:** `Pra1.G1T1`

An independent assignment to create a `Mahasiswa` class with `name` and `nim` attributes, and three methods: `tampilkanNama()`, `tampilkanNIM()`, and `olahraga()`. Three separate objects are instantiated in `MahasiswaBeraksi` to represent three different students (Rein, Nei, Sen).

**Concepts:** Class, Object, Multiple Instances, Method Invocation

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

## Pra2 — Second Practicum Session

### G2T2 — Assignment 2: Matematika Class with Parameters

**Files:** `Matematika.java`, `MatematikaBeraksi.java`
**Package:** `Pra2.G2T2`

The `Matematika` class provides four arithmetic operation methods, each accepting two parameters: `pertambahan` (addition), `pengurangan` (subtraction), `perkalian` (multiplication), and `pembagian` (division). The `pembagian` method uses a `double` return type with an explicit `(double)` cast to prevent integer truncation on division results.

**Concepts:** Method Parameters, Return Values, Type Casting, `double` Data Type

**Output:**
```
Pertambahan: 40
Pengurangan: 5
Perkalian: 200
Pembagian: 10.5
```

---

### G3T3 — Assignment 3: MobilLengkap Class

**Files:** `MobilLengkap.java`, `MobilLengkapBeraksi.java`
**Package:** `Pra2.G3T3`

The `MobilLengkap` class models a car's behavior through three `void` methods with no parameters: `hidupkanMobil()` (start the car), `matikanMobil()` (stop the car), and `ubahGigi()` (change gear). Demonstrates how real-world object behavior can be represented as Java methods.

**Concepts:** `void` Methods, Object Behavior Modeling, Sequential Method Calls

**Output:**
```
Mobil dihidupkan
Gigi mobil diubah
Mobil dimatikan
```

---

### G4P7 — Practicum 7: Polymorphism (Pra2)

**Files:** `HewanPolimor.java`
**Package:** `Pra2.G4P7`

A re-implementation of the polymorphism concept from F3P7 in Pra1, using the same class hierarchy but with cleaner indentation and code structure. All classes are written in a single file.

**Concepts:** Polymorphism, Method Overriding, Upcasting

**Output:**
```
Suara hewan
Suara herbivora
Suara karnivora
Suara kelinci
```

---

### H1Overriding — Method Overriding with `@Override`

**Files:** `BentukBeraksi.java`
**Package:** `Pra2.H1Overriding`

All classes are contained in a single file. The `Bentuk` class defines a `gambar()` method. Subclasses `Segitiga` and `Persegi` override the method using the `@Override` annotation, which explicitly signals that the method is intentionally replacing the parent's version. Variables of type `Bentuk` hold subclass objects — method output differs based on the actual object type.

**Concepts:** Method Overriding, `@Override` Annotation, Polymorphism

**Output:**
```
Menggambar bentuk
Menggambar segitiga
Menggambar persegi
```

---

### H2Overloading — Method Overloading

**Files:** `Hitung.java`, `HitungBeraksi.java`
**Package:** `Pra2.H2Overloading`

The `Hitung` class demonstrates method overloading through three versions of the `tambah()` method: two `int` parameters, two `double` parameters, and three `int` parameters. The compiler selects the correct version at compile time based on the number and types of arguments provided.

**Concepts:** Method Overloading, Compile-time Polymorphism, Method Signature

**Output:**
```
Pertambahan 2 angka (int): 8
Pertambahan 2 angka (double): 8.8
Pertambahan 3 angka (int): 6
```

---

### I1TugasAbstraksi — Abstraction Assignment 1: MakhlukHidup

**Files:** `MakhlukHidup.java`, `MakhlukHidupBeraksi.java`
**Package:** `Pra2.I1TugasAbstraksi`

`MakhlukHidup` is declared as an `abstract class` with one abstract method `bernapas()`. The classes `Manusia` and `Hewan` each provide their own concrete implementation of that method. Since abstract classes cannot be instantiated directly, variables are declared as type `MakhlukHidup` and assigned concrete subclass objects.

**Concepts:** Abstract Class, Abstract Method, Concrete Implementation

**Output:**
```
Manusia bernapas dengan paru-paru
Hewan bernapas dengan berbagai cara
```

---

### I2TugasAbstraksi2 — Abstraction Assignment 2: Kendaraan

**Files:** `Kendaraan.java`, `Mobil.java`, `Sepeda.java`, `KendaraanBeraksi.java`
**Package:** `Pra2.I2TugasAbstraksi2`

Unlike I1, each class is written in its own separate file. `Kendaraan` is an abstract class with one abstract method `bergerak()`. Both `Mobil` and `Sepeda` provide their own implementation. In `KendaraanBeraksi`, variables of the abstract type `Kendaraan` are used to store concrete objects (upcasting).

**Concepts:** Abstract Class, Separate Files per Class, Upcasting to Abstract Type

**Output:**
```
Mobil bergerak dengan roda
Sepeda bergerak dengan pedal
```

---

## How to Run

All files use Java `package` declarations, so they must be compiled from the **root folder** `PraUTS/`.

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

**2. Run (use the full package name):**
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

## OOP Concepts Summary

| Concept | Location |
|---------|----------|
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

## Tech Stack

| Info | Detail |
|------|--------|
| Language | Java |
| IDE | Visual Studio Code |
| Build | Manual (`javac` / `java`) |
| Package System | Java Package (`Pra1.*`, `Pra2.*`) |

---

## Course Info

| Info | Detail |
|------|--------|
| Course | Object-Oriented Programming |
| Faculty | FILKOM |
| Semester | 2 |
| Type | Pre-Midterm Practicum |