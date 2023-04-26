package com.mycompany.ejercicios_tema6;

import java.util.Random;

public class Ejercicios_Tema6 {

    public static void main(String[] args) {
        
        // Creamos una instancia de la clase Random
        Random random = new Random();
        
        // Creamos dos valores aleatorios entre el rango anteriormente creado
        int valor1 = random.nextInt(0,11);
        int valor2 = random.nextInt(0, 11);
        System.out.println(valor1);
        System.out.println(valor2);
        
        // Mostramos por pantalla, con la función Math.max, el número mayor
        System.out.println("El número mayor es: " + Math.max(valor1, valor2));
    }
}