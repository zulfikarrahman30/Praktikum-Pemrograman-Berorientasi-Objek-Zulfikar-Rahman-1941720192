/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class KipasAngin {
    private String kecepatan,warna,merek;
    
    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setWarna(String newValues) {
        warna = newValues;
    }

    public void TambahKecepatan(int increament) {
        kecepatan = kecepatan + increament;
    }
    public void KurangiKecepatan(int decrement) {
        kecepatan = kecepatan + decrement;
    }
    public void cetakStatus() {
        System.out.println("\nMerek       : " + merek);
        System.out.println("Warna       : " + warna);
        System.out.println("Kecepatan   : " + kecepatan);
       
    }
}
