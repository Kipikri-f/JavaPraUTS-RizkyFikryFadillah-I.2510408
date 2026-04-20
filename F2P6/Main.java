package Pra1.F2P6;

class Orang {
    String nama;
    int umur;
    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

class Mahasiswa extends Orang {
    String nim;
    void tampilkanNim() {
        System.out.println("NIM: " + nim);
    }
}

class Dosen extends Orang {
    String nidn;
    void tampilkanNidn() {
        System.out.println("NIDN: " + nidn);
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Budi";
        mahasiswa.umur = 20;
        mahasiswa.nim = "123456";
        mahasiswa.tampilkanInfo();
        mahasiswa.tampilkanNim();
        Dosen dosen = new Dosen();
        dosen.nama = "Dr. Ahmad";
        dosen.umur = 40;
        dosen.nidn = "654321";
        dosen.tampilkanInfo();
        dosen.tampilkanNidn();
    }
}