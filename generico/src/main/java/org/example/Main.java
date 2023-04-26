package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        ClaseGenerica<Integer> cg1 = new ClaseGenerica<>(5);
        System.out.println(cg1.getElemento()); // Salida: 5


        ClaseGenerica<String> cg2 = new ClaseGenerica<>("Hola mundo!");
        System.out.println(cg2.getElemento()); // Salida: Hola mundo!

        ClaseGenerica cadena = new ClaseGenerica<>("Hola mundo!");
        cadena.setElemento(54);
        System.out.println(cadena.getElemento()); // Salida:


        ClaseGenerica<Persona> cg3 = new ClaseGenerica<>(new Persona("Enrique", 31));
        System.out.println(cg3.getElemento().getNombre() + " tiene " + cg3.getElemento().getEdad() + " años.");
    }
}