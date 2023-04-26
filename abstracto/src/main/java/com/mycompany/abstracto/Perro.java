package com.mycompany.abstracto;

public class Perro extends Animal{
    
    @Override
    public void comunicarse(){
        System.out.println("Wua Wua!!!");
    }
    
    public void olfatear(){
        System.out.println("MMMM Huele rico!!!");
    }
    
    /*
    Métodos Get y Set
    */

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
    
    
}