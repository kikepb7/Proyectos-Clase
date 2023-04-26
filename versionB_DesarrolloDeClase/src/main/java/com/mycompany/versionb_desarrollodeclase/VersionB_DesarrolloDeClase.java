package com.mycompany.versionb_desarrollodeclase;

import java.util.Scanner;

public class VersionB_DesarrolloDeClase {

    public static void main(String[] args) {
        
        // Creamos las instancias de la clase Empleado con los datos proporcionados
        Empleado Pedro = new Empleado ("Pedro", "Pérez", 1300, 2, "B");
        Empleado Ana = new Empleado ("Ana", "Diez");
        Empleado Carmen = new Empleado("Carmen", "Lorenzo", 1250, 6, "D");
        
        // Mostramos los datos de los empleados y el número total de empleados
        System.out.println("*************************");
        System.out.println("Introducir los nombres completos de cada empleado y sus sueldos: ");
        System.out.println("");
        System.out.println(Pedro);
        System.out.println(Ana);
        System.out.println(Carmen);
        
        System.out.println("");
        System.out.println("Número de empleados " + Empleado.getEmpleadosTotales());
        System.out.println("*************************");
        System.out.println();
        
        
        // Aplicamos una prima de bonificación para todos los empleados del 10%
        Empleado.setPrima(10);
        
        
        // Ascendemos a Pedro a la categoría C
        Pedro.setCategoria("C");
        
        
        // Mostramos los datos de los empleados una vez que hemos actualizado los campos y el número total de empleados
        System.out.println("*************************");
        System.out.println("Introducir los nombres completos de cada empleado y sus sueldos: ");
        System.out.println("");
        System.out.println(Pedro);
        System.out.println(Ana);
        System.out.println(Carmen);
        
        System.out.println("");
        System.out.println("Número de empleados " + Empleado.getEmpleadosTotales());
        System.out.println("*************************");
        System.out.println();
    }
}