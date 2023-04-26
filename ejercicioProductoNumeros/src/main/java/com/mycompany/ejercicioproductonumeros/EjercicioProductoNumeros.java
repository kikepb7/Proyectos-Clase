package com.mycompany.ejercicioproductonumeros;

import java.util.Scanner;

public class EjercicioProductoNumeros {

    public static void main(String[] args) {
        
        /*
        Bucle que calcule el prodcuto de los "n" primeros números pedidos por pantalla
        
        Ejemplo:
            10 = 1 x 2 x 3 x .... x 10
            31 = 1 x 2 x 3 x .... x 31
        */
        
        Scanner sc = new Scanner(System.in);
        
        // Inicializamos la variable "start" en 1, ya que si inicializamos en 0 cualquier número que multipliquemos 
        // dará como resultado 0
        int total = 1;
        
        System.out.println("****************************************");
        System.out.println("CALCULAR PRODUCTO DE LOS  *N*  NÚMEROS");
        System.out.println("****************************************");
        System.out.println("");
        System.out.println("Introduzca un número: ");
        int n = sc.nextInt();
        
        // Creamos un bucle que recorra todos los números hasta el que hayamos introducido en el programa
        for(int i=1; i<=n; i++){
            total = total * i;
            System.out.print(i);
            if(i==n){
                break;
            }
            else{
                System.out.print(" x ");
            }
        }
        System.out.println("");
        System.out.println("El producto de " + n + " es: " + total);
    }
}