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
public class IF210119074Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunRuang bola = new Bola(7);
        bola.tampilVolume();

        BangunRuang tabung = new Tabung(10, 21);
        tabung.tampilVolume();

        BangunRuang kerucut = new Kerucut(14, 9);
        kerucut.tampilVolume();
    }
    
}
