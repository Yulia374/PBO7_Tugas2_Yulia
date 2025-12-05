package Soal6;
import Soal5.Produk;

public class Komik extends Produk {
    private int jumlahHalaman;

    public Komik(String judul, String penulis, int jumlahHalaman) {
        super(judul, penulis);
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getInfoProduk() {
        return "Komik: " + judul + "\nPenulis: " + penulis + "\nHalaman: " + jumlahHalaman;
    }
}