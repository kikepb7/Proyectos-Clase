package com.mycompany.ejercicio_variables;

public class Ejercicio_Variables {
    
    public static void main(String[] args) {

        /*
        Variables mínimas
        a = 10
        b = 60000
        c = 8,3
        d = 'A'
        e= d + 2
        
        Constantes
        pi 3,1416
        lenguaje "JAVA"
        */
        
        byte a = 10;
        int b = 60000;
        float c = 8.3f;
        char d = 'A'; // char d = 65;
        char e = (char) (d+2); // int e = d+2; Se realiza una conversión (Casting) entre la letra A (65 en ASCII) y el número , dando 67 (C en ASCII)
        final double PI = 3.1416; // final double CTE_PI = Math.PI;
        final String LENGUAJE = "JAVA";
        
        /*
        Mostrar por pantalla valores a, b, c, d, e
        en una línea cada uno
        axb, bxc, c+cte PI
        "programo en JAVA"
        */
        
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
        System.out.println("Valor de c: " + c);
        System.out.println("Valor de d: " + d);
        System.out.println("Valor de e: " + e);
        
        System.out.println("El resultado de axb es: " + (a*b));
        System.out.println("El resultado de bxc es: " + (b*c));
        System.out.println("El resultado de cxPI es: " + (c+PI));
        
        System.out.println("Programo en: " + LENGUAJE);
    }
}