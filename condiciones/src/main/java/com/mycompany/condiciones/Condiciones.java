package com.mycompany.condiciones;

import java.util.Scanner;

public class Condiciones {

    public static void main(String[] args) {
        
        /* Pedir dos números "a" y "b" integer, decir mayor o si son iguales
        a = 2, b = 3 --> b es mayor que a
        a = 2, b = 2 --> a es igual que b
        a = 8, b = 3 --> a es mayor que b
        */
        
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        
        System.out.println("Introduzca el número a: ");
            a = scanner.nextInt();
        System.out.println("Introduzca el número b: ");
            b = scanner.nextInt();
                    
        if(a>b){
            System.out.println("El número " + a + " es mayor que " + b);
        }
        else if(a<b){
            System.out.println("El número " + a + " es menor que " + b);
        }
        else{
            System.out.println("Los números son iguales");
        }
   }     
}
        
        

