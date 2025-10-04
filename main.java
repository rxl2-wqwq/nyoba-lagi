/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan1;

/**
 *
 * @author Bravo 15
 */
public class main {
    public static void main(String[] args) {
        // objek hewan
        Hewan kucing = new Hewan("Adibasreng", "Kucing brandal", "putih", 4, 2);
        System.out.println("Nama: " + kucing.getNama());
        System.out.println("Jenis: " + kucing.getJenis());
        System.out.println("Warna: " + kucing.getWarna());
        System.out.println("Berat: " + kucing.getBerat() + " Kg");
        System.out.println("Umur: " + kucing.getUmur() + " tahun");
        // Memanggil method
        kucing.berjalan();
        kucing.perilaku();
        kucing.bersuara();
        System.out.println();
        
//        objek laptop
        Laptop laptop = new Laptop("MSI", "KATANA", "AMD Ryzen", 8, 8500000);
        System.out.println("Merk: " + laptop.getMerk());
        System.out.println("Model: " + laptop.getModel());
        System.out.println("Prosesor: " + laptop.getProsesor());
        System.out.println("RAM: " + laptop.getRam() + " GB");
        System.out.println("Harga: Rp. " + laptop.getHarga());
//        method
        laptop.nyalakan();
        laptop. isiBaterai(60);
        laptop.matikan();
        System.out.println();
        
        Kendaraan mobil = new Kendaraan("BMW", "M4", "Hitam", 2014, 200);
        System.out.println("Merk: " + mobil.getMerk());
        System.out.println("Jenis: " + mobil.getJenis());
        System.out.println("Warna: " + mobil.getWarna());
        System.out.println("Tahun: " + mobil.getTahun());
        System.out.println("Kecepatan Maks: " + mobil.getKecepatan() + " km/jam");
//method
        mobil.nyalakanMesin();
        mobil.melaju();
        mobil.berhenti();
 }
}
