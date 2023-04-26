package com.mycompany.supuestospracticostema7;

public class Animal extends SerVivo{
    
    // Campos
    private double peso;
    private double altura;
 
    
    // Getter & Setter
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void alimentarse(){
        System.out.println("Los animales comen");
    }
    
    
    @Override
    public String toString() {
        return "Animal" +
                "\nPeso: " + peso + " kg" +
                "\nAltura: " + altura + " m" +
                "\nNombre científico: " + nombreCientifico +
                "\nNombre común: " + nombreComun;
    }
}