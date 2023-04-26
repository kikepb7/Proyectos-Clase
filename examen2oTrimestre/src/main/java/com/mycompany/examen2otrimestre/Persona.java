package com.mycompany.examen2otrimestre;

import java.util.*;
/**
 *
 * @author Enrique Palma
 */
public class Persona {
    
    // 1. Atributos
    private String nombre;
    private String apellidos;
    private String nif;
    
    
    // 2. Constructores
    public Persona(){
    }
    
    public Persona(String nif, String nombre, String apellidos){
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    
    // 3. Getter & Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
    
    
    // 4. Método toString()
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + '}';
    }
}