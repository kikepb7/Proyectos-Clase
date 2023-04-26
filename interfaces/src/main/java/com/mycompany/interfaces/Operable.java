package com.mycompany.interfaces;

public interface Operable {
    
    public String getIdVehiculo();
    public void acelerar();
    public void frenar();
    
    default public void imprimirUbicacionGeografica() {
        System.out.println("Implementación por defecto interface");
    }
    
    public static void resumirMetodosInterface() {
        System.out.println("getIdVehiculo, acelerar, frenar "
        + ", imprimirUbicacionGeografica, resumirMetodosInterface");
    }
}