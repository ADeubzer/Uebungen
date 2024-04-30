package de.habelitz.uebung05;

import javax.swing.JOptionPane;

public class Rechtecktest {
public static void main(String[] args) {
    Rechteck r = new Rechteck();
    System.out.println("Laenge:" + r.laenge + " " + "Breite:" + r.breite);
        r.laenge = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Laenge ein: "));
        r.breite = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Breite ein: "));
    System.out.println("Laenge:" + r.laenge + " " + "Breite:" + r.breite);
    // r.setLaenge(5.0);
    // r.setBreite(8.0);
    // r.setSeiten(5.0, 8.0);
    // System.out.println("Laenge:" + r.getLaenge() + " " + "Breite:" + r.getBreite());
    System.out.println("Die laengere Seite ist " + r.getLangeseite() + " cm lang");
    System.out.println("Die kuerzere Seite ist " + r.getKurzeseite() + " cm lang");
    System.out.println("Die Diagonale ist " + r.getDiagonale() + "cm lang");
    System.out.println("Die Flaeche ist " + r.getFlaeche() + "cm lang");
    System.out.println("Der Umfang ist " + r.getUmfang() + "cm lang");
}
}