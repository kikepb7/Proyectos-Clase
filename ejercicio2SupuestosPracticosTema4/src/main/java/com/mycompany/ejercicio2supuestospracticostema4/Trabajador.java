package com.mycompany.ejercicio2supuestospracticostema4;

import java.util.Date;

public class Trabajador extends Persona{
    
    // Campos
    private int nrp;
    
    // Constructor de la clase Trabajador

    public Trabajador(int nrp, String dni, String nombre, String apellido1, String apellido2, Date fechaNacimiento) {
        super(dni, nombre, apellido1, apellido2, fechaNacimiento);
        this.nrp = nrp;
    }
    

   
    // Getter & Setter
    public int getNrp() {
        return nrp;
    }

    public void setNrp(int nrp) {
        this.nrp = nrp;
    }

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

    public int getNumeroPersona() {
        return numeroPersona;
    }

    public void setNumeroPersona(int numeroPersona) {
        this.numeroPersona = numeroPersona;
    }
}