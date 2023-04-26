package com.mycompany.bucles2;

import java.util.Scanner;

public class Bucles2 {

    public static void main(String[] args) {
        
        /*
        
        Pedir un número y mostrar *
        Número 5:
        *****
        ****
        ***
        **
        *
        
        */
        Scanner sc = new Scanner(System.in);
        
        System.out.println("------------------------------");
        System.out.println("DIBUJAR ESTRELLAS");
        System.out.println("------------------------------");
        System.out.println("Introduce un número: ");
        
        // Introducimos un número "n"
        int n = sc.nextInt();
        System.out.println("");
        
        // Recorremos un bucle decreciente desde el numero que hemos introducido hasta 1 para ir disminuyendo *
        // Introducimos otro bucle dentro del primero para realmente dibujar las *
        for(int i=n; i>=1; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
                }
            System.out.print("\n");
        }
    }
}
