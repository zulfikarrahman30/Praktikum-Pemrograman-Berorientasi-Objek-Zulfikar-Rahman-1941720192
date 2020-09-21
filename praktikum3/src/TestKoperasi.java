
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class TestKoperasi {

    public static void main(String[] args) {
        koperasi donny = new koperasi("111333444", "Donny", 5000000);
        Scanner zr = new Scanner(System.in);
        int x, y;

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjam());

        System.out.print("\nMasukan Jumlah Pinjaman: ");
        y = zr.nextInt();
        donny.getJumlahPinjam();

        if (donny.getJumlahPinjam() < donny.getLimitPinjam()) {
            donny.pinjam(y);
            System.out.println("\nJumlah pinjaman saat ini: " + donny.getJumlahPinjam());

            System.out.print("\nMasukan jumlah angsuran: ");
            x = zr.nextInt();
            donny.angsur(x);
            System.out.println("\nJumlah pinjaman saat ini: " + donny.getJumlahPinjam());
        } else {
            System.out.println("Pinjaman melibihi batas!!!");
        }
//        System.out.println("\nMeminjam Uang 10.000.000. . .");
//        donny.pinjam(5000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());

//        System.out.print("\nMasukan jumlah angsuran: ");
//        x = kr.nextInt();
//        donny.angsur(x);
//        System.out.println("\nMeminjam uang 4.000.000. . .");
//        donny.pinjam(4000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());
//        
//        System.out.println("\nMembayar angsuran 100.000");
//        donny.angsur(100000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());
//        
//        System.out.println("\nMembayar angsuran 3.000.000");
//        donny.angsur(3000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());
    }
}
