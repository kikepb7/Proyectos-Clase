package com.mycompany.examen2otrimestre;

import java.util.*;
/**
 *
 * @author Enrique Palma
 */
public class ListaPersonas {
    
    // Creamos un ArrayList de la clase Persona (persona)
    ArrayList<Persona> personas = new ArrayList<>();
    
    public ListaPersonas(){
  
    }
    
    // Método para añadir personas en el ArrayList
    public void anadirPersona(Persona persona) {
        personas.add(persona);
    }
    
    
    // Método para listar los datos de todas las personas en la clase
    public void listar(){
        for(Persona p : personas){
            System.out.println("Persona: " + p.getNombre() + " " + p.getApellidos() + " " + p.getNif());
        }
    }
    
    // Método para retornar los datos de una persona con el nif como parámetro
    public Persona buscarPersona(String nif){
        for(Persona p : personas){
            if(p.getNif().equals(nif)){
                System.out.println(p);
            }
        }
        return null;
    }
}
