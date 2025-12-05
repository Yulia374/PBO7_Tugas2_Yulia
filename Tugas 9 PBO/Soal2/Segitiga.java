package Soal2;

public class Segitiga {
    protected double alas, tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    protected double hitungLuas() {
        return (alas * tinggi) / 2;
    }
}