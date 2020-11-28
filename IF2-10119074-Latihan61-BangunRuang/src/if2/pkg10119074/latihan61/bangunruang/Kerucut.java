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
public class Kerucut extends BangunRuang{
    private double t; // tinggi

    public Kerucut(double r, double t){
        super(r);
        this.t = t;
    }

    public double getT() {
        return t;
    }

    @Override
    public double hitungVolume() {
        return (Math.PI * Math.pow(super.getR(), 2) * t) / 3;
    }

    @Override
    public void tampilVolume() {
        System.out.println("Bangun Ruang Kerucut");
        super.tampilVolume(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
