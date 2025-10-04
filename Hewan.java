/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan1;

/**
 *
 * @author Bravo 15
 */
public class Hewan {
    private  String nama;
    private  String jenis;  
    private  String warna;
    private  int berat;
    private  int umur;

    // constructor 
    public Hewan(String nama, String jenis, String warna, int berat, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.warna = warna;
        this.berat = berat;
        this.umur = umur;
    }

    // get
    public String getNama() { return nama; }
    public String getJenis() { return jenis; }
    public String getWarna() { return warna; }
    public int getBerat() { return berat; }
    public int getUmur() { return umur; }

    // method 
    public void bersuara() {
        System.out.println(nama + " mengeong: Meooow!");
    }

    public void berjalan() {
    System.out.println(nama + " sedang berjalan dengan riang gembira.");
}

    public void perilaku() {
        System.out.println(nama + " adalah seekor " + jenis + " berwarna " + warna + ".");
        System.out.println("Berumur " + umur + " tahun.");
        if (umur < 2) {
            System.out.println(nama + " masih kecil dan suka bermain.");
        } else if (umur < 7) {
            System.out.println(nama + " aktif dan sering berlari-lari.");
        } else {
            System.out.println(nama + " lebih banyak beristirahat karena sudah tua.");
        }
    }
}

