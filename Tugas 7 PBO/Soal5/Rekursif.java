package Soal5;

public class Rekursif {
     public int faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorial(n - 1); 
        }
    }
    
    public int pangkat(int angka, int eksponen) {
        if (eksponen == 0) {
            return 1;
        } else {
            return angka * pangkat(angka, eksponen - 1); 
        }
    }
}