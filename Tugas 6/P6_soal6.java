package p6_soal6;
import java.util.*;

public class P6_soal6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Masukkan jumlah bilangan: ");
            int n = in.nextInt();

            int[] arr = new int[n];
            int total = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Bilangan ke-" + i + ": ");
                arr[i] = in.nextInt();
                total += arr[i];
            }

            System.out.println("Rata-rata = " + (double) total / n);

        } catch (InputMismatchException e) {
            System.out.println("Inputan harus berupa angka!");
        }
    }
}