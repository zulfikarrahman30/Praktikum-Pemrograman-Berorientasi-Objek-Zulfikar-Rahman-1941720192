
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
public class Wanita extends Manusia {

    private String namaSuami;

    public void setNamaSuami() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Suami Anda :");
        String newValue = sc.next();
        namaSuami = newValue;
        System.out.println("Profil Wanita");
        super.info();
    }

    public void Wanita() {
        System.out.println("Profil Wanita");
        super.info();
        if (super.getDewasa() == true) {
            System.out.println("Wanita sudah dewasa harus punya suami");
            setNamaSuami();
            System.out.println("Nama Suami: " + namaSuami);
        } else {
            System.out.println("Wanita ini masih kuliah");
        }
    }
}
