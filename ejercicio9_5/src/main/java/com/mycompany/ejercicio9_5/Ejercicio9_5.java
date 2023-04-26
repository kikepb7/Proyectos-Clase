package com.mycompany.ejercicio9_5;

import java.util.*;

/**
 *
 * @author Enrique Palma
 */
public class Ejercicio9_5 {

    public static void main(String[] args) {
        
        Integer n = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de alumnos a gestionar: ");
        
        int numeroAlumnos = sc.nextInt();
        
        
        // Creamos un TreeSet de alumnos
        TreeSet<Alumno> alumnos = new TreeSet<>();
        
 
        // Datos del alumno
        for(int i=0; i<numeroAlumnos; i++){
            System.out.println("Introduzca el nombre del alumno: ");
            String nombre = sc.next();
            
            System.out.println("Introduzca el primer apellido: ");
            String apellido1 = sc.next();
            
            System.out.println("Introduzca el segundo apellido: ");
            String apellido2 = sc.next();
            
            System.out.println("Introduzca la nacionalidad: ");
            String nacionalidad = sc.next();
            

            alumnos.add(new Alumno(nombre, apellido1, apellido2, nacionalidad));
        }
        
        
        System.out.println(alumnos);
        
        
        
        
        
        
        
    }
}
