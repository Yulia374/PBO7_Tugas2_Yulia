package menghitung_gaya;
import java.util.Scanner;

public class Menghitung_Gaya {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Massa (m) : ");
        double m = sc.nextDouble();
        System.out.print("Kecepatan (v) : ");
        double v = sc.nextDouble();
        System.out.print("Jari-jari (r) : ");
        double r = sc.nextDouble();

        double Fc = m * v * v / r;
        System.out.println("Gaya Sentripetal = " + Fc);
    }
}