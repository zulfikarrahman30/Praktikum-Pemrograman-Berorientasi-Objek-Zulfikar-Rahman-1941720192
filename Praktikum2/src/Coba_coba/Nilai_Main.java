/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coba_coba;

/**
 *
 * @author Personal User
 */
import java.util.Scanner;
public class Nilai_Main {
    public static void main(String[] args){
        Scanner izul = new Scanner (System.in);
        Nilai n = new Nilai();
        
        System.out.print("Masukan NIM: ");
        n.nim = izul.nextInt();
        System.out.print("Masukan Nama Mahsiswa: ");
        n.nama = izul.next();
        System.out.print("Masukan Alamat: ");
        n.alamat = izul.next();
        System.out.print("Masukan Nama Mata Kuliah: ");
        n.matkul = izul.next();
        System.out.print("Masukan Nilai: ");
        n.nilai = izul.nextInt();
        
        n.tampilNilai();
    }
}
