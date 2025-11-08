package p5_soal4;
import java.util.Scanner;

public class P5_soal4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak angka: ");
        int n = input.nextInt();

        int jumlah = 0;
        int angka = 1;

        System.out.print("Angka ganjil: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(angka + " ");
            jumlah += angka;
            angka += 2;
        }

        System.out.println("\nTotal penjumlahan: " + jumlah);
    }
}