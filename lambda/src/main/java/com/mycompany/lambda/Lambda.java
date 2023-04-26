package com.mycompany.lambda;

import java.util.*;

public class Lambda {

    public static void main(String[] args) {
        
        Persona personaA = new Persona("Pedro", "Pérez", 20);
        Persona personaB = new Persona("Ana", "Blanco", 15);
        Persona personaC = new Persona("Miguel", "Álvarez", 50);
        
        List <Persona> lista = Arrays.asList(personaA, personaB, personaC);
        
        lista.sort(( p1, p2)->p1.getEdad() > p2.getEdad() ? 1 : -1);
        
        for(Persona p : lista){
            System.out.println(p.getNombre() + " ," + p.getEdad());
        }
    }
}

/*
    Bloque lambda implementa la funcionalidad, de una manera funcional
    
    Define una función dentro de nuestro código con sus parámetros de entrada y 
    retorno

    Expresiones lambda soportan "inferred types", es decir, el compilador es 
    capaz de entender de que tipo son las variables que el método sort necesita
*/