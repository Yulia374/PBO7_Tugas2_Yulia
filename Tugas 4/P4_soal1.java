package p4_soal1;
import java.util.Scanner;

public class P4_soal1 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan Bilangan : ");
        int bilangan = s.nextInt();
        
        if(bilangan %2 == 0){
            System.out.println(bilangan + " adalah bilangan genap");
        }else{
            System.out.println(bilangan + " adalah bilangan ganjil");
        }
    }
    
}
