package com.mycompany.examenclases;

/**
 *
 * @author Enrique Palma Bullejos
 */
public class ExamenClases {

    public static void main(String[] args) {
        
        // Creamos las instancias
        Animales a1 = new Animales("Oddie", "Perro");
        Animales a2 = new Animales("Piolín", "Pájaro");
        Animales a3 = new Animales("Garfield", "Gato", 4);
        
        
        // Cambiamos los tipos de la segunda instancia
        a2.setNombre("Canario");
        a2.setEdad(9);
        
        
        // Mostramos por pantalla
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
    }
}