package Soal1;

public class Mobil {
   String merk;
    String warna;
    int tahun;
    
    void info() {
        System.out.println("Mobil: " + merk + ", \nWarna: " + warna + ", \nTahun: " + tahun);
    }
    
    void jalankan() {
        System.out.println(merk + " sedang berjalan...");
    }
}