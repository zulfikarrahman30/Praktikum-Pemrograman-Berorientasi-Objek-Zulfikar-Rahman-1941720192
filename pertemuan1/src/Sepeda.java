/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Sepeda {

    private String merek;
    private String warna;
    private int kecepatan;
    private int gear;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setWarna(String newValues) {
        warna = newValues;
    }

    public void gantiGear(int newValue) {
        gear = newValue;
    }

    public void tambahKecepatan(int increment) {
        kecepatan = kecepatan + increment;
    }

    public void rem(int decrement) {
        kecepatan = kecepatan - decrement;
    }

    public void cetakStatus() {
        System.out.println("\nMerek       : " + merek);
        System.out.println("Warna       : " + warna);
        System.out.println("Kecepatan   : " + kecepatan);
        System.out.println("Gear        : " + gear);
    }
}
