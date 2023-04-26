package com.mycompany.ejercicioherencia;

public class Persona {
    
    // Campos de la clase Persona
    private String nombre;
    private String apellidos;
    private String nif;
    public String ciudad;
    private int numeroPersonas;

    
    // Constructor con todos los campos
    public Persona(String nombre, String apellidos, String nif, String ciudad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.ciudad = ciudad;
        numeroPersonas++;
    }

    // Constructor con los campos nombre, apellidos y nif
    public Persona(String nombre, String apellidos, String nif) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.ciudad = "Desconocido";
        numeroPersonas++;
    }
    
    
    // Getter & Setter
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
    
    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNif() {
        return nif;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }
    
    
    // Método toString
    @Override
    public String toString() {
        return "Nombre y Apellidos: " + nombre + " " + apellidos + "\nNIF: " + nif + "\nCiudad: " + ciudad;
    }
}