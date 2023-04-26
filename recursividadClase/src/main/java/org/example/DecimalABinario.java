package org.example;

public class DecimalABinario {

    // Método recursivo que pasa un número decimal a binario
    public static void decimalABinario(int n){
        // CASO BASE
        if(n<2){ // Si el número es menor que 2, el número binario es el mismo número de entrada
            System.out.print(n);
        }
        else{
            // Si el número es mayor que 2, dividimos el número entre 2 y mostramos por pantalla
            // su módulo
            decimalABinario(n/2);
            System.out.print(n%2);
        }
    }
}
