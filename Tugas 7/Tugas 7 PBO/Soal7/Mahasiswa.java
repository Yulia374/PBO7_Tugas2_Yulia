package Soal7;
import java.util.Scanner;

public class Mahasiswa {
    String nama;
    String npm;
    String kelas;

    Mahasiswa(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    void tampil() {
        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("Nama  : " + this.nama);
        System.out.println("NPM   : " + this.npm);
        System.out.println("Kelas : " + this.kelas);
    }
}
