package p4_soal7;
import java.util.Scanner;

public class P4_soal7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        double luas;

        System.out.println("=== Menu Luas Bangun Datar ===");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("4. Trapesium");
        System.out.println("5. Layang-layang");
        System.out.print("Pilih (1-5): ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi: ");
                double s = input.nextDouble();
                luas = s * s;
                System.out.println("Luas Persegi = " + luas);
                break;
            case 2:
                System.out.print("Masukkan alas: ");
                double a = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t = input.nextDouble();
                luas = 0.5 * a * t;
                System.out.println("Luas Segitiga = " + luas);
                break;
            case 3:
                System.out.print("Masukkan jari-jari: ");
                double r = input.nextDouble();
                double phi = 3.14;
                luas = phi * r * r;
                System.out.println("Luas Lingkaran = " + luas);
                break;
            case 4:
                System.out.print("Masukkan sisi atas: ");
                double atas = input.nextDouble();
                System.out.print("Masukkan sisi bawah: ");
                double bawah = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();
                luas = 0.5 * (atas + bawah) * tinggi;
                System.out.println("Luas Trapesium = " + luas);
                break;
            case 5:
                System.out.print("Masukkan diagonal 1: ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan diagonal 2: ");
                double d2 = input.nextDouble();
                luas = 0.5 * d1 * d2;
                System.out.println("Luas Layang-layang = " + luas);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}
