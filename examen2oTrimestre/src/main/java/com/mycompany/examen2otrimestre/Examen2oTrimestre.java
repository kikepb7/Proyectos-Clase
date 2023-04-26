package com.mycompany.examen2otrimestre;

import java.util.*;

/**
 *
 * @author Enrique Palma
 */
public class Examen2oTrimestre {

    public static void main(String[] args) {
        
        // Creamos una instancia de la clase ListaPersonas
        ListaPersonas lista = new ListaPersonas();
        
        
        // Añadimos instancias de la clase Persona y las añadimos al ArrayList
        lista.anadirPersona(new Persona("11111A", "Carmen", "López"));
        lista.anadirPersona(new Persona("22222B", "Pedro", "Ruíz"));
        lista.anadirPersona(new Persona("33333C", "Luisa", "Sánchez"));
        lista.anadirPersona(new Persona("44444D", "Pablo", "Sánchez"));
        

        // Listamos los datos de las Personas incluidas en el ArrayList
        lista.listar();
        System.out.println("");
        
        // Buscamos personas por el campo nif
        System.out.println("Buscamos persona con NIF: ");
        System.out.println("-----------------------------");
        
        Persona persona = lista.buscarPersona("33333C");
        
        Persona person2 = lista.buscarPersona("55555E");
        
        
    }     
}