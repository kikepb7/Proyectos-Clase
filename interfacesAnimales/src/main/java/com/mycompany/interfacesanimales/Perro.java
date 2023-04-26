package com.mycompany.interfacesanimales;

public class Perro implements Animales{
    
    // 1. Atributos
    public String nombre;
    double peso; // Peso en gramos
    private int engordar;
    
    
    // 2. Constructores
    public Perro(){
    }
    
    public Perro(String nombre, int peso){
        this.nombre = nombre;
        this.peso = peso;
    }
    
    
    // 3. Métodos
    public void ladrar(){
        System.out.println("Guau, guau!!!");
    }
 
    public void engordar(double cantidad) {
        peso += cantidad;
    }

    
    @Override
    public void mover(int x, int y){
        System.out.println("El perro se mueve a (" + x + ", " + y + ")");
    }
    
    @Override
    public void comer(int cantidad){
        peso = peso + (cantidad/1000);
    }
    
    @Override
    public String informe(){
        return Animales.super.informe()
                + "\n"
                + "Animal: Perro\n"
                + "Nombre: " + nombre + "\n"
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
}