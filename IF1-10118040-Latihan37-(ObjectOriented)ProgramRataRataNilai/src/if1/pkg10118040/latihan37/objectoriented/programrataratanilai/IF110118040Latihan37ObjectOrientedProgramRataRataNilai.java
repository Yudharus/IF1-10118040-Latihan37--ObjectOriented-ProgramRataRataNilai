/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118040.latihan37.objectoriented.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author asus
  * NAMA     : Moch Yudha Rusdian
 * KELAS    : IF-1
 * NIM      : 10118040
 * Deskripsi Program : Menampilkan rata-rata nilai
 */
public class IF110118040Latihan37ObjectOrientedProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Mahasiswa mah = new Mahasiswa();
         Scanner scn = new Scanner(System.in);

         int n;
         System.out.print("Masukkan Banyaknya Mahasiswa : ");
         n = scn.nextInt();

         mah.HitungTotal(mah.nilaiMhs, n);
         mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs, n);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : "+mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs,n));
        System.out.println("Developed by : Moch Yudha Rusdian");
    
    }
    
}
