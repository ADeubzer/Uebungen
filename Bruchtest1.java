package de.habelitz.uebung05;

public class Bruchtest1 {
    
    public static void main(String[] args) {
        Bruch a = new Bruch();
        a.zaehler = 3;
        a.nenner = 4;
        Bruch b = new Bruch();
        b.zaehler = 3;
        b.nenner = 12;
        a.ausgeben();
        a.multipiliziere(b);
        System.out.println();
        a.ausgeben();
    }
}