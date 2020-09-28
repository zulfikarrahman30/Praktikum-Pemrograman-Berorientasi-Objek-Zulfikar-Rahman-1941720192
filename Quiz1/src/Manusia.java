/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author izul
 */
import java.util.Scanner;
public class Manusia {
Scanner ZR = new Scanner(System.in);
    private String Nama;
    private int Umur;
    private boolean Dewasa;

    public Manusia() {

    }

    public Manusia(String nama, int umur, boolean dewasa) {
        this.Nama = nama;
        this.Umur = umur;
        this.Dewasa = dewasa;

    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public String getNama() {
        return Nama;

    }

    public void setUmur() {
        int umur;
        System.out.println("Masukan Umur anda :");
        this.Umur = ZR.nextInt();
    }

    public int getUmur() {
        return Umur;
    }

    public boolean getDewasa() {
        if (Umur <= 22) {
            Dewasa = false;
        } else {
            Dewasa = true;
        }
        return Dewasa;

    }

    public void info() {
        System.out.println("Nama         : " + getNama());
        System.out.println("Umur         : " + getUmur());

    }
}
