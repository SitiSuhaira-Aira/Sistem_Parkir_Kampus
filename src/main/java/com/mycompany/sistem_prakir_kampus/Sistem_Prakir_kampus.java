/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistem_prakir_kampus;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Sistem_Prakir_kampus {

    public static void cariKendaraan(Kendaraan[] daftar, int jumlah, String plat) {
        boolean ditemukan = false;
        for (int i = 0; i < jumlah; i++) {
            if (daftar[i].getPlatNomor().equalsIgnoreCase(plat)) {
                System.out.println("\n[ KENDARAAN DITEMUKAN ]");
                daftar[i].tampilkanInfo(); 
                ditemukan = true;
                break;
            }
    }
    if (!ditemukan) {
            System.out.println("\n[!] Kendaraan dengan Plat Nomor '" + plat + "' tidak ditemukan.");
        }
}

public static void cariKendaraan(Kendaraan[] daftar, int jumlah, int index) {
        if (index >= 0 && index < jumlah) {
            System.out.println("\n[ KENDARAAN DITEMUKAN PADA SLOT " + (index + 1) + " ]");
            daftar[index].tampilkanInfo(); 
        } else {
            System.out.println("\n[!] Slot parkir nomor " + (index + 1) + " tidak valid atau kosong.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        Kendaraan[] daftarParkir = new Kendaraan[10];
        int jumlahKendaraan = 0;
        boolean isRunning = true;

        
        System.out.println("====================================================");
        System.out.println("     SELAMAT DATANG DI SISTEM PARKIR KAMPUS         ");
        System.out.println("====================================================");

        
        while (isRunning) {
            System.out.println("\n--- MENU UTAMA ---");
            System.out.println("1. Tambah Data Kendaraan Parkir");
            System.out.println("2. Tampilkan Seluruh Kendaraan");
            System.out.println("3. Cari Kendaraan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (pilihan) {
                case 1:
                    
                    if (jumlahKendaraan < daftarParkir.length) {
                        System.out.println("\n--- PILIH JENIS KENDARAAN ---");
                        System.out.println("1. Mobil");
                        System.out.println("2. Motor");
                        System.out.print("Pilih tipe (1-2): ");
                        int tipe = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Masukkan Plat Nomor : ");
                        String plat = scanner.nextLine();
                        System.out.print("Masukkan Nama Pemilik: ");
                        String pemilik = scanner.nextLine();
                        System.out.print("Lama Parkir (Jam)   : ");
                        int lama = scanner.nextInt();
                        scanner.nextLine();

                        if (tipe == 1) {
                            System.out.print("Jumlah Pintu Mobil  : ");
                            int pintu = scanner.nextInt();
                            scanner.nextLine();

                            
                            daftarParkir[jumlahKendaraan] = new Mobil(plat, pemilik, lama, pintu);
                            jumlahKendaraan++;
                            System.out.println("[+] Mobil berhasil terdaftar di area parkir!");
                        } else if (tipe == 2) {
                            System.out.print("Tipe Motor (Matic/Bebek/Sport): ");
                            String tipeMotor = scanner.nextLine();

                            
                            daftarParkir[jumlahKendaraan] = new Motor(plat, pemilik, lama, tipeMotor);
                            jumlahKendaraan++;
                            System.out.println("[+] Motor berhasil terdaftar di area parkir!");
                        } else {
                            System.out.println("[!] Tipe kendaraan tidak valid.");
                        }
                    } else {
                        System.out.println("[!] Kapasitas area parkir penuh!");
                    }
                    break;

                case 2:
                    // Tampilkan Seluruh Data[cite: 4]
                    System.out.println("\n==========================================================================================");
                    System.out.println("                                DAFTAR KENDARAAN PARKIR                                   ");
                    System.out.println("==========================================================================================");

                    if (jumlahKendaraan == 0) {
                        System.out.println("Belum ada kendaraan yang terparkir.");
                    } else {
                        
                        for (int i = 0; i < jumlahKendaraan; i++) {
                            System.out.print((i + 1) + ". ");
                            daftarParkir[i].tampilkanInfo(); 
                        }
                        
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("Total Kendaraan Pernah Terdaftar: " + Kendaraan.getTotalKendaraan());
                    }
                    break;

                case 3:
                    
                    if (jumlahKendaraan == 0) {
                        System.out.println("\n[!] Belum ada data kendaraan untuk dicari.");
                    } else {
                        System.out.println("\n--- METODE PENCARIAN ---");
                        System.out.println("1. Cari berdasarkan Plat Nomor");
                        System.out.println("2. Cari berdasarkan Nomor Slot Parkir");
                        System.out.print("Pilih metode (1-2): ");
                        int mtd = scanner.nextInt();
                        scanner.nextLine();

                        if (mtd == 1) {
                            System.out.print("Masukkan Plat Nomor: ");
                            String cariPlat = scanner.nextLine();
                          
                            cariKendaraan(daftarParkir, jumlahKendaraan, cariPlat);
                        } else if (mtd == 2) {
                            System.out.print("Masukkan Nomor Slot (1-" + jumlahKendaraan + "): ");
                            int slot = scanner.nextInt();
                            scanner.nextLine();
                            
                            cariKendaraan(daftarParkir, jumlahKendaraan, slot - 1);
                        } else {
                            System.out.println("[!] Metode tidak valid.");
                        }
                    }
                    break;

                case 4:
                    
                    isRunning = false;
                    System.out.println("\nTerima kasih telah menggunakan Sistem Parkir Kampus.");
                    break;

                default:
                    System.out.println("\n[!] Pilihan menu tidak valid, silakan coba lagi.");
                    break;
            }
        }
        scanner.close();
    }
}
