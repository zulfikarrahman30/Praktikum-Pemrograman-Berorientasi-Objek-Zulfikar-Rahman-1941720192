/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class RunObject {

    public static void main(String[] args) {
        Buku bk = new Buku();
        BukuGambar gambar = new BukuGambar();
        BukuTulis tulis = new BukuTulis();
        GelasPlastik Gp = new GelasPlastik();
        KipasAngin Kp = new KipasAngin();

        //Gelas PLastik
        System.out.println("gelas plastik");
        Gp.setWarna("Merah");
        Gp.tambahDiamterPlastik(8);
        Gp.tambahPanjangGangang(2);
        Gp.cetakStatus();

        //Kipas Angin
        Kp.setMerek("Cosmos");
        Kp.setWarna("Kuning");
        Kp.TambahKecepatan(5);
        Kp.KurangiKecepatan(2);
        Kp.cetakStatus();

        //Buku tulis
        System.out.println("buku tulis");
        bk.setMerek("sinar mas");
        bk.setTambahPanjang(5);
        bk.setTambahLebar(2);
        bk.setKurangiPanjang(2);
        bk.setKurangiLebar(1);
        tulis.setBentuk("persegi panjang");
        tulis.TambahHalaman(5);
        tulis.KurangiHalaman(2);
        bk.cetakStatus();
        tulis.cetakStatus();

        //Buku Gambar
        System.out.println("buku gambar");
        bk.setMerek("audi");
        bk.setTambahPanjang(5);
        bk.setTambahLebar(2);
        bk.setKurangiPanjang(2);
        bk.setKurangiLebar(1);
        gambar.setKertas("a4");
        gambar.setKetebalan(2);
        bk.cetakStatus();
        gambar.cetakStatus();

    }
}
