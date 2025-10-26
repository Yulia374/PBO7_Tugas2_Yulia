package p4_soal3;
import java.util.Scanner;

public class P4_soal3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String nik,nama,status;
        int gol;
        double gapok,anak,gaber=0;
        double tnjpas,tnjanak;
        
        System.out.print("Masukan NIK Karyawan : ");
        nik=s.next();
        System.out.print("Masukan Nama Karyawan : ");
        nama=s.next();
        System.out.print("Masukan Kode Golongan [1/2/3/4] : ");
        gol=s.nextInt();
        
        if (gol==1)
        {
            status="Menikah";
            gapok=1200000;
            tnjpas=0.1*gapok;
            gaber=gapok+tnjpas;
            
        }else if(gol==2)
        {
            status="Belum Menikah";
            gapok=1500000;
            tnjpas=0;
            gaber=gapok+tnjpas;
            
        }else if(gol==3)
        {    
            status="Cerai";
            gapok=1750000;
            tnjpas=0;
            gaber=gapok+tnjpas;
                
        }else if(gol==4)
        {
            status="Menikah dan Punya Anak";
            gapok=2000000;
            
            System.out.print("Masukan Jumlah Anak : ");
            anak=s.nextInt();
            
            tnjanak= 0.5*gapok*anak;
            tnjpas=0.1*gapok;
            gaber=gapok+tnjpas+tnjanak;
            
        }else
        {
            status="Tidak Kode Golongan";
            gapok=0;
        }    
            
        
        System.out.println("==========Data Karyawan===========");
        System.out.println("NIK Karyawan : "+nik);
        System.out.println("Nama Karyawan : "+nama);
        System.out.println("Kode Golongan : "+gol);
        System.out.println("Status Kawin : "+status);
        System.out.println("Gaji Pokok : "+gapok);
        System.out.println("Gaji Bersih : "+gaber);
                
        
    }
    
}
