package p5_soal5;

public class P5_soal5 {

    public static void main(String[] args) {
         int baris = 5;

        System.out.println("Full Triangle:");
        for (int i = 1; i <= baris; i++) {
        int jumlahBintang;
        if (i <= 3) {
            jumlahBintang = 2 * i - 1;
        } else {
            jumlahBintang = 2 * (baris - i) + 1;
        }
        for (int j = 1; j <= (baris - (jumlahBintang + 1) / 2); j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= jumlahBintang; j++) {
            System.out.print("*");
        }
        System.out.println();
}

        System.out.println("\nHalf Triangle:");
        for (int i = 1; i <= baris; i++) {
            for (int j = i; j < baris; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}