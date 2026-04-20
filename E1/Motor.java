package Pra1.E1;

public class Motor {
  private String warna;
  private String merk;
  public Motor(String warna, String merk) {
    this.warna = warna;
    this.merk = merk;
  }
  public void tampilkanInfo() {
    System.out.println("Warna: " + warna);
    System.out.println("Merk: " + merk);
  }
}