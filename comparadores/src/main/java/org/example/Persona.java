package org.example;

import java.util.Objects;

public class Persona {

    // 1. Atributos
    private String nombre;
    private String apellidos;
    private int edad;


    // 2. Constructores
    public Persona() {
    }

    public Persona(String nombre, String apellidos, int edad){
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    // 4. Métodos
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && Objects.equals(nombre, persona.nombre) && Objects.equals(apellidos, persona.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, edad);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " - " +
                "Apellidos: " + apellidos + " - " +
                "Edad: " + edad;
    }
}