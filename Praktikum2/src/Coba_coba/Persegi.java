package Coba_coba;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal User
 */
public class Persegi {
    public int sisi;
    
    public void tampilSisi(){
        System.out.println("Panjang Sisi: "+sisi);
    }
    
    public int hitungLuas(){
        int luas;
        luas = sisi * sisi;
        System.out.println("\nLuas: "+luas);
        return luas;
    }
    
    public int hitungKeliling(){
        int keliling;
        keliling = 4 * sisi;
        System.out.println("\nKeliling: "+keliling);
        return keliling;
    }
}
