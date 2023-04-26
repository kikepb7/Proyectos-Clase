package com.mycompany.figurasgeometricas;

public class Circunferencia {
    
    // Campos de la clase Circunferencia
    private Recta radio;
    private Punto centro;
    
    
    // Constructor de la clase Circunferencia
    public Circunferencia(Recta radio) {
        this.radio = radio;
        this.centro = radio.getP1();
    }
    
    // Constructor vacío
    public Circunferencia() {
        radio = new Recta();
        this.centro = radio.getP1();
    }
    
    
    // Getter & Setter
    public Recta getRadio() {
        return radio;
    }
    public void setRadio(Recta radio) {
        this.radio = radio;
    }
    
    
    // Método para calcular el área de la circunferencia
    public double calcularArea(){
        return Math.PI * Math.pow(radio.calcularLongitud(), 2);
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Circunferencia{" +
                "radio=" + radio +
                '}';
    }
}