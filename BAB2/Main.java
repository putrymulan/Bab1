/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB2;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[]args)
    {
        Kendaraan mobil = new Kendaraan();
        System.out.println("Nama Kendaraan : "+ mobil.nama);
        System.out.println("Nama Kendaraan : "+ mobil.warna);
        System.out.println("Pabrik Kenaraan : "+ mobil.pabrikan);
        System.out.println("Kecepatan maximal : "+ mobil.speed);
        System.out.println("Cara Kendaraan bergerak : ");
        System.out.println("Saat maju : ");
        mobil.kendaraanMaju();
        System.out.println("Saat mundur : ");
        mobil.kendaraanMundur();
        System.out.println("Saat berhenti : ");
        mobil.kendaraanBerhenti();
    }
}