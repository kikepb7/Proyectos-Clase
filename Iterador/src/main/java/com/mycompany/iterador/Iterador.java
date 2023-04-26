package com.mycompany.iterador;

import java.util.*;
/**
 *
 * @author Enrique Palma
 */
public class Iterador {

    public static void main(String[] args) {
        
        // Creamos una lista "frutas"
        ArrayList<String> frutas = new ArrayList<>();
        
        // Añadimos valores al array
        frutas.add("manzana");
        frutas.add("kiwi");
        frutas.add("pera");
        frutas.add("plátano");
        frutas.add("coco");
        
        
        System.out.println("La lista de frutas es: ");
        System.out.println(" ");
        
        
        // Creamos un iterador (objeto que permite recorrer un contenedor)
        System.out.println("Usando Iterator: ");
        System.out.println("--------------------");
        Iterator<String> iterator = frutas.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
        
        
        
        System.out.println(" ");
        System.out.println("--------------------");
        
        
        
        iterator.forEachRemaining(ff->{
            System.out.println(ff);
        });
        
        
        
        System.out.println(" ");
        System.out.println("--------------------");
        
        
        // Iterador inverso
        ListIterator iteradorInverso = frutas.listIterator(frutas.size());
        while(iteradorInverso.hasNext()){
            System.out.println(iteradorInverso.previous());
        }
        
        
        
        // Iterar al revés
        Collections.reverse(frutas);
        
        
        
        System.out.println(" ");
        
        
        System.out.println("Usando bucle for: ");
        System.out.println("--------------------");
        for(int i=0; i<frutas.size(); i++){
            System.out.println(frutas.get(i));
        }
        
        System.out.println(" ");
        
        System.out.println("Usando bucle forEach: ");
        System.out.println("--------------------");
        for(String fruta:frutas){
            System.out.println(fruta);
        }
        
        
        
        System.out.println(" ");
        System.out.println("--------------------");
        
        
        
        frutas.forEach((f) -> {
            System.out.println(f);
        });
        
        
        
        System.out.println(" ");
        System.out.println("--------------------");
        
        
        
        frutas.forEach(System.out::println);
    }
}
