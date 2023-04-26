package com.mycompany.exameninterfaces;

/**
 *
 * @author Enrique Palma
 */
public class ExamenInterfaces {

    public static void main(String[] args) {
        
        // Creamos una instancia de cada figura geométrica
        
        Circulo c1 = new Circulo(10);
        Triangulo tr1 = new Triangulo(5, 3);
        Cuadrado cr1 = new Cuadrado(4);
        
        
        
        // Mostramos por pantalla todas las figuras
        System.out.println(c1.mostrar());
        System.out.println("");
        
        System.out.println(tr1.mostrar());
        System.out.println("");
        
        System.out.println(cr1.mostrar());
    }
}