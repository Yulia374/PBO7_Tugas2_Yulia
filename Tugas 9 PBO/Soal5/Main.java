package Soal5;

public class Main {
     public static void main(String[] args) {
        Komik k = new Komik("Si Juki Seri Jalan-Jalan Nusantara", "Faza Meonk");
        Games g = new Games("Mobile Legends", "Moonton");

        System.out.println(k.getInfoProduk());
        System.out.println("--------------------------");
        System.out.println(g.getInfoProduk());
    }
}