/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6.Abstract;

/**
 *
 * @author ASUS
 */
public abstract class Gaji_Reward extends Gaji_abs_reward {
    double menit, gajipokok;
    int waktu;
    double tunj_bonus, tunj_anak;
    double anak;

public Gaji_Reward(double gajipokok, double tunj_anak, double menit, int waktu, double tunj_bonus, double anak) {
        this.anak = anak;
        this.menit = menit;
        this.tunj_bonus = tunj_bonus;
        this.waktu = waktu;
        this.gajipokok = gajipokok;
        this.tunj_anak = tunj_anak;
    }
public double lembur() {
        // Logika perhitungan lembur
        // Misalnya tarif lembur per jam adalah 50% dari gaji pokok
        return (0.5 * gajipokok) * (menit / 60);
    }
@Override
public double tunjanganAnak() {
        // Logika perhitungan tunjangan anak
        // Misalnya tunjangan anak adalah 10% dari gaji pokok per anak
        return anak * (0.1 * gajipokok);
    }
}