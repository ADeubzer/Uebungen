package de.habelitz.uebung05;

class Kreis {
    double radius;
    Kreis (){
        radius = 0.0;
    }
    Kreis (double radius) {
        this.radius = radius;
    }
    double getRadius(){
        return radius;
    }
    // void setRadius(double radius) {
    //     this.radius = radius;
    // }
    double getUmfang() {
        return 2* Math.PI * radius;
    }
    double getFlaeche() {
        return radius * radius * Math.PI;
    }
}
