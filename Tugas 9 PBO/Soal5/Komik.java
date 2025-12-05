package Soal5;

public class Komik extends Produk {

    public Komik(String judul, String penulis) {
        super(judul, penulis);
    }

    public String getInfoProduk() {
        return "Komik: "+ judul +"\nPenulis: " + penulis;
    }
}