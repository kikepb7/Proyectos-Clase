package com.mycompany.ejerciciocine;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioCine {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        /**
         * Creamos objetos/instancias de la clase Película, introduciendo los atributos correspondientes
         */
        Pelicula p1 = new Pelicula ("Star Wars", "George Lucas", 1977, "CF");
        Pelicula p2 = new Pelicula("Interestellar", "N/A", 2017, "CF");
        Pelicula p3 = new Pelicula("Citizen Kane", "Orson Wells", 1941, "DR");
        /**
         * Mostramos por pantalla, con los métodos get(), la información de cada objeto
         */
        
        p2.setDirector("Christopher Nolan");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println("");
        System.out.println("Presentando: ");
        System.out.println(p2);
    }
}