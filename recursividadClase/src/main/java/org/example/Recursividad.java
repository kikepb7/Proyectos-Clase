package org.example;

public class Recursividad {

    // Creamos un metodo estático que calcule el factorial de un número "n"
    static int calcularFactorial(int n) {
        if(n==0 || n==1){ // Si el número es 0 o 1, su factorial es 1
            return 1;
        }
        else{
            return n * calcularFactorial(n-1); // Si es diferente de 0 y 1, calculamos el factorial con esta fórmula
        }
    }

    // Solución recursiva
    void cuentaAtrasRecursiva(int n){
        if(n>0){
            System.out.println(n);
            cuentaAtrasRecursiva(--n);
        }
        else{
            System.out.println("Final!");
        }
    }


    // Solución iterativa
    void cuentaAtrasIterativa(int n){
        while(n>0){
            System.out.println(n--);
        }
        System.out.println("Final!");
    }


    // Solución recursiva
    int factorialRecursiva(int n){
        if(n>0) {
            int resultado = n * factorialRecursiva(n - 1);
            return resultado;
        }
        else{
            return 1;
        }
    }


    // Solución iterativa
    int factorialIterativa(int n){
        int resultado = 1;
        for(int i=n; i>=1; i--){
            resultado *= i;
        }
        return resultado;
    }
}