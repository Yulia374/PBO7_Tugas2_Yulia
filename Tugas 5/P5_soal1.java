package p5_soal1;
import java.util.Scanner;

public class P5_soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] angka = new int[10];
        int terbesar, terkecil;

        System.out.println("Masukkan 10 bilangan:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        terbesar = angka[0];
        terkecil = angka[0];

        for (int i = 1; i < 10; i++) {
            if (angka[i] > terbesar) terbesar = angka[i];
            if (angka[i] < terkecil) terkecil = angka[i];
        }

        System.out.println("Bilangan terbesar: " + terbesar);
        System.out.println("Bilangan terkecil: " + terkecil);
    }
}