/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3;

/**
 *
 * @author ASUS
 */
public class mainTabung {
    public static void main (String[]args){
        Lingkaran lkr = new Lingkaran();
        lkr.Deskripsi();
        System.out.println("Hasilnya adalah : "+ lkr.HitluasLingkaran());
        System.out.println("===========================");
        Tabung tbg = new Tabung();
        tbg.Keterangan();
        System.out.println("volumenya adalah : "+ tbg.HitvolumeTabung());
    }
}
