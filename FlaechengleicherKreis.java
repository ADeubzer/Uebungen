package de.habelitz.uebung05;

import javax.swing.JOptionPane;

public class FlaechengleicherKreis {
public static void main(String[] args) {
    double laenge = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie die Laenge des Rechtecks ein:"));
    double breite = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie die Breite des Rechtecks ein:"));
    Kreis fgk = new Kreis();
    Rechteck fgr = new Rechteck(laenge, breite);
    System.out.println("Rechtecklaenge: " + laenge);
    System.out.println("Rechtsecksbreite: " + breite);
    System.out.println("Rechtseckflaeche: " + fgr.getFlaeche());
    System.out.println("Kreisradius: " + fgk.setFlaeche(fgr.getFlaeche()));
    System.out.println("Kreisflaeche: " + fgk.getFlaeche(fgk.setFlaeche(fgr.getFlaeche())));
}
}
