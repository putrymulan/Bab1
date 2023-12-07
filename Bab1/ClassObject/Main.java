/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab1.ClassObject;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan();
        mobil.nama = "Mobil";
        mobil.warna = "Merah";
        mobil.merk = "Toyota";
        System.out.println("Nama : "+mobil.nama);
        System.out.println("Warna : "+mobil.warna);
        System.out.println("Merk :"+ mobil.merk);
        System.out.println("Jumlah Roda : "+ mobil.jmlRoda(4)+ "\n");
        System.out.println("cara bergerak ");
        System.out.print("Saat maju : ");
        mobil.KendaraanMaju();
         System.out.print("Saat mundur : ");
        mobil.KendaraanMundur();
         System.out.print("Saat berhenti : " +mobil.nama);
        mobil.KendaraanBerhenti();
    }
}