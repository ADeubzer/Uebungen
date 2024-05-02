package de.habelitz.uebung05;

class Kreis {
    double radius;
    Kreis (){
        radius = 0.0;
    }
    void setRadius(double radius) {
        this.radius = radius;
    }
    Kreis (double radius) {
        this.radius = radius;
    }
    double getRadius(){
        return radius;
    }
    double getUmfang() {
        return 2* Math.PI * radius;
    }
    double getFlaeche() {
        return radius * radius * Math.PI;
    }
}
