package de.habelitz.uebung05;

class Rechteck {
    double laenge;
    double breite;
    public String getLangeseite;
    Rechteck(){   // Kantenlaengen 
        laenge = 0.0;
        breite = 0.0;
    }
    Rechteck(double laenge, double breite){
        this.laenge = laenge;
        this.breite = breite;
    }
   double getLaenge(){
        return laenge;
   } 
   double getBreite(){
        return breite;
   }
    void setLaenge(double laenge) {
        this.laenge = laenge;
    }
    void setBreite(double breite) {
        this.breite = breite;
    }
    // void setSeiten(double laenge, double breite) {
    //     this.laenge = laenge;
    //     this.breite = breite;
    // }
   double getLangeseite(){
    if (laenge > breite) {
       return laenge;
    } else {
        return breite;
    }
   }
   double getKurzeseite(){
    if (laenge < breite) {
        return laenge;
    } else {
        return breite;
    }
   }
   double getDiagonale(){
    return Math.sqrt((laenge * laenge)+(breite * breite));
    }
    double getFlaeche() {
        return laenge * breite;
    }
    double getUmfang() {
        return (laenge * laenge) + (breite * breite); 
    }
}
