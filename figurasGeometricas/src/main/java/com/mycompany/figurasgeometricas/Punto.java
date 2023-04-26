package com.mycompany.figurasgeometricas;

public class Punto {
    
    // Campos de la clase Punto
    private double x;
    private double y;
    
    // Constructor de la clase Punto
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    // Constructor vacío
    public Punto() {
        x = 0;
        y = 0;
    }
    
    
    // Getter & Setter
    public double getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    
    
    // Método toString
    @Override
    public String toString() {
        return "(" +
                "x=" + x +
                ", y=" + y +
                ')';
    }
}