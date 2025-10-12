
package konversisuhu;

public class KonversiSuhu {

    public static void main(String[] args) {
        
        int C = 10;
        int F = 15;
        int R = 5;

        
        float CtoF = (C * 9f/5f) + 32;    
        double FtoC = (F - 32) * 5 / 9.0;  

        float CtoR = C * 4f/5f;            
        float RtoC = R * 5f/4f;            

        double FtoR = (F - 32) * 4.0 / 9.0;  
        float RtoF = (R * 9f/4f) + 32;      

        System.out.println("Celsius ke Fahrenheit = " + CtoF);
        System.out.println("Fahrenheit ke Celsius = " + FtoC);
        System.out.println("Celsius ke Reamur     = " + CtoR);
        System.out.println("Reamur ke Celsius     = " + RtoC);
        System.out.println("Fahrenheit ke Reamur  = " + FtoR);
        System.out.println("Reamur ke Fahrenheit  = " + RtoF);
    }
    
}
