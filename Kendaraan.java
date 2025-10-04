/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan1;

/**
 *
 * @author Bravo 15
 */
public class Kendaraan {
    private String merk;
    private String jenis;
    private String warna;
    private int tahun;
    private int kecepatan;

    // constructor
    public Kendaraan(String merk, String jenis, String warna, int tahun, int kecepatan) {
       this.merk = merk;
       this.jenis = jenis;
       this.warna = warna;
       this.tahun = tahun;
       this.kecepatan = kecepatan;
    }

    // getter
    public String getMerk() { return merk; }
    public String getJenis() { return jenis; }
    public String getWarna() { return warna; }
    public int getTahun() { return tahun; }
    public int getKecepatan() { return kecepatan; }

//    method
    public void nyalakanMesin() {
        System.out.println(merk + " " + jenis + " mesinnya dinyalakan...");
    }

    public void melaju() {
        System.out.println(merk + " " + jenis + " melaju dengan kecepatan " + kecepatan + " km/jam.");
    }

    public void berhenti() {
        System.out.println(merk + " " + jenis + " berhenti.");
    }
}
