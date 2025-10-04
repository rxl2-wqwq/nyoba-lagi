/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan1;

/**
 *
 * @author Bravo 15
 */
public class Laptop {
    private String merk;
    private String model;
    private String prosesor;
    private int ram;
    private int harga;

    // constructor
    public Laptop(String merk, String model, String prosesor, int ram, int harga) {
        this.merk = merk;
        this.model = model;
        this.prosesor = prosesor;
        this.ram = ram;
        this.harga = harga;
    }

    // getter
    public String getMerk() { return merk; }
    public String getModel() { return model; }
    public String getProsesor() { return prosesor; }
    public int getRam() { return ram; }
    public int getHarga() { return harga; }

    //method
    public void nyalakan() {
        System.out.println(merk + " " + model + " sedang dinyalakan...");
    }
    public void isiBaterai(int persen) {
        System.out.println("Mengisi baterai sebesar " + persen + "%...");
    }

    public void matikan() {
        System.out.println(merk + " " + model + " dimatikan.");
    }
    
}
