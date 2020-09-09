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
public class Nilai {
    public int nim;
    public String nama;
    public String alamat;
    public String matkul;
    public int nilai;
    
    public void tampilNilai(){
        System.out.println("\nNIM         : "+nim);
        System.out.println("Nama Mhs    : "+nama);
        System.out.println("Alamat      : "+alamat);
        System.out.println("Mata Kuliah : "+matkul);
        System.out.println("Nilai       : "+nilai);
    }
}
