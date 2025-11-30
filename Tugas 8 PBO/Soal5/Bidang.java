package Soal5;

public class Bidang {
    int panjang;
    int lebar;

    public Bidang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int luas() {
        return panjang * lebar;
    }
}