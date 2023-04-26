package org.example;

public class Fibonacci {
    public static int calcularFibonacci(int n){
        // CASO BASE
        if (n < 2) {
            return n;
        } else {
            return calcularFibonacci(n-1) + calcularFibonacci(n-2);
        }
    }
}
