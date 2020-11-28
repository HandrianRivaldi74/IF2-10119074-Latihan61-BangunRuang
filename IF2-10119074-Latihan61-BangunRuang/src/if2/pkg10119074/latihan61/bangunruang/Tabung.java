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
public class Tabung extends BangunRuang{
    private double h; // ketinggian
    public Tabung(double r, double h) {
        super(r);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    @Override
    public double hitungVolume() {
        return Math.PI * Math.pow(super.getR(), 2) * h;
    }

    @Override
    public void tampilVolume() {
        System.out.println("Bangun Ruang Tabung");
        super.tampilVolume(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
