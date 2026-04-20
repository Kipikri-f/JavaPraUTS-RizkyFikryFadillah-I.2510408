package Pra1.F1P5;

public class Mahasiswa {
    private String nama;
    private int sks;
    public Mahasiswa(String nama, int sks) {
        this.nama = nama;
        this.sks = sks;
    }
    public void setSks(int sks) {
        this.sks = sks;
    }
    public int getSks() {
        return sks;
    }
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
    }
}