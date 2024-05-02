package de.habelitz.uebung05;

class Rechteck {
    double laenge;
    double breite;
    double l;
    double b;
    double lv;
    double bv;
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
   double getLaengevergroessern(){
    return l;
    }
    double getBreitevergroessern(){
        return b;
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
    void laengeVergroessern (double l) {
        laenge = this.laenge + l;
    }
    void breiteVergroessern (double b) {
        breite = this.breite +b;
    }
    void laengeverkleinern  (double lv) {
        laenge = this.laenge - lv;
    }
    void breiteverkleinern (double bv) {
        breite = this.breite - bv;
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
    // void laengeAusgeben () {
    //     var laenge = 5.4;
    //     System.out.println("Laenge: " + laenge);
    // }
    
}
