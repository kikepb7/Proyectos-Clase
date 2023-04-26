package com.mycompany.ejemplo_junit2;

public class Operaciones {
    
    public int suma(int a, int b){
        return a + b;
    }
    
    public double conversorFahrenheit(double temperatura, char sistema){

        if(sistema == 'F'){
            return (temperatura - 32) / 1.8;
        }
        else{
            return (temperatura * 1.8) + 32;
        }
    }
    
    public double conversorKelvin(double temperatura, char sistema){
        
        if(sistema == 'K'){
            return temperatura + 273;
        }
        else{
            return temperatura;
        }
    }
}