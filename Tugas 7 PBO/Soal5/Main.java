package Soal5;

public class Main {
     public static void main(String[] args) {
        Rekursif rekursif = new Rekursif();
  
        System.out.println("=== FAKTORIAL ===");
        System.out.println("5! = " + rekursif.faktorial(5));
        System.out.println("7! = " + rekursif.faktorial(7));
        
        System.out.println("\n=== PANGKAT ===");
        System.out.println("2^5 = " + rekursif.pangkat(2, 5));
        System.out.println("3^4 = " + rekursif.pangkat(3, 4));
    }
}