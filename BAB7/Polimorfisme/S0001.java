/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7.Polimorfisme;

/**
 *
 * @author ASUS
 */
public class S0001 extends Pembayaran{
    public String name, alamat;
    public int saldo;
    public String Kode;
    double diskon, bayar, total;
    public S0001(){
        this.name = "Putri Mulan Mirenty";
        this.Kode = "S0001";
        this.saldo = 5000000;
        this.alamat = "Malang, Kos putri biru ITN 2";
    }
    public double hasil(){
        return diskon;
    }
    public String InputPinKredit;
    
    @Override
    double cekKode(String input) {
        if (input.compareTo(Kode)==0){
            diskon = 0.1;
        }else {
            diskon = 0;
        }
        return diskon;
    }
    @Override
    double hitPembayaran(double bayar) {
        diskon = bayar * diskon;
        total = bayar - diskon;
        return total;
    }
    double potSaldo(){
        return this.saldo - total;
    }
    @Override
    void tampilkanMember(){
        System.out.println("Member S0001 dengan diskon 10%");
    }
    void jenisPembayaran(Cash cash) {
        if (bayar >= total) {
        System.out.println("Kembalian : " + cash.kembalian(total, bayar));
        } 
        else 
            if (bayar <= total) {
            System.out.println("uang anda kurang");
            } 
            else {
            System.out.println("Pembayaran Berhasil");
            }
        }
    void jenisPembayaran(EMoney emoney) {
    emoney.scanQris();
    }
    void jenisPembayaran(Kredit kredit) {
    kredit.cekKartuKredit(Kode, InputPinKredit);
    }
}