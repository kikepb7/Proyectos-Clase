package org.example;

import java.util.Scanner;
import java.util.*;

import static org.example.Ejemplo.par;
import static org.example.Recursividad.calcularFactorial;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");

        int n = sc.nextInt();
        System.out.println(calcularFactorial(n));


        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println();

        Ejemplo ejemplo = new Ejemplo();
        int[] numeros = {5, 22, 13, 43, 77, 17, 19, 33, 10};
        System.out.println("El número máximo entre: ");
        System.out.println(Arrays.toString(numeros));
        System.out.println("es: " + ejemplo.Maximo(numeros, 0, numeros.length-1));

        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println();

        int n1 = 8;
        int m = 11;
        System.out.println(n1 + " es par --> " + par(n1));
        System.out.println(m + " es par --> " + par(m));

        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println();

        DecimalABinario d1 = new DecimalABinario();
        d1.decimalABinario(10);
    }
}