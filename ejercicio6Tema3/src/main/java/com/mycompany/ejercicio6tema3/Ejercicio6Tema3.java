package com.mycompany.ejercicio6tema3;

public class Ejercicio6Tema3 {

    public static void main(String[] args) {

        Conversor c = new Conversor();
        
        System.out.println("** -5 **");
        System.out.println("Celius a Fahrenheit: " + c.celsiustofahrenheit(-5));
        System.out.println("Fahrenheit a Celsius: " + c.fahrenheittocelsius(-5));
        System.out.println("-----------------");
        System.out.println("** 0 **");
        System.out.println("Celius a Fahrenheit: " + c.celsiustofahrenheit(0));
        System.out.println("Fahrenheit a Celsius: " + c.fahrenheittocelsius(0));
        System.out.println("-----------------");
        System.out.println("** 15 **");
        System.out.println("Celius a Fahrenheit: " + c.celsiustofahrenheit(15));
        System.out.println("Fahrenheit a Celsius: " + c.fahrenheittocelsius(15));
        System.out.println("-----------------");
        System.out.println("** 32 **");
        System.out.println("Celius a Fahrenheit: " + c.celsiustofahrenheit(32));
        System.out.println("Fahrenheit a Celsius: " + c.fahrenheittocelsius(32));
    }
}