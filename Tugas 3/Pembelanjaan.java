package pembelanjaan;
import java.io.*;

public class Pembelanjaan {

    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);

        try {
           
            System.out.print("Nama : ");
            String nama = dis.readLine();

            System.out.print("Total Belanja : ");
            double total = Double.parseDouble(dis.readLine());

            System.out.print("Diskon (%) : ");
            double diskon = Double.parseDouble(dis.readLine());

            System.out.print("Bayar : ");
            double bayar = Double.parseDouble(dis.readLine());

            
            double potongan = total * diskon / 100;
            double totalBayar = total - potongan;
            double kembalian = bayar - totalBayar;

         
            System.out.println("\n=== HASIL ===");
            System.out.println("Nama        : " + nama);
            System.out.println("Total       : " + total);
            System.out.println("Diskon      : " + diskon + "%");
            System.out.println("Potongan    : " + potongan);
            System.out.println("Total Bayar : " + totalBayar);
            System.out.println("Bayar       : " + bayar);
            System.out.println("Kembalian   : " + kembalian);

            
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("struk.txt"));
            dos.writeBytes("===== STRUK PEMBAYARAN =====\n");
            dos.writeBytes("Nama        : " + nama + "\n");
            dos.writeBytes("Total       : " + total + "\n");
            dos.writeBytes("Diskon      : " + diskon + "%\n");
            dos.writeBytes("Potongan    : " + potongan + "\n");
            dos.writeBytes("Total Bayar : " + totalBayar + "\n");
            dos.writeBytes("Bayar       : " + bayar + "\n");
            dos.writeBytes("Kembalian   : " + kembalian + "\n");

            dos.close();
            System.out.println("\n(Struk berhasil disimpan ke file struk.txt)");

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan input/output!");
        }
    }
}