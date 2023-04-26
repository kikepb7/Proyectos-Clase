package com.mycompany.interfacesanimales;

/**
 *
 * @author Enrique Palma
 */
public class Mono implements Animales, IEvolucion{
    
    // 1. Atributos
    String nombre;
    String color;
    int peso;
    
    
    // 2. Constructores
    public Mono(){
    }
    
    public Mono(String nombre, String color, int peso){
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
    }
    
    
    // 3. Métodos
    void trepar(int x, int y, int z){
        mover(x, y);
        System.out.println("Y trepar a " + z);
    }
    
    @Override
    public void hablar(){
        System.out.println("El mono " + nombre + " está hablando!!!");
    }
    
    @Override
    public void pensar(){
        System.out.println("El mono " + nombre + " está pensando...");
    }
    
    @Override
    public void mover(int x, int y){
        System.out.println("El mono " + nombre + " se mueve a (" + x + ", " + y + ")");
    }
    
    @Override
    public void comer(int cantidad){
        peso = peso + (cantidad/1000);
    }
    
    @Override
    public void crearHerramienta(){
        IEvolucion.super.crearHerramienta();
        System.out.println("Tirar piedras");
    }
    
    @Override
    public String informe(){
        return Animales.super.informe()
                + "\n"
                + "Animal: Mono\n"
                + "Nombre: " + nombre + "\n"
                + "Color: " + color + "\n"
                + "Peso: " + peso + " Kg";
    }

    
    
    // 4. Getter & Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}