package com.mycompany.examenentornosjunit;

/**
 *
 * @author Enrique Palma
 */
public class Operaciones {
    
    // Método para calcular la suma de dos números enteros
    public int suma(int a, int b){
        
        return a + b;
    }
    
    
    // Método para calcular la división de dos números enteros
    public float division(float a, float b){
        
        if(b == 0){
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        else{
            return a/b;
        }
    }
    
    
    // Método para decir si una persona es mayor o menor de edad
    public String mayorDeEdad(int edad){
        if(edad < 18){
            return "Es menor de edad";
        }
        else{
            return "Es mayor de edad";
        }
    }
    
    
    // Método para cambiar palabra
    public String ofuscar(String cadena){
        String enfado = "";
        for(int i=0; i<cadena.length(); i++){
            char caracter = cadena.charAt(i);
            switch(caracter){
                case 'h':
                    enfado += "#";
                break;
                case 'o':
                    enfado += "@";
                break;
                case 'l':
                    enfado += "a";
                break;
                case 'a':
                    enfado += "#";
                break;
                default:
                    enfado += caracter;
            }
        }
        return enfado;
    }
    
    
    // Método para cambiar todas las vocales en 'e'
    public String conE(String cadena){
        
        if(cadena.length() > 10){
            throw new IllegalArgumentException("No se puede introducir cadenas 10 o más caracteres.");
        }
        else{
            cadena = cadena.replaceAll("[aeiouAEIOU]", "e");
        }
        return cadena;
    }
    
    
    
    
    // Método para invertir los componentes de un array
    public String[] invertirParte(String[] frutas){
        
        if(frutas.length >= 4){
            String temp = frutas[1];
            frutas[1] = frutas[frutas.length -1];
            frutas[frutas.length - 1] = temp;
        }
        return frutas;
    }
}