package Soal1;

public class Main {

    public static void main(String[] args) {
       Mobil mobil1 = new Mobil();
        mobil1.merk = "Toyota";
        mobil1.warna = "Hitam";
        mobil1.tahun = 2023;
        
        Mobil mobil2 = new Mobil();
        mobil2.merk = "Honda";
        mobil2.warna = "Putih";
        mobil2.tahun = 2024;
        
        System.out.println("=== Contoh Objek dari Class Mobil ===");
        mobil1.info();
        mobil1.jalankan();
        System.out.println();
        mobil2.info();
        mobil2.jalankan();
    }
}

//PENJELASAN NO 1 //
//- Kelas (Class) : Adalah blueprint atau cetakan yang berisi atribut (variabel) dan method (fungsi). Kelas belum memiliki data nyata, hanya gambaran.
//- Objek (Object) : Adalah hasil nyata dari kelas. Objek dibuat dengan keyword new. Objek memiliki data sendiri berdasarkan struktur kelas.\
//
//Mekanisme kelas → objek:
//1. Mendefinisikan Kelas
//   - Kelas dibuat sebagai blueprint yang berisi atribut (variabel) dan method (fungsi).
//   - Kelas hanya berupa rancangan, belum memiliki data nyata.
//2. Melakukan Instansiasi
//    Objek dibuat dari kelas menggunakan keyword new.
//3. Pengalokasian Memori
//   - Saat objek dibuat, sistem mengalokasikan memori untuk menyimpan data milik objek tersebut.
//   - Setiap objek memiliki data sendiri-sendiri berdasarkan atribut yang ada dalam kelas.
//4. Mengisi Data ke Dalam Objek
//     Setelah objek tercipta, atributnya dapat diisi atau diubah.
//5. Objek Mengakses Method
//     Objek dapat menjalankan fungsi (method) yang ada dalam kelas.
//6. Objek Bekerja Secara Mandiri
//     Setiap objek yang dibuat dari kelas yang sama tetap memiliki nilai atribut yang berbeda dan dapat melakukan method yang sama.