/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB8.Interface;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main (String[]args){
        Payment pay1 = new Payment (750000);
        
        pay1.titlePurchase(1);
        System.out.println("credit Balance : " + pay1.creditBalance);
        System.out.println("E-Money Balance : "+pay1.emoneyBalance);
        System.out.println("Cash Balance : "+pay1.cashBalance);
        System.out.println("==============================");
        System.out.println("Total Payment : "+pay1.total);
        System.out.println("==============================");
        System.out.println("Payment With Credit, Ending Balance : "+pay1.creditBalance);
        System.out.println("Payment With E-Money, Ending Balance : "+pay1.emoneyBalance);
        System.out.println("Payment With Cash, Ending Balance : "+pay1.cashBalance);
    }
}
