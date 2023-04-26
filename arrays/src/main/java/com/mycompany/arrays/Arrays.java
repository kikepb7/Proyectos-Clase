package com.mycompany.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Enrique Palma
 */
public class Arrays {

    /*
     Escribir un método que retorne un array de 100 números enteros 
     generados aleatoriamente
    
    */
    public static int[] numerosAleatorios(int dimension){
        int[] array = new int[dimension]; // Creamos el array
         Random random = new Random();
        
        for(int i=0; i<array.length; i++){ // Recorremos el array e introducimos los valores aleatorios
        //array[i] = (int)Math.random()*(100+1);
          array[i] = random.nextInt(101);
        }
        return array; // Devolvemos el array completo
        
    }
    

    public static void proceso(int n, int[] numeros, Persona p){
        n = 9;
        
        for(int i=0; i<numeros.length; i++){
            numeros[i] = numeros[i]*2;
        }
        
        p.edad = 99;
    }
    
    
    public static void main(String[] args) {
        
        Persona p = new Persona("Pepe", 20);
        
        int [] numeros = numerosAleatorios(100);

        for(int elemento : numeros){
            System.out.println(elemento);
        }

        Arrays.sort(numeros);
        System.out.println(numeros.toString());


        // Parámetros
        int b = 10;
        int[] datos = {1, 2, 3};

        proceso(b, datos, p);
        System.out.println("Valor de b: " + b);
        System.out.println("Valor de datos: " + Arrays.toString(datos));
        
        System.out.println();
        
        
        
        
        
        // Inversión de array
        
        String[] frutas = {"piña", "pera", "plátano", "kiwi"};
        
        String[] frutas2 = new String[frutas.length];
        frutas2[0] = frutas[0];
        int j=1;
        for(int i=frutas.length-1; i>0; i--){
            frutas2[j] = frutas[i];
            j++;
            }
        System.out.println(Arrays.toString(frutas2));


        System.out.println("");
        System.out.println("*************************************");
        System.out.println("");

        Cadenas cadena = new Cadenas();

        
    }
}
