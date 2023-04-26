package com.mycompany.interfaces;

public class Interfaces {

    public static void main(String[] args) {
        
        Tren t = new Tren("D13", 0);
        
        System.out.println(t.getIdVehiculo());
        System.out.println("Velocidad: " + t.getVelocidad());
        
        for(int i=0;i<20;i++)
            t.acelerar();
        
        System.out.println("Velocidad: " + t.getVelocidad());
        
        t.imprimirUbicacionGeografica();
        t.resumirMetodosTren();
        
        System.out.println("");
        System.out.println("**********************************************");
        System.out.println("");
        
        Bicicleta b = new Bicicleta("Enrique", 0);
        
        System.out.println(b.getIdVehiculo());
        System.out.println("Velocidad: " + b.getPedaleo());
        for(int i=0;i<10;i++)
            b.acelerar();
        System.out.println("");
        for(int i=0;i<5;i++)
            b.frenar();
        
        
        System.out.println("Velocidad: " + b.getPedaleo());
        
        b.imprimirUbicacionGeografica();
        b.resumirMetodosBicicleta();
    }
}