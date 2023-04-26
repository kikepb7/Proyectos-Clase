package com.mycompany.ejercicio9_3;

import java.util.*;

/**
 *
 * @author Enrique Palma
 */
public class Ejercicio9_3 {

    public static void main(String[] args) {

        // Creamos una instancia Scanner
        Scanner sc = new Scanner(System.in);
        
        
        // Creamos un ArrayList de caracteres
        ArrayList<Character> caracteres = new ArrayList<Character>();
        
        while(true) {
            System.out.println("Introduzca un caracter: ");
            
            String todosCaracteres = sc.nextLine();
            
            // Cuando el carácter introducido sea Enter, parar el programa
            if(todosCaracteres.equals("")) {
                break;
            }
            
            // Si no se ha introducido la tecla Enter, añadimos el carácter
            caracteres.add(todosCaracteres.charAt(0));
        }
        
        System.out.println("Los caracteres introducidos son: " + caracteres);

        
        
        // Solución con ITERATOR
        ListIterator<Character> iterador = caracteres.listIterator(caracteres.size());
        
        while(iterador.hasPrevious()) {
            System.out.print(iterador.previous());
        }
        
        
        System.out.println("");
        System.out.println("--------");
        
        
        // Solución con bucle FOR
        for(int i=caracteres.size() - 1; i>=0; i--){
            System.out.print(caracteres.get(i));
        }
        
        
        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("");
        
        System.out.println("***EJERCICIO 9.4***");
        System.out.println("");
        
        
        // Creamos un HashSet para eliminar los caracteres duplicados
        HashSet<Character> caracteresOrdenados = new HashSet<Character>(caracteres);
        
        // Convertimos un HashSet en un ArrayList
        ArrayList<Character> ordenada = new ArrayList<Character>(caracteresOrdenados);
        
        // Ordenamos el ArrayList con el método sort()
        Collections.sort(ordenada);
        
        // Mostramos por pantalla el ArrayList
        System.out.println(ordenada);
        
        
        /* SOLUCIÓN FABIO
        -------------------
        
        if(!caracteres.contains(todosCaracteres.charAt(0))){
            // Si no se ha introducido la tecla Enter, añadimos el carácter
            caracteres.add(todosCaracteres.charAt(0));
        }
        */
        
        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("");
        
        System.out.println("***EJERCICIO 9.5***");
        System.out.println("");
        
        
        
        
    }
}