package com.mycompany.ejemplodiscord;


public class EjemploDiscord {

    public static void main(String[] args) {
     
        
        String[] frutas = {"piña", "pera", "plátano", "kiwi"};

        String v1 = frutas[1]; // Creamos una variable para guardar "pera"
        
        System.out.println(v1);
        
        frutas[1] = frutas[frutas.length -1]; // Intercambiamos "pera" por "kiwi"  //frutas[1] = frutas[3]
        
        System.out.println(frutas[1]);
        
        frutas[frutas.length -1] = v1; // Intercambiamos "kiwi" por "pera" (guardada en la variable v1)
        
        System.out.println(v1);
        
        System.out.println(frutas);
        
        //String[] frutas = {"piña", "kiwi", "plátano", "pera"}
    }
    }     


