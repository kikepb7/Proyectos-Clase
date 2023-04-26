package com.mycompany.interfaces;

public class Bicicleta implements Operable{
    
    private String nombre;
    private double pedaleo;
    
    public Bicicleta(String nombre, int pedaleo){
        this.nombre = nombre;
        this.pedaleo = pedaleo;
    }

    
    
    @Override
    public String getIdVehiculo() {
        return ("Persona que pedalea: " + nombre);
    }
    
    
    @Override
    public void acelerar() {
        pedaleo+= 0.1;
        System.out.println("Pedalear más: " + pedaleo);
    }
    
    @Override
    public void frenar(){
        pedaleo -= 0.1;
        System.out.println("Pedalear menos: " + pedaleo);
    }
    
    
    public double getPedaleo() {
        return pedaleo;
    }

    
    
    public void resumirMetodosBicicleta() {
        System.out.println("getPedaleo");
        Operable.resumirMetodosInterface();
    }
}