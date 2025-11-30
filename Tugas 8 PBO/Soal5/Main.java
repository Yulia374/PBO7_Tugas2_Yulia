    package Soal5;

public class Main {
      public static int hitungLuasHitam(Bidang besar, Bidang kecil) {
        return besar.luas() - kecil.luas();
    }

    public static void main(String[] args) {
        Bidang besar = new Bidang(10, 8);
        Bidang kecil = new Bidang(5, 4);

        System.out.println("Luas hitam = " + hitungLuasHitam(besar, kecil));
    }
}
