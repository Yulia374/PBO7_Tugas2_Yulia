package Soal2;

public class Pangkat {
    public int hitung(int a, int b) {
        int hasil = 1;
        for (int i = 0; i < b; i++) {
            hasil *= a;
        }
        return hasil;
    }
}