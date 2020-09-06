/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Buku {

    private String merek;
    private int panjang, lebar;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setTambahPanjang(int increament) {
        panjang = panjang + increament;
    }

    public void setKurangiPanjang(int decreament) {
        panjang = panjang + decreament;
    }

    public void setTambahLebar(int increament) {
        lebar = lebar + increament;
    }

    public void setKurangiLebar(int decreament) {
        lebar = lebar + decreament;
    }

    public void cetakStatus() {
        System.out.println("\nMerek       : "+ merek);
        System.out.println("panjang       :" + panjang);
        System.out.println("lebar         :" + lebar);

    }

}
