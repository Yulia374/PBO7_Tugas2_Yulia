package p6_soal2;

public class P6_soal2 {

    public static void main(String[] args) {
       String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};

        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("Suzuki")) {

                mobil[i] = "Porsche";

                System.out.println("Nilai 'Suzuki' ditemukan pada indeks ke-" + i);
                System.out.println("Nilai baru pada indeks tersebut adalah: " + mobil[i]);
            }
        }

        System.out.println("\nArray setelah diubah:");
        for (String m : mobil) {
            System.out.println(m);
        }
    }
}