package Soal6;
import Soal5.Produk;

public class Games extends Produk {
    private int waktuMain;

    public Games(String judul, String penulis, int waktuMain) {
        super(judul, penulis);
        this.waktuMain = waktuMain;
    }

    public String getInfoProduk() {
        return "Game: " + judul + "\nDeveloper: " + penulis + "\nWaktu Main: " + waktuMain + " jam";
    }
}