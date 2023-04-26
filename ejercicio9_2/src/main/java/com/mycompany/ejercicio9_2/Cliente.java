package com.mycompany.ejercicio9_2;

/**
 *
 * @author Enrique Palma
 */
public class Cliente {
    
    // 1. Atributos
    public String nif;
    public String nombre;
    public String apellidos;
    
    
    // 2. Constructores

    public Cliente() {
    }

    public Cliente(String nif, String nombre, String apellidos) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    
    // 3. Getter & Setter
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

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
}