/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author USER
 */
public class RuangKelas {

    private String kode;
    //private Mahasiswa jumlahMhs[];

    public RuangKelas(String kode/*, int jumlah*/) {
        this.kode = kode;
        //this.jumlahMhs = new Mahasiswa[jumlah];
    }

//    private void arrMhs(){
//        for (int i = 0; i < jumlahMhs.length; i++){
//            this.jumlahMhs[i] = new Mahasiswa(String.valueOf(i + 1))
//        }
//    }
    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

//    public void setMahasiswa(Mahasiswa mahasiswa){
//        
//    }
//    public void setJumlahmhs(Mahasiswa[] jumlahmhs) {
//        this.jumlahMhs = jumlahmhs;
//    }
    public String info() {
        String info = "";
        info += "Kode: " + this.kode + "\n";
        return info;
    }
}
