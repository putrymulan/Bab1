/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3;

/**
 *
 * @author ASUS
 */
public class Tabung extends Lingkaran {
    int t;
    double volume, luasPermukaan;
    
    public Tabung(){
        t = 20;
    }
    void Keterangan(){
        Deskripsi();
        System.out.println("menghitung volume tabung");
    }
    double HitvolumeTabung(){
        volume = ((HitluasLingkaran()*t));
        return volume;
    }
}
