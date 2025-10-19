package buah;
import java.io.*;

public class Buah {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Jumlah mangga dibeli: ");
        int mangga = Integer.parseInt(br.readLine());
        System.out.print("Jumlah jambu dibeli: ");
        int jambu = Integer.parseInt(br.readLine());

        int totalDiberikan = 4 * 30;
        int manggaBusuk = 15;

        int total = mangga + jambu - manggaBusuk;
        
        System.out.println("Total buah bersih: " + total);
    }
}