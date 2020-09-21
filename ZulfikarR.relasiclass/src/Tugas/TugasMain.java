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
public class TugasMain {

    public static void main(String[] args) {
        //try{
        Mahasiswa m = new Mahasiswa(1941720192, "Zulfikar");
        Dosen d = new Dosen(12371037, "Azura");
        RuangKelas r = new RuangKelas("LPR1");
        MataKuliah k = new MataKuliah("P01", "PBO");
        k.setDosen(d);
        k.setMahasiswa(m);
        k.setRuangKelas(r);

        k.info();
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
    }
}
