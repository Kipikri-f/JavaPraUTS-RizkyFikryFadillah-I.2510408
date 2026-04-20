package Pra1.F3P7;

class Hewan {
    void suara() {
        System.out.println("Suara hewan");
    }
}

class Herbivora extends Hewan {
    void suara() {
        System.out.println("Suara herbivora");
    }
}

class Karnivora extends Hewan {
    void suara() {
        System.out.println("Suara karnivora");
    }
}
class Kelinci extends Herbivora {
    void suara() {
        System.out.println("Suara kelinci");
    }
}
public class HewanPolimor {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();
        Hewan hewan2 = new Herbivora();
        Hewan hewan3 = new Karnivora();
        Hewan hewan4 = new Kelinci();
        hewan1.suara();
        hewan2.suara();
        hewan3.suara();
        hewan4.suara();
    }
}
