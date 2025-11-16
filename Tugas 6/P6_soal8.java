package p6_soal8;

public class P6_soal8 {

    public static void main(String[] args) {
      int jumlahThread = 10;

        for (int i = 1; i <= jumlahThread; i++) {
            int nomor = i; 

            Thread t = new Thread(() -> {
                System.out.println("Thread ke-" + nomor + " sedang berjalan");
            });

            t.start();
        }
    }
}