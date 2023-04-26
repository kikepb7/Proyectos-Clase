package com.mycompany.abstracto;

public abstract class Animal {
    
    protected String nombre;
    protected int edad;
    protected String raza;
    
    
    /**
     * Operación a ser implementada por la descendencia
     */
    
    public abstract void comunicarse();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    /**
     * Métodos Get y Set
     */
    
    
}