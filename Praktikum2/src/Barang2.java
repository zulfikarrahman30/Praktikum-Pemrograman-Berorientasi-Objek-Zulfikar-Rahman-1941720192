/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Barang2 {

    public String Kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int disc() {
        int disc;
        disc = (int) (diskon * 100);
        return disc;
    }

    public int hitungHargaJual() {
        int hargaJual;
        hargaJual = (int) (hargaDasar - (diskon * hargaDasar));
        return hargaJual;
    }

    public void tampilData() {
        System.out.println("Kode        : " + Kode);
        System.out.println("Nama barang : " + namaBarang);
        System.out.println("Harga Dasar : " + hargaDasar);
        System.out.println("Diskon      : " + disc() + "%");
        System.out.println("Harga Jual  : " + hitungHargaJual());
    }
}
