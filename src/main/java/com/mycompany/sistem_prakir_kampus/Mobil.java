/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_prakir_kampus;

/**
 *
 * @author Lenovo
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu;
    
    public Mobil(String platNomor, String pemilik, int lamaParkir, int jumlahPintu){
        super(platNomor, pemilik, lamaParkir);
        this.jumlahPintu = jumlahPintu;
    }
    public int getJumlahPintu(){
        return jumlahPintu;
    }
    @Override
    public double hitungBiayaParkir() {
        return getLamaParkir() * 5000.0; // Tarif Rp 5.000 / jam
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.printf(" | Jenis: Mobil (%d Pintu) | Biaya: Rp %.2f%n", jumlahPintu, hitungBiayaParkir());
    }
}
