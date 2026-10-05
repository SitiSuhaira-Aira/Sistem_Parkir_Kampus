/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_prakir_kampus;

/**
 *
 * @author Lenovo
 */
public class Kendaraan {
    private String platNomor;
    private String pemilik;
    private int lamaParkir;
    
    private static int totalKendaraan = 0;
   
public Kendaraan(String platNomor, String pemilik, int lamaParkir){
        this.platNomor = platNomor;
        this.pemilik = pemilik;
        this.lamaParkir = lamaParkir;
        totalKendaraan++;
        
    }
    public String getPlatNomor(){
        return platNomor;
    }
    public void setPlatNomor(String platNomor){
        this.platNomor = platNomor;
    }
    public String getPemilik() {
        return pemilik;
    }
    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }
    public int getLamaParkir() {
        return lamaParkir;
    }
    public void setLamaParkir(int lamaParkir) {
        this.lamaParkir = lamaParkir;
    }
    public static int getTotalKendaraan() {
        return totalKendaraan;
    }
    public double hitungBiayaParkir() {
        return 0.0;
    }
    
    public void tampilkanInfo() {
        System.out.printf("Plat Nomor : %-10s | Pemilik: %-15s | Lama Parkir: %d jam", platNomor, pemilik, lamaParkir);
    }
}
