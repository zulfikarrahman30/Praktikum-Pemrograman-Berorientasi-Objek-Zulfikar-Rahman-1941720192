/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class TestPeminjaman {

    public static void main(String args[]) {
        peminjaman pnj1 = new peminjaman();
        pnj1.id = 23456;
        pnj1.namaMember = "Zulfikar";
        pnj1.namaGame = "DOTA 2";
        pnj1.harga = 50000;
        pnj1.durasi = 5;
        pnj1.tampilData();
    }
}
