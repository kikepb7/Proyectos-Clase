package com.mycompany.ejerciciocuadrado;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioCuadrado {

    public static void main(String[] args) {
        
        int n = obtenerNumero();
        dibujarCuadrado(n);
    }
    
    
    
    /**
     * 
     * @return 
     */
    public static int obtenerNumero(){
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Indique un numero entre 1 y 10: ");
            n = sc.nextInt();
        }while(n<1 || n>10);
        return n;
    }
    
    
    
    /**
     * Dibuja un cuadrado de * de dimensión "n"
     * @param n lado del cuadrado
     */
    static void dibujarCuadrado(int n){
        /**
         * Creamos un bucle que recorra desde 1 hasta el número (n) que introducimos en consola para que 
         * muestre por pantalla el mismo número de *
         * Será el bucle para la parte superior del cuadrado
         */
        for(int i=1; i<=n; i++){
            System.out.print("* ");
        }
        System.out.println(" ");

        /**
         * Creamos un bucle que recorra desde 1 hasta (n-2), ya que tenemos creados el lado superior e inferior
         * por lo tanto nos deberia crear las filas restantes entre el número que introducimos y las 2 ya creadas
         * 
         * Dentro del bucle, creamos otro nuevo bucle que lo que muestra es lo mismo que el de arriba con la diferencia
         * que muestra espacios en blanco (mostramos n-2 espacios en blanco)
         * 
         * Para terminar introducimos un * antes de que continue el primer bucle
         */
        for(int i=1; i<= n-2; i++){
            System.out.print("*");
            for(int j=1; j<= n-2; j++){
                System.out.print("  ");
            }
            System.out.println(" *");
        }

        /**
         * Creamos un bucle que recorra desde 1 hasta el número (n) que introducimos en consola para que 
         * muestre por pantalla el mismo número de *
         * Será el bucle para la parte inferior del cuadrado
         */
        for(int i=1; i<=n; i++){
            System.out.print("* ");
        }   
    }
}