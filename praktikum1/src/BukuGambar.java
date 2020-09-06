/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class BukuGambar extends Buku{
    private String jenisKertas;
    private int ketebalan;
    
    
    public void setKertas(String newValue) {
        jenisKertas = newValue;
    }
    public void setKetebalan(int newValue){
        ketebalan = newValue;
    }
    
   
    public void cetakStatus() {
        System.out.println("\njenis kertas       : " + jenisKertas);
        System.out.println("Ketebalan            :"  + ketebalan);
    }
}
