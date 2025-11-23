package Soal7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = sc.nextLine();

        System.out.print("NPM: ");
        String npm = sc.nextLine();

        System.out.print("Kelas: ");
        String kelas = sc.nextLine();

        Mahasiswa m = new Mahasiswa(nama, npm, kelas);
        m.tampil();
    }
}
    