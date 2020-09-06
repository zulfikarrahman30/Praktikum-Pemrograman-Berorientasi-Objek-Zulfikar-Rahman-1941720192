/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class GelasPlastik {

    private int plastik, gangang;
    private String warna;

    public void setWarna(String newValues) {
        warna = newValues;
    }

    public void tambahDiamterPlastik(int increment) {
        plastik = increment + increment;
    }

    public void tambahPanjangGangang(int increment) {
        gangang = gangang + increment;
    }

    public void cetakStatus() {
        System.out.println("Warna              : " + warna);
        System.out.println("Diameter plastik   : " + plastik + " " + "mm");
        System.out.println("Panjang Gangang    : " + gangang + "" + "mm");
    }
}
