package com.mycompany.ejercicio6tema3;

public class Conversor {
    
    public double fahrenheittocelsius(double temperatura){
        double celsius = (temperatura - 32) / 1.8;
        return celsius;
    }
    
    public double celsiustofahrenheit(double temperatura){
        double fahrenheit = (temperatura * 1.8) + 32;
        return fahrenheit;
    }
    
    public double eurodolar (double cantidad){
        double dolar = cantidad * 1.07;
        return dolar;
    }
    
    public double dolareuro (double cantidad){
        double euro = cantidad * 0.93;
        return euro;
    }
}