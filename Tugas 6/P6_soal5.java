package p6_soal5;
import java.util.*;

public class P6_soal5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = in.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int kolom = in.nextInt();

        int[][] matriks = new int[baris][kolom];
        int total = 0;

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matriks[i][j] = in.nextInt();
                total += matriks[i][j];
            }
        }

        System.out.println("Jumlah seluruh elemen matriks: " + total);
    }
}