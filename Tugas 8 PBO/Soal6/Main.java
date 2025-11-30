package Soal6;

public class Main {
     public static void main(String[] args) {
        int[] data = {10, 20, 30, 40};

        HitungRata h = new HitungRata(data);
        System.out.println("Rata-rata = " + h.rata());
    }
}