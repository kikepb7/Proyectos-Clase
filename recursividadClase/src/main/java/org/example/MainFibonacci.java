package org.example;

import java.util.Scanner;

import static org.example.Fibonacci.calcularFibonacci;


public class MainFibonacci {
    public static void main(String[] args) {

        // Creamos una instancia de la clase Scanner
        Scanner sc = new Scanner(System.in);

        // Inicializamos una variable n
        int n= 0;

        do {
            // Pedimos por pantalla que introduzcamos un número
            System.out.println("Introduzca un número: ");
            n = sc.nextInt();

            // Mostramos por pantalla la posición en la secuencia de Fibonacci
            System.out.print("La posición en la secuencia de Fibonacci de " + n + " es: ");
            System.out.println(calcularFibonacci(n));
            System.out.println();
        }
        while(n>-1);


//            int m = sc.nextInt();
//            int f = 0;
//            int t1 = 1;
//            int t2;
//            for (int i = 1; i <= m; i++) {
//                t2 = f;
//                f = t1 + f;
//                t1 = t2;
//                System.out.println(t1);
//            }

    }
}
