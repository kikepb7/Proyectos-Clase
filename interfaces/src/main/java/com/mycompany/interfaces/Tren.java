package com.mycompany.interfaces;

public class Tren implements Operable{
    
    private String id;
    private int velocidad;

    
    public Tren(String id, int velocidad) {
        this.id = id;
        this.velocidad = velocidad;
    }

    @Override
    public String getIdVehiculo() {
        return ("Tren con ID: " + id);
    }

    @Override
    public void acelerar() {
        velocidad++;
    } 

    @Override
    public void frenar() {
        velocidad--;
    }

    public int getVelocidad() {
        return velocidad;
    }
    
    public void resumirMetodosTren() {
        System.out.println("getVelocidad");
        Operable.resumirMetodosInterface();
    }
}