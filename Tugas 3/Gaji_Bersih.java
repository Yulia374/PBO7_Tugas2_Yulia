package gaji_bersih;
import java.util.Scanner;

public class Gaji_Bersih {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nomor Induk Karyawan : ");
        String nik = sc.nextLine();
        System.out.print("Nama Karyawan        : ");
        String nama = sc.nextLine();
        System.out.print("Alamat               : ");
        String alamat = sc.nextLine();
        System.out.print("Jabatan              : ");
        String jabatan = sc.nextLine();

        System.out.print("Gaji Pokok (P1)      : ");
        double p1 = sc.nextDouble();
        System.out.print("Tunjangan Jabatan(P2): ");
        double p2 = sc.nextDouble();
        System.out.print("Tunjangan Istri (P3) : ");
        double p3 = sc.nextDouble();
        System.out.print("Tunjangan Anak  (P4) : ");
        double p4 = sc.nextDouble();

        double totalGaji = p1 + p2 + p3 + p4;
        double pajak = 0.10 * (p1 + p2 + p4);
        double gajiBersih = totalGaji - pajak;

        System.out.println("=== HASIL ===");
        System.out.println("Total Gaji         : " + totalGaji);
        System.out.println("Pajak Penghasilan  : " + pajak);
        System.out.println("Gaji Bersih        : " + gajiBersih);
    }
}