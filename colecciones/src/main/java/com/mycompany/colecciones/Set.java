package com.mycompany.colecciones;

import java.util.*;

/**
 *
 * @author Enrique Palma
 */
public class Set {
    
    
    static void crearHashSet(){ // Permite el acceso más rápido a los elementos (no permite realizar accesos secuenciales y los elementos no están ordenados por ningún criterio)
        
        // Creamos la colección
        HashSet<String> setNombres = new HashSet<>();
        
        setNombres.add("Juan");
        setNombres.add("Micaela");
        setNombres.add(null);
        setNombres.add("Micaela");
        setNombres.add("David");
        
        // Recorriendo elementos
        Iterator<String> itr = setNombres.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        // Imprimiendo todo el conjunto
        System.out.println(setNombres);  
    }
    
    
    static void crearLinkedHashSet(){ // Permite almacenar los elementos ordenados según han sido insertados
        
        // Creamos la colección
        LinkedHashSet<String> setNombres = new LinkedHashSet<>();
        
        setNombres.add("Juan");
        setNombres.add("Micaela");
        setNombres.add(null);
        setNombres.add("Micaela");
        setNombres.add("David");
        
        // Recorriendo elementos
        Iterator<String> itr = setNombres.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        // Imprimiendo todo el conjunto
            System.out.println(setNombres);
    }
    
    
    static void crearTreeSet1(){ // Almacena los elementos de forma ordenada en función de su valor
        
        // Si los elementos son de un tipo envoltorio es facil conocer su orden lexicográfico o numérico
        // Si son de otros tipos, la ordenadción puede estar realizándose de un modo dificilmente predecible
        
        // Creamos la colección
        TreeSet<Integer> setNombres = new TreeSet<>();
        
        setNombres.add(3);
        setNombres.add(1);
        //setNombres.add(null);
        setNombres.add(1);
        setNombres.add(2);
        
        // Recorriendo elementos
        Iterator<Integer> itr = setNombres.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        // Imprimiendo todo el conjunto
        System.out.println(setNombres);
    }
    
    
    static void crearTreeSet2(){
        
        // Creamos la colección
        TreeSet<Persona> setPersona = new TreeSet<> (Comparator.comparing(Persona::getNombre));
        
        setPersona.add(new Persona("Maria"));
        setPersona.add(new Persona("Ricardo"));
        setPersona.add(new Persona("Ricardo"));
        
        setPersona.add(new Persona("Estefania"));
        setPersona.add(new Persona("Javier"));
        
        
        // Recorriendo elementos en orden creciente
        System.out.println("Recorriendo en orden creciente: ");
        Iterator<Persona> itr = setPersona.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next().getNombre());
        }
        
        System.out.println("");
        
        // Recorriendo elementos en orden decreciente
        System.out.println("Recorriendo en orden decreciente: ");
        Iterator<Persona> ditr = setPersona.descendingIterator();
        while(ditr.hasNext()){
            System.out.println(ditr.next().getNombre());
        }
        
    }
}