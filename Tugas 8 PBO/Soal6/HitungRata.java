package Soal6;

public class HitungRata {
     int[] nilai;

    public HitungRata(int[] nilai) {
        this.nilai = nilai;
    }

    public double rata() {
        int total = 0;
        for (int n : nilai) total += n;
        return total / (double) nilai.length;
    }
}