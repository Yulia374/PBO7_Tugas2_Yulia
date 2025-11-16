package p6_soal7;
class MyThread extends Thread {
    // Override method run()
    public void run() {
        System.out.println("Thread baru sedang berjalan...");
    }
}

public class P6_soal7 {

    public static void main(String[] args) {
       // Membuat objek dari kelas turunan
        MyThread threadBaru = new MyThread();

        // Memulai eksekusi thread
        threadBaru.start();
    }
}
