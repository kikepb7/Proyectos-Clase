package org.example;

import java.util.Scanner;

public class InvertirNumeros {
    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un número:");
            int n = sc.nextInt();
            invertir(n);
            System.out.println();
            System.out.println();
        }
        while(true);
    }

    public static void invertir(int n){
        if(n<10){
            System.out.print(n);
        }
        else{
            System.out.print(n%10);
            invertir(n/10);
        }
    }



    // SOLUCIÓN MATIAS
    public static int invertir2(int n) {
        return invertirRecursivo(n, 0);
    }

    private static int invertirRecursivo(int n, int invertido) {
        if (n == 0) {
            return invertido;
        }
        int ultimoDigito = n % 10;
        invertido = (invertido * 10) + ultimoDigito;
        return invertirRecursivo(n / 10, invertido);
    }
}