package com.mycompany.examenclases;

/**
 *
 * @author damci
 */
public class Animales {
    
    private String nombre;
    private String tipo;
    private int edad;
    
    public Animales(String nombre, String tipo, int edad){
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }
    
    public Animales(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = 0;
    }

    
    
    // Constructores GET y SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    public String toString(){
        String mensaje = "Animal: " + nombre + ", " + tipo + ", " + edad;
        return mensaje;
    }
}