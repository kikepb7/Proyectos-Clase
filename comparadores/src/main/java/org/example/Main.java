package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Creamos instancias de la clase Persona
        Persona p1 = new Persona("Jose", "Perez", 30);
        Persona p2 = new Persona("Enrique", "Alvarez", 21);
        Persona p3 = new Persona("Jaime", "Perez", 22);
        Persona p4 = new Persona("Ana", "Sainz", 28);


        // Creamos un ArrayList de personas
        ArrayList<Persona> personas = new ArrayList<>(Arrays.asList(p1, p2, p3, p4));


        // Ordenamos la lista de personas por nombre
        personas.sort(new ComparadorApellidos());


        // Mostramos por pantalla la lista de personas

        /*
            for(Persona p:personas) { System.out.println(p);};
            personas.forEach(persona -> System.out.println(persona));
        */
        personas.forEach(System.out::println);


        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println();


        // Ordenamos la lista de personas por edad y lo mostramos por pantalla
        personas.sort((o1, o2)
                -> o1.getEdad() > o2.getEdad() ? 1:-1);
        personas.forEach(System.out::println);


        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println();


        Comparator<Persona> comparadorA = (pa, pb)
                -> pa.getApellidos().compareTo(pb.getApellidos());

        Comparator<Persona> comparadorB
                = comparadorA.thenComparing((pa, pb)
                -> pa.getNombre().compareTo(pb.getNombre()));

        Comparator<Persona> comparadorC
                = comparadorB.thenComparing((pa, pb)
                -> pa.getEdad() > pb.getEdad() ? 1:-1);


        personas.sort(comparadorC);
        personas.forEach(System.out::println);
    }
}