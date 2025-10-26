package p4_soal4;
import java.util.Scanner;

public class P4_soal4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukan tahun: ");
        int tahun = s.nextInt();

        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            System.out.println(tahun + " adalah tahun kabisat.");
        } else {
            System.out.println(tahun + " bukan tahun kabisat.");
        }
    }
}