package percetakan_novel;
import java.util.Scanner;

public class Percetakan_Novel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah novel yang dicetak: ");
        int novel = sc.nextInt();
        System.out.print("Jumlah lembar per novel: ");
        int lembar = sc.nextInt();

        int totalWaktuDetik = novel * lembar; 

        int hari = totalWaktuDetik / 86400;
        totalWaktuDetik %= 86400;
        int jam = totalWaktuDetik / 3600;
        totalWaktuDetik %= 3600;
        int menit = totalWaktuDetik / 60;
        int detik = totalWaktuDetik % 60;

        System.out.println("Waktu yang dibutuhkan: " + hari + " hari " + jam + " jam " + menit + " menit " + detik + " detik");
    }
}