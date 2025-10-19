
package kecepatancahaya;

public class KecepatanCahaya {

    public static void main(String[] args) {
        double jarakBulan = 384400;      
        double jarakMatahari = 152100000; 

        double kecepatan = 300000.0; 

        double waktuBulan = jarakBulan / kecepatan;
        double waktuMatahari = jarakMatahari / kecepatan;

        System.out.println("Waktu ke Bulan = " + waktuBulan + " detik");
        System.out.println("Waktu ke Matahari = " + waktuMatahari + " detik");
    }
    
}
