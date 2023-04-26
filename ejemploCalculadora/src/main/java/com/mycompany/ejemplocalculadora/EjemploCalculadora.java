package com.mycompany.ejemplocalculadora;

import java.util.Scanner;

public class EjemploCalculadora {

    public static void main(String[] args) {
        
        // Pedir dos números, operación (suma, resta, multiplicación, división, potencia, módulo)
        // Operación 1: suma; Operación 2: resta; Operación 3: multiplicación; Operación 4: división; Operación 5: potencia; Operación 6: módulo
        //  Operación 7: raiz cuadrada
        // Operación no soportada
        
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        
        System.out.println("------------------");
        System.out.println("* CALCULADORA *");
        System.out.println("------------------");
        System.out.println(" ");
        
        do{
            System.out.println("Introduzca el primer número: ");
            double n1 = sc.nextDouble();
            System.out.println("Introduszca el segundo número");
            double n2 = sc.nextDouble();


            double total = 0;
            double suma = n1 + n2;
            double resta = n1 - n2;
            double multiplicacion = n1 * n2;
            double division = n1/n2;
            double potencia = Math.pow(n1, n2);
            double modulo = n1%n2;
            int operacion = 0;

            System.out.println(" ");
            System.out.println("¿Qué operación desea realizar?");
            operacion = sc.nextInt();

            switch (operacion){
                case 1: total = n1 + n2;
                break;
                case 2: total = n1 - n2;
                break;
                case 3: total = n1 * n2;
                break;
                case 4: total = n1 / n2;
                break;
                case 5: total = Math.pow(n1, n2);
                break;
                case 6: total = n1%n2;
                break;
                default: System.out.println("Operación no soportada");
                }
            System.out.println("El resultado es: " + total);
        }while(loop==true);
    }
}