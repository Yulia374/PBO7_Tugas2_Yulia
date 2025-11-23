/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal6;

/**
 *
 * @author Hype
 */
public class CivitasAkademika {
    String nama;
    String status;

    CivitasAkademika (String nama, String status) {
        this.nama = nama;
        this.status = status;
    }

    void info() {
        System.out.println(nama + " adalah " + status + " Fakultas Teknik Informatika");
    }
}
    
