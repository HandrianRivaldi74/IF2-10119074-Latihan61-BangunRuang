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
public class Bola extends BangunRuang{
    public Bola(double r) {
        super(r);
    }

    @Override
    public double hitungVolume() {
        return (4 * Math.PI *Math.pow(super.getR(), 3)) / 3;
    }

    @Override
    public void tampilVolume() {
        System.out.println("Bangun Ruang Bola");
        super.tampilVolume(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
