/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import entity.*;
import Services.*;
import java.util.*;
import java.lang.*;
/**
 *
 * @author dell
 */
public class Aplikasi {
    
    private static Scanner scanner;
    private static Motor_Services service = new Motor_Services();
    
    public static void main(String[] args) {
        int opsi =5;
        do{
        tampilkanMenu();
            scanner = new Scanner(System.in);
            opsi = scanner.nextInt();
            proses(opsi);
    }while(opsi !=5);
    }
    
    private static void proses(int opsi){
        switch(opsi){
            case 1:
                tampilkanFormTambahData();
                break;
            case 2:
                tampilkanFormUbahData();
                break;
            case 3:
                 tampilkanFormHapusData();
                break;
            case 4:
                service.tampilkanData();
                break;
        }
    }
    
    
    private static void tampilkanFormUbahData(){
        scanner= new Scanner(System.in);
        String NoPelanggan, NoPolisi, Merk, Nama, Mekanik, Services,Harga;
        
        System.out.println("--= Form Ubah Data=--");
        System.out.print("No Pelanggan :");
        NoPelanggan = scanner.nextLine();
        System.out.print("No Polisi :");
        NoPolisi = scanner.nextLine();
        System.out.print("Merk :");
        Merk = scanner.nextLine();
        System.out.print("Nama :");
        Nama = scanner.nextLine();
        System.out.print("Mekanik :");
        Mekanik = scanner.nextLine();
        System.out.print("Services :");
        Services = scanner.nextLine();
        
        
        service.ubahData(new Motor(NoPelanggan, NoPolisi, Merk, Nama, Mekanik, Services));
        
    }
    
    private static void tampilkanFormHapusData() {
        scanner = new Scanner(System.in);
        String NoPelanggan;

        System.out.println("\n--- Form Hapus Data ---");
        System.out.print("No Pelanggan : ");
        NoPelanggan= scanner.nextLine();
        service.hapusData(NoPelanggan);
    }
    
    private static void tampilkanFormTambahData(){
        scanner= new Scanner(System.in);
        String  NoPelanggan, NoPolisi, Merk, Nama, Mekanik, Services;
        
        System.out.println("\n--= Form Tambah Data=--");
        System.out.print("No Pelanggan :");
        NoPelanggan = scanner.nextLine();
        System.out.print("No Polisi :");
        NoPolisi = scanner.nextLine();
        System.out.print("Merk :");
        Merk = scanner.nextLine();
        System.out.print("Nama :");
        Nama = scanner.nextLine();
        System.out.print("Mekanik :");
        Mekanik = scanner.nextLine();
        System.out.print("Services :");
        Services = scanner.nextLine();
        
        
        service.tambahData(new Motor(NoPelanggan ,NoPolisi, Merk, Nama, Mekanik, Services));
        
    }
    
    private static void  tampilkanMenu(){
        System.out.println("\n--= Menu Aplikasi =--");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan Data");
        System.out.println("5. KELUAR");
        System.out.println("-------------------");
        System.out.print("opsi >");
        
    }
    
}
