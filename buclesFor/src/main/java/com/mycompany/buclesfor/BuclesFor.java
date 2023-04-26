package com.mycompany.buclesfor;

public class BuclesFor {

    public static void main(String[] args) {
        
        int total = 0;
        /*
        Calcular la suma de los 100 primeros números pares
        
            1º Para recorrer los 100 primeros números pares debemos crear un bucle for que recorra 200 números
            2º Introducimos una condición para el que sume los números cuya resto de la división entre 2 sea 0
            3º Mostramos por pantalla el resultado
        */
        /*
        for(int i=0; i<=200; i++){
            if(i%2==0){
                total = total + i; // total += i;
                System.out.println(i);
            }
        }
        System.out.println("La suma primeros 100 números pares es de: " + total);
        */
        int suma = 0;
        int sigPar=2;
        for (int i=1; i<=100; i++){
            System.out.println("Suma: " + sigPar);
            suma = suma + sigPar;
            sigPar += 2;
        }
        System.out.println("Valor de la suma: " + suma);
    }
}