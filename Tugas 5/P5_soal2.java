package p5_soal2;
import java.util.Scanner;

public class P5_soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan: ");
        int n = input.nextInt();

        int jumlah = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Bilangan ke-" + i + ": ");
            int angka = input.nextInt();
            jumlah += angka;
        }

        double rata = (double) jumlah / n;
        System.out.println("Total jumlah bilangan: " + jumlah);
        System.out.println("Rata-rata: " + rata);
    }
}
