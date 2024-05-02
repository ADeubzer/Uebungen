package de.habelitz.uebung05;

import javax.swing.JOptionPane;

public class Rechtecktest {
public static void main(String[] args) {
    Rechteck r = new Rechteck();
    System.out.println("Laenge:" + r.laenge + " " + "Breite:" + r.breite);
        double laenge = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Laenge ein: "));
        double breite = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Breite ein: "));
        r.setLaenge(laenge);
        r.setBreite(breite);
        double l = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die zusaetzliche Laenge ein: "));
        r.laengeVergroessern(l);
        double b = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die zusaetzliche Breite ein: "));
        r.breiteVergroessern(b);
        System.out.println("Laenge:" + r.laenge + " " + "Breite:" + r.breite);
        double lv = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Groesse die Sie von der Laenge abziehen wollen ein: "));
        r.laengeverkleinern(lv);
        double bv = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Groesse die Sie von der Breite abziehen wollen ein: "));
        r.breiteverkleinern(bv);
        // r.setSeiten(5.0, 8.0);
    // System.out.println("Laenge:" + r.getLaenge() + " " + "Breite:" + r.getBreite());
    System.out.println("Die laengere Seite ist " + r.getLangeseite() + " cm lang");
    System.out.println("Die kuerzere Seite ist " + r.getKurzeseite() + " cm lang");
    System.out.println("Die Diagonale ist " + r.getDiagonale() + "cm lang");
    System.out.println("Die Flaeche ist " + r.getFlaeche() + "cm lang");
    System.out.println("Der Umfang ist " + r.getUmfang() + "cm lang");
    // r.laengeAusgeben();
}
}