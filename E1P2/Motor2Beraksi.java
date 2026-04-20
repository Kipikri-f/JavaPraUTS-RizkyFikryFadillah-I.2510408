package Pra1.E1P2;

public class Motor2Beraksi {
    public static void main(String[] args) {
        Motor2 motor = new Motor2("Hitam", "Yamaha");
        motor.tampilkanInfo();
        motor.setWarna("Biru");
        motor.setMerk("Suzuki");
        motor.tampilkanInfo();
    }
}