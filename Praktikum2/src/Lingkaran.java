/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Lingkaran {

    public double phi;
    public double r;

    public double hitungLuas() {
        double Luas = phi * r;
        System.out.println("Luas = " + Luas);
        return Luas;
    }

    public double hitungKeliling() {
        double Keliling = 2 * phi * r;
        System.out.println("Keliling = " + Keliling);
        return Keliling;
    }
}
