package com.mycompany.interfacesanimales;

public class Pajaro implements Animales{
    
    // 1. Atributos
    String nombre;
    String color;
    double peso; // Peso en gramos
    
    // 2. Constructores
    public Pajaro(){
    }
    
    public Pajaro(String nombre, String color, double peso){
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
    }
    
    
    
    // 3. Métodos
    
    public void volar(){
        System.out.println("Estoy volando!!!");
    }
    
    public void piar(){
        System.out.println("Pio, pio");
    }
    
    
    @Override
    public void mover(int x, int y){
        System.out.println("El pájaro se mueve a (" + x + ", " + y + ")");
    }
    
    public void mover(int x, int y,int z){
        volar();
        System.out.println("El pájaro se mueve a (" + x + ", " + y + ", " + z + ")");
    }
    
    
    @Override
    public void comer(int cantidad){
        System.out.println("Picoteando " + cantidad + " de alpiste.");
    }
    
    @Override
    public String informe(){
        return Animales.super.informe()
                + "\n"
                + "Animal: Pájaro\n"
                + "Nombre: " + nombre + "\n"
                + "Color: " + color + "\n"
                + "Peso: " + peso + " gr";
    }
    
    
    
    
    // 4. Getter & Setter
    public String getNombre() {    
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }  
}