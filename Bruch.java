package de.habelitz.uebung05;

public class Bruch {
    int zaehler;
    int nenner;
    void ausgeben() {
        // int zaehler = 0;
        System.out.println("");
        System.out.println(this.zaehler + "/" + nenner);
    }
    void kuerzen(){
        var m = Math.abs(zaehler);
        var n = Math.abs(nenner);
        var r = m%n;
        while (r > 0) {
            m=n;
            n=r;
            r= m % n;
        }
        zaehler /= n;
        nenner /=n;
    }
    void erweitert (int a){
        zaehler *=a;
        nenner *=a;
    }
    void  multipiliziere(Bruch m) {
        zaehler *= m.zaehler;
        nenner *= m.nenner;
    }

}
