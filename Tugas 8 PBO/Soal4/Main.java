package Soal4;

public class Main {
    public static void main(String[] args) {
        Kasir k1 = new Kasir(10000);
        Kasir k2 = new Kasir(10000, 3);
        Kasir k3 = new Kasir(10000, 3, 10);

        System.out.println("Total 1 = " + k1.total());
        System.out.println("Total 2 = " + k2.total());
        System.out.println("Total 3 = " + k3.total());
    }
}