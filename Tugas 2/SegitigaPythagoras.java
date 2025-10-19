
package segitigapythagoras;

public class SegitigaPythagoras {

    public static void main(String[] args) {
        int a = 6;
        int b = 8;

        double c = Math.sqrt((a * a) + (b * b));
        double keliling = a + b + c;

        System.out.println("Nilai c adalah : " + c);
        System.out.println("Keliling segitiga adalah : " + keliling);
    }
    
}
