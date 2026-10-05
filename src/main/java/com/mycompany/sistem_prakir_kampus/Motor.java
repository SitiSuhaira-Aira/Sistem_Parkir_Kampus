/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_prakir_kampus;

/**
 *
 * @author Lenovo
 */
public class Motor extends Kendaraan{
    private String tipeMotor;
    
    public Motor(String platNomor, String pemilik, int lamaParkir, String tipeMotor){
        super(platNomor, pemilik, lamaParkir);
        this.tipeMotor = tipeMotor;
    }
    public String getTipeMotor() {
        return tipeMotor;
    }
    @Override
    public double hitungBiayaParkir() {
        return getLamaParkir() * 2000.0; // Tarif Rp 2.000 / jam
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.printf(" | Jenis: Motor (%s) | Biaya: Rp %.2f%n", tipeMotor, hitungBiayaParkir());
    }
}
