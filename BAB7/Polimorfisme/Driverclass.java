/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7.Polimorfisme;

/**
 *
 * @author ASUS
 */
public class Driverclass {
    public static void main (String[]args){
        Manusia manusia = new Manusia();
        
        Buah Apel = new Apel();
        Buah Pisang = new Pisang();
        
        manusia.makanBuah(Apel);
        manusia.makanBuah(Pisang);
    }
}
