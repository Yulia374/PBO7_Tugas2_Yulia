package p4_soal5;
import java.util.Scanner;

public class P4_soal5 {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       
        System.out.print("Masukan pendapatan hari ini : ");
        double pendapatan = s.nextDouble();
        double bonus = 0, komisi = 0, total;

        if (pendapatan <= 2000000) {
            bonus = 100000;
            komisi = 0.10 * pendapatan;
        } else if (pendapatan > 2000000 && pendapatan <= 5000000) {
            bonus = 200000;
            komisi = 0.15 * pendapatan;
        } else {
            bonus = 500000;
            komisi = 0.20 * pendapatan;
        }

        total = pendapatan + bonus + komisi;

        System.out.println("Bonus: " + bonus);
        System.out.println("Komisi: " + komisi);
        System.out.println("Total pendapatan hari ini: " + total);
    }
}