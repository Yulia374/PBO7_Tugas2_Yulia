package p6_soal3;
import java.util.*;

public class P6_soal3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + i + ": ");
            arr[i] = in.nextInt();
        }

        int max = arr[0], min = arr[0];
        int idxMax = 0, idxMin = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idxMax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                idxMin = i;
            }
        }

        System.out.println("\nNilai terbesar: " + max + " (indeks: " + idxMax + ")");
        System.out.println("Nilai terkecil: " + min + " (indeks: " + idxMin + ")");

        int total = 0;
        for (int x : arr) total += x;

        System.out.println("Jumlah seluruh elemen: " + total);
        System.out.println("Rata-rata: " + ((double) total / n));

        int jumlahGanjil = 0;
        for (int i = 1; i < n; i += 2) {
            jumlahGanjil += arr[i];
        }
        System.out.println("Jumlah elemen indeks ganjil: " + jumlahGanjil);

        if (jumlahGanjil % 2 == 0)
            System.out.println("Jumlah elemen indeks genap adalah bilangan GENAP");
        else
            System.out.println("Jumlah elemen indeks genap adalah bilangan GANJIL");
        
        Arrays.sort(arr);
        System.out.println("\nArray setelah diurutkan:");
        for (int x : arr) System.out.print(x + " ");
    }
}