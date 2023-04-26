package com.mycompany.ejercicio9_5;

/**
 *
 * @author Enrique Palma
 */
public class Alumno implements Comparable<Alumno>{
    
    // 1. Atributos
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String nacionalidad;
    
    
    // 2. Constructores
    public Alumno() {
    }
    public Alumno(String nombre, String apellido1, String apellido2, String nacionalidad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nacionalidad = nacionalidad;
    }
    
    
    // 3. Getter & Setter
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
    // 4. Método toString()
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", nacionalidad=" + nacionalidad + '}';
    }

    @Override
    public int compareTo(Alumno o) {
        if(this.nombre == null || this.apellido1 == null || this.apellido2 == null){
            return 0;
        }
        
        return this.apellido1.compareTo(o.apellido1);
    }
    
}