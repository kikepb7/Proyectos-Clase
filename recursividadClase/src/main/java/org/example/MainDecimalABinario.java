package org.example;

import java.util.Scanner;

import static org.example.DecimalABinario.decimalABinario;

public class MainDecimalABinario {
    public static void main(String[] args) {

        // Creamos una instancia de la clase Scanner
        Scanner sc = new Scanner(System.in);

        // Inicializamos una variable n
         int n= 0;

        do {
            // Pedimos por pantalla que introduzcamos un número
            System.out.println("Introduzca un número: ");
            n = sc.nextInt();

            // Mostramos automáticamente el número introducido en binario
            System.out.print("El número binario de " + n + " es: ");
            decimalABinario(n);
            System.out.println();
        }
        while(n>-1);
    }
}