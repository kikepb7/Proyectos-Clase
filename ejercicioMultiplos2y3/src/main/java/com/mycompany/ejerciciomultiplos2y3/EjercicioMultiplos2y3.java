package com.mycompany.ejerciciomultiplos2y3;

public class EjercicioMultiplos2y3 {

    public static void main(String[] args) {
        
        /*
        Números múltiplos de 2 y de 3 que hay entre 1 y 100
        */
        
        // Un número es múltiplo de 2 cuando la división entre 2 da como resto 0
        // Un número es múltiplo de 3 cuando la división entre 3 da como resto 0
        
        System.out.println("Los números múltiplos de 2 y de 3 son: ");
        for(int i=0; i<=100; i++){
            if(i%2==0 && i%3==0){
                System.out.println(i);
            } 
        }
        System.out.println("--------------------------------------------");
        
        System.out.println("Los números múltiplos de 2 son: ");
        for(int i=0; i<=100; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("--------------------------------------------");
        
        System.out.println("Los números múltiplos de 3 son: ");
        for(int i=0; i<=100; i++){
            if(i%3==0){
                System.out.println(i);
            } 
        }
    }
}