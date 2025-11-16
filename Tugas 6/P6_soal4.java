package p6_soal4;

import java.util.Scanner;

public class P6_soal4 {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = in.nextInt();

        String[] nama = new String[n];
        int[] nilai = new int[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nama: ");
            nama[i] = in.next();

            System.out.print("Nilai: ");
            nilai[i] = in.nextInt();

            status[i] = (nilai[i] >= 50) ? "Lulus" : "Tidak Lulus";
        }

        System.out.println("\nDaftar Nilai Mahasiswa");
        System.out.println("No\tNama\tNilai\tStatus");

        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "\t" + nama[i] + "\t" + nilai[i] + "\t" + status[i]);
        }
    }
    
}