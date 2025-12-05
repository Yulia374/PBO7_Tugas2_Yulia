package Soal1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Macam-macam hewan:");
        new DuaKaki().info();
        new EnamKaki().info();
        new EmpatKaki().info();
        new DelapanKaki().info();

        System.out.println("\nContoh hewan:");
        new DuaKaki().contoh();
        new EnamKaki().contoh();
        new EmpatKaki().contoh();
        new DelapanKaki().contoh();
    }
}