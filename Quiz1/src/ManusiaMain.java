/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author izul
 */
public class ManusiaMain {

    public static void main(String[] args) {
        Pria p = new Pria();
        Wanita w = new Wanita();

        // priaa
        System.out.println("Contoh Pria dan wanita belum dewasa dan Dewasa");
        p.setUmur();
        p.setNama("Zulfikar Rahman");
        p.Pria();
        System.out.println("");
        //wanita
        w.setUmur();
        w.setNama("Natasha Romanov");
        w.Wanita();

    }
}
