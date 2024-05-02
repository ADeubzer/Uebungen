package de.habelitz.uebung05;

import javax.swing.JOptionPane;

public class Kreistabelle {
    public static void main(String[] args) {
        Kreis k = new Kreis();
        double vr = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie einen Wert fuer den Radius ein:"));
        System.out.print("Radius" + "\t" );
        System.out.print("Umfang" + "\t");
        System.out.println("Flaeche" + "\t");
        System.out.print( vr + "\t" );
        System.out.print( k.getUmfang() + "\t");
        System.out.println(k.getFlaeche(vr) + "\t");
        for (double i = 1; i < 30; i++) {
            vr = vr + 5.0;
            System.out.print( vr + "\t" );
            System.out.print( k.getUmfang() + "\t");
            System.out.println(k.getFlaeche(vr) + "\t");
        }
    }

}
