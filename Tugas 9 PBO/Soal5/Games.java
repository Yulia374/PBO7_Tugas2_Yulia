package Soal5;

public class Games extends Produk {

    public Games(String judul, String penulis) {
        super(judul, penulis);
    }

    public String getInfoProduk() {
        return "Game: " + judul +"\nDeveloper: " + penulis;
    }
}