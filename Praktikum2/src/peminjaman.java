/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class peminjaman {

    public int id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int durasi;

    public int totalHarga() {
        int total;
        total = durasi * harga;
        return total;
    }

    public void tampilData() {
        System.out.println("id          : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Harga       : " + harga);
        System.out.println("Durasi      : " + durasi);
        System.out.println("Total       : " + totalHarga());
    }
}
