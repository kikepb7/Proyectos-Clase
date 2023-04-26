package com.mycompany.supuestospracticostema7;

public class Vegetal extends SerVivo{
    
    // Campos
    private double altura;

    
    // Getter & Setter
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    @Override
    public String toString() {
        return "Vegetal" +
                "\nAltura: " + altura + " m" +
                "\nNombre científico: " + nombreCientifico +
                "\nNombre común: " + nombreComun;
    }
    
    @Override
    public void alimentarse() {
        System.out.println("Las plantas hacen la fotosíntesis");
    }
}