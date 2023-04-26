package com.mycompany.colecciones;

import java.util.ArrayList;

/**
 *
 * @author Enrique Palma
 */
public class Array {
    
    static void crearArrayList() {
        ArrayList<Integer> arrayEnteros = new ArrayList();
        
        arrayEnteros.add(22);
        arrayEnteros.add(77);
        arrayEnteros.add(11);
        arrayEnteros.add(22);
        
        System.out.println("Primer elemento: " + arrayEnteros.get(0));
        System.out.println("Segundo elemento: " + arrayEnteros.get(1));
        
        Integer enteroReemplazado = arrayEnteros.set(1, 33);
        
        System.out.println("Elemento reemplazado: " + enteroReemplazado);
        System.out.println("Ahora segundo elemento: " + arrayEnteros.get(1));
        System.out.println("Tercer elemento: " + arrayEnteros.get(2));
        
        System.out.println("");
        
        System.out.println(arrayEnteros);
        
        
        // Sustituir todas ocurrencias de 22 a 55
        while(arrayEnteros.indexOf(22) != -1){
            arrayEnteros.set(arrayEnteros.indexOf(22), 55);
        }
        
        // Mostrar arraylist
        for(int elemento:arrayEnteros){
            System.out.println(elemento);
        }
        
        
        arrayEnteros.forEach((elemento)-> {
            System.out.println(elemento);
        });
    
    }
}