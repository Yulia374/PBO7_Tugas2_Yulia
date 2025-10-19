package perbedaan;
import java.util.Scanner;
import java.io.*;

public class Perbedaan {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input dengan Scanner : ");
        int a = sc.nextInt();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input dengan BufferedReader : ");
        int b = Integer.parseInt(br.readLine());
        
        System.out.println("Scanner = " + a);
        System.out.println("BufferedReader = " + b);
    }
}