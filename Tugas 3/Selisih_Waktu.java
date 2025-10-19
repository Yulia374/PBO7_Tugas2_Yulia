package selisih_waktu;
import java.util.Scanner;

public class Selisih_Waktu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Waktu pertama (jam): ");
        int jam1 = sc.nextInt();
        System.out.print("Waktu pertama (menit): ");
        int menit1 = sc.nextInt();
        System.out.print("Waktu pertama (detik): ");
        int detik1 = sc.nextInt();

        System.out.print("\nWaktu kedua (jam): ");
        int jam2 = sc.nextInt();
        System.out.print("Waktu kedua (menit): ");
        int menit2 = sc.nextInt();
        System.out.print("Waktu kedua (detik): ");
        int detik2 = sc.nextInt();

        int total1 = jam1 * 3600 + menit1 * 60 + detik1;
        int total2 = jam2 * 3600 + menit2 * 60 + detik2;

        int selisih = Math.abs(total2 - total1);

        int jam = selisih / 3600;
        selisih %= 3600;
        int menit = selisih / 60;
        int detik = selisih % 60;

        System.out.println("\nSelisih waktu: " + jam + " jam " + menit + " menit " + detik + " detik");
    }
}