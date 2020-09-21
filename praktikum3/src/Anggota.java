/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Anggota {
     private String nama;
    private String alamat;
    private float simpanan;

    Anggota(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = simpanan = 0;
    }

    Anggota(String string, String donny, int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public float getSimpanan() {
        return simpanan;
    }
    
    public void setor(float uang){
        simpanan += uang;
    }
    
    public void pinjam(float uang){
        simpanan -= uang;
    }
}
