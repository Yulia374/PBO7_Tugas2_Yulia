package Soal4;

public class Kasir {
    double harga;
    int jumlah;
    double diskon;

    public Kasir(double harga) {
        this.harga = harga;
        this.jumlah = 1;
        this.diskon = 0;
    }

    public Kasir(double harga, int jumlah) {
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = 0;
    }

    public Kasir(double harga, int jumlah, double diskon) {
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = diskon;
    }

    public double total() {
        double total = harga * jumlah;
        total -= total * (diskon / 100);
        return total;
    }

}
