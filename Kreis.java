package de.habelitz.uebung05;

class Kreis {
    double radius;
    double u;
    double f;
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
    double getFlaeche(double radius) {
        return radius * radius * Math.PI;
    }
    void setUmfang (double u){
        radius =  u / (2 * Math.PI);
    }
    double setFlaeche (double f){
        return Math.sqrt(f/ Math.PI);
    }
}
