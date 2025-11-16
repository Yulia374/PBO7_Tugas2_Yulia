package p6_soal9;

public class P6_soal9 {

    public static void main(String[] args) {
       int[] age = {12, 4, 5, 2, 6};

        System.out.print("Menggunakan for biasa: ");
        for (int i = 0; i < age.length; i++) {
            System.out.print(age[i] + " ");
        }

        System.out.print("\nMenggunakan foreach: ");
        for (int x : age) System.out.print(x + " ");
    }
}