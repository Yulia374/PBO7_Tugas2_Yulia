package Soal2;

public class PersegiPanjang {

    double panjang;
    double lebar;
   
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    
    public void tampilkanHasil() {
        System.out.println("Panjang: " + panjang + " cm");
        System.out.println("Lebar: " + lebar + " cm");
        System.out.println("Keliling: " + hitungKeliling() + " cm");
    }
}