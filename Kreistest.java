package de.habelitz.uebung05;

import javax.swing.JOptionPane;

public class Kreistest {
    public static void main(String[] args) {
     Kreis k = new Kreis();
     double radius = Double.parseDouble(JOptionPane.showInputDialog("Geben sie den Radius ein : "));
     k.setRadius(radius);
     System.out.println(k.radius);
    System.out.println(k.getRadius());
    System.out.println(k.getUmfang());
    System.out.println(k.getFlaeche(radius));
    double u = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie einen Wert für den Umfang ein:"));
    k.setUmfang(u);
    System.out.println(k.radius);
    double f = Double.parseDouble(JOptionPane.showInputDialog("geben sie einen Wert für die Flaeche ein:"));
    k.setFlaeche(f);
    System.out.println(k.radius);
    }
}
