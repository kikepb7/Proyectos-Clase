package com.mycompany.figurasgeometricas;

public class Recta {
    
    // Campos de la clase Recta
    private Punto p1;
    private Punto p2;
    
    
    // Constructor de la clase Recta
    public Recta(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    // Constructor vacío
    public Recta() {
        p1 = new Punto();
        p2 = new Punto();
    }
    
    
    // Getter & Setter
    public Punto getP1() {
        return p1;
    }
    public void setP1(Punto p1) {
        this.p1 = p1;
    }
    public Punto getP2() {
        return p2;
    }
    public void setP2(Punto p2) {
        this.p2 = p2;
    }
    
    
    // Método para calcular la longitud de la recta
    public double calcularLongitud(){
        return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Recta{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}