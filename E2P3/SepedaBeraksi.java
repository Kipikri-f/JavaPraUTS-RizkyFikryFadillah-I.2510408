package Pra1.E2P3;

public class SepedaBeraksi {
    public static void main(String[] args) {
        Sepeda sepeda = new Sepeda("Polygon", 20);
        sepeda.tampilkanInfo();
        sepeda.ubahKecepatan(30);
        sepeda.tampilkanInfo();
    }
}