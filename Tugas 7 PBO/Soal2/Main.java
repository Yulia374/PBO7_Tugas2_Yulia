package Soal2;

public class Main {
    public static void main(String[] args) {
    
        PersegiPanjang pp1 = new PersegiPanjang(3, 10);
        PersegiPanjang pp2 = new PersegiPanjang(5, 12);
        
        System.out.println("=== Persegi Panjang 1 ===");
        pp1.tampilkanHasil();
        
        System.out.println("\n=== Persegi Panjang 2 ===");
        pp2.tampilkanHasil();
    }
}