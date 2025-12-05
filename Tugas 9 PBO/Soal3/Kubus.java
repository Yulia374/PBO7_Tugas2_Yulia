package Soal3;

public class Kubus {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double getVolume() {
        return sisi * sisi * sisi;
    }
}