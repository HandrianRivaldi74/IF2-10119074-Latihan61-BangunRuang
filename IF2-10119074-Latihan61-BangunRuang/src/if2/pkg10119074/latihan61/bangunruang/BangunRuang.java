/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10119074.latihan61.bangunruang;

/**
 *
 * @author Acer
 * Nama     : Handrian Rivaldi
 * Kelas    : IF 2
 * NIM      : 10119074
 * Deskrifsi : 
 */
public abstract class BangunRuang {
    protected double r; // jari-jari

    public BangunRuang(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public abstract double hitungVolume();

    public void tampilVolume() {
        System.out.printf("Hasil : V = %.1f %n%n", hitungVolume());
    }

}
