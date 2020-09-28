
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author izul
 */
public class Pria extends Manusia {

    private String namaIstri;

    public void setNamaIstri() {
        Scanner ZR = new Scanner(System.in);
        System.out.print("Masukkan Nama Istri Anda :");
        String newValue = ZR.next();
        namaIstri = newValue;
        System.out.println("Profil Pria");
        super.info();
    }
    

    public void Pria() {
        System.out.println("Profil Pria");
        super.info();
        if (super.getDewasa() == true) {
            System.out.println("Harus punya istri");
            setNamaIstri();
            System.out.println("Nama Istri: " + namaIstri);
        } else {
            System.out.println("Pria ini masih kuliah");
        }
    }
}
