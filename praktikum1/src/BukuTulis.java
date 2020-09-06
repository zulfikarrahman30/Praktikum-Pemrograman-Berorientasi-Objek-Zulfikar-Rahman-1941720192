/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class BukuTulis extends Buku {

    String bentuk;
    int halaman;

    public void setBentuk(String newValue) {
        bentuk = newValue;
    }

    public void TambahHalaman(int increament) {
        halaman = halaman + increament;
    }

    public void KurangiHalaman(int decreament) {
        halaman = halaman + decreament;
    }

    public void cetakStatus() {
        System.out.println("Bentuk        :" + bentuk);
        System.out.println("Jumlah Halaman:" + halaman);
    }

}
