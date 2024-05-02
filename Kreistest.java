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
    System.out.println(k.getFlaeche());
    }
}
