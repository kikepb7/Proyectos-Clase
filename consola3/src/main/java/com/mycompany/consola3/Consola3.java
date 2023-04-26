package com.mycompany.consola3;
import java.io.Console;
import java.util.Date;

public class Consola3 {

    public static void main(String[] args) {
        Console c = System.console();
        if(c==null){
            System.err.println("No hay consola.");
        }
        else{
            System.out.println("Introduzca su nombre: ");
            String nombre = c.readLine();
            System.out.println("Hola " + nombre);
            System.out.println("Introduzca su password: ");
            String password = String.valueOf(c.readPassword());
            System.out.println("Su password es: " + password);
       }
        
        float bi = 17000.20f;
        int iva = 21;
        float total = 23.1290f;
        
        // Printf muestra parámetros, separados por "," y hay que indicar el "%f"
        // "%d" para números entereos
        // "%n" es un salto de línea
        
        System.out.printf("El total es: %.4f euros", total);
        System.out.println("\n");
        System.out.println("El total es: " + total + " euros");
        System.out.printf("El total es: %f euros", total);
        System.out.println("\n");
        System.out.printf("El total es: %.10f euros", total);
        System.out.println("\n");
        System.out.printf("Base Imponible: %010.2f. %nIVA: %d %nTotal: %.2f Euros", bi, iva, total);
        System.out.println("\n");
        
        
        
       
        // Ejemplo de como se carga una cadena
        
        String cadena = "hola";
        String nombre = "Luis";
        System.out.printf("Cadena vale %s y el nombre es %s ", cadena, nombre);
        
        
        // Ejemplo de como se carga un booleano
        
        boolean booleano = false;
        System.out.printf("%nMostrando booleanos %b %b", booleano, 8);
       
        
        // Formateo de fechas
        
        Date fecha = new Date();
        System.out.printf("%nHoy es %1$td/%1$tm/%1$tY %1$tH:%1$tM", fecha); 
    }
}