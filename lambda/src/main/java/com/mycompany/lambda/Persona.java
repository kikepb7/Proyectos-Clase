package com.mycompany.lambda;

public class Persona {
    
    // 1. Atributos
    private String nombre;
    private String apellidos;
    private int edad;
    
    
    // 2. Constructor
    public Persona(String nombre, String apellidos, int edad){
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    // 3. Getter & Setter
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
}