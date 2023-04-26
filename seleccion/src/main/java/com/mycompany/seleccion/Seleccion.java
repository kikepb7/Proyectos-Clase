package com.mycompany.seleccion;

import java.util.Scanner;

public class Seleccion {

    public static void main(String[] args) {
        
        // DESCUENTOS
        // Pedimos precio y edad para hacer descuentos
        // 65 o más --> 20%
        // 60 a 64 más --> 10%
        // Hasta 30 --> 15%
        // Hasta 20 --> 25%
        
        Scanner sc = new Scanner(System.in);
        double total = 0;
        
        System.out.println("Introduzca el precio de su producto: ");
        double price = sc.nextDouble();
        
        System.out.println("Introduzca su edad para calcular el descuento: ");
        int age = sc.nextInt();

        
        if(age>=65){
            total = price * 0.8;
            System.out.println("El precio es de " + price + " euros");
            System.out.println("Su edad es de " + age + " años");
            System.out.println("El descuento es de 20%");
            System.out.println("El precio final es de: " + total + " euros");
        }
        else if (age>=60 && age<=64){
            total = price * 0.9;
            System.out.println("El precio es de " + price + " euros");
            System.out.println("Su edad es de " + age + " años");
            System.out.println("El descuento es del 10%");
            System.out.println("El precio final es de: " + total + " euros");
        }
        else if(age<=29 && age>20){
            total = price * 0.85;
            System.out.println("El precio es de " + price + " euros");
            System.out.println("Su edad es de " + age + " años");
            System.out.println("El descuento es del 15%");
            System.out.println("El precio final es de: " + total + " euros");
        }
        else if(age<=19){
            total = price * 0.75;
            System.out.println("El precio es de " + price + " euros");
            System.out.println("Su edad es de " + age + " años");
            System.out.println("El descuento es del 25%");
            System.out.println("El precio final es de: " + total + " euros");
        } 
        else{
            System.out.println("El precio es de " + price + " euros");
            System.out.println("Su edad es de " + age + " años");
            System.out.println("No tiene descuento");
            System.out.println("El precio final es de: " + price + " euros");
        }
        
        
        
        /*
        *****************************
        SOLUCIÓN DEL PROFESOR
        *****************************

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca sy edad");
        
        if(sc.hasNextInt()){
        
            // Procesar edad
            age = sc.nextInt();
            Syystem.out.println("Introduzca el precio");
            if(sc.hasNExtFloat()){
        
            // Procesar precio
                price = next.Float();
                int age = 21;
                float price = 100;
                float discount = 0;

                if (age <= 20){
                    discount = 25;
                }
                if else (age <= 30){
                     discount = 15;
                 }
                 if else (age >= 60 && age < 65){
                     discount = 10;
                 }
                 else if(age >= 65){
                     discount = 20;
                 }
                 else{
                     discount = 0;
                 }
            }
        else{
            System.out.println("El precio dado no es un float");
        }
        
        float total = price - (precio * discount/100);
        
        System.out.println("El precio final es " + total);
        
        */
    }
}