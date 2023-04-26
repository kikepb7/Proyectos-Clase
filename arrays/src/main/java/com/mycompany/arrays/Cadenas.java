package com.mycompany.arrays;

import java.util.Arrays;

/**
 *
 * @author Enrique Palma
 */
public class Cadenas {
    
    /* Escribe un programa que sea capaz de contar el número de palabras diferentes 
    que hay en un texto que se le pasa por argumento, sin tener en cuenta si están 
    en mayúsculas o minúsculas
    */
    
    /**
     * 
     * @param texto
     * @return Número de palabras del texto, mayúsculas y minúsculas
     */
    static int contarPalabras(String texto){
        
        String[] resultado = texto.split( " ");
        
        System.out.println("Resultado de split: " + Arrays.toString(resultado));
        
        return resultado.length;

    }
    
}