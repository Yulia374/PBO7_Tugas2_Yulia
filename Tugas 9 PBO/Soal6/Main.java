package Soal6;

public class Main {
    public static void main(String[] args) {
        Komik k = new Komik("Si Juki Seri Jalan-Jalan Nusantara", "Faza Meonk", 116);
        Games g = new Games("Mobile Legends", "Moonton", 24);

        System.out.println(k.getInfoProduk());
         System.out.println("--------------------------");
        System.out.println(g.getInfoProduk());
    }
}