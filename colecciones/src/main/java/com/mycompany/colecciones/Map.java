package com.mycompany.colecciones;

import java.util.*;

/**
 *
 * @author Enrique Palma
 */
public class Map { // Interfaz Map permite almacenar pares clave-valor de manera fácil de buscar un valor a partir de su clvae
    
    static void crearHashMap(){ 
    // Almacena las claves en una tabla. No garantiza ningún orden. Mejor rendimiento
        HashMap<Integer, String> hashMap = new HashMap<>();
        
        hashMap.put(1, "1");
        hashMap.put(3, "3");
        hashMap.put(4, "4");
        hashMap.put(2, "2");
        hashMap.put(5, "5");
        
        System.out.println(hashMap.values());
    }
    
    
    static void crearLinkedHashMap(){ 
    // Mantiene una lista con un enlace doble en todas sus entradas.
    // Más costosa pero se define el orden de iteración (normalmente el orden en que se insertaron las claves)
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        
        linkedHashMap.put(1, "1");
        linkedHashMap.put(3, "3");
        linkedHashMap.put(4, "4");
        linkedHashMap.put(2, "2");
        linkedHashMap.put(5, "5");

        System.out.println(linkedHashMap.values());
    }
    
    
    static void crearTreeMap() {
        // Almacena las claves ordenadas ascendentemente en un árbo. Las claves deben
        // implementar la interfaz Comparable. No se admite valores null
        TreeMap<Integer, String> puntuaciones = new TreeMap<>();
        
        puntuaciones.put(8, "Notable alto");
        puntuaciones.put(5, "Aprobado");
        puntuaciones.put(10, "MAtricula H.");
        puntuaciones.put(6, "Bien");
        puntuaciones.put(9, "Sobresaliente");
        puntuaciones.put(7, "Notable");
        
        puntuaciones.entrySet().forEach((m) -> {
            System.out.println(m.getKey() + " " + m.getValue());
        });
        
        puntuaciones.replace(7, "Notable", "Notable bajo");
        
        System.out.println(puntuaciones.values());
        System.out.println("Por debajo de " + puntuaciones.firstKey() + " es suspenso");
    }   
}
