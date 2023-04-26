package com.mycompany.ejercicio2supuestospracticostema4;

import java.util.Date;

public class Persona {
    
    // Campos
    public String dni;
    public String nombre;
    public String apellido1;
    public String apellido2;
    public Date fechaNacimiento;
    public int numeroPersona;
    
    
    // Constructor de la clase Persona
    public Persona(String dni, String nombre, String apellido1, String apellido2, Date fechaNacimiento){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        numeroPersona++;
    }
    
    
    // Getter & Setter
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    } 
}