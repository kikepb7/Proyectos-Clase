package com.mycompany.ejemplo_junit3;


/**
 *
 * @author Enrique Palma
 */
public class Cadenas {
    
    String cadena = "Hola";
    String invertida = "";
    
    // Creamos un método para invertir una cadena de caracteres
    String invertir(String cadena){
        for(int i=cadena.length()-1; i>=0; i--){
            invertida += cadena.charAt(i);
        }
        return invertida;
    } 
    
    // Creamos un método para que a una cadena de caracteres se le suma un número y cambia de caracter
    public String suma (String cadena){
        String resultado = "";
        for(int i=0; i<cadena.length(); i++){
            char letra = cadena.charAt(i);
            int c = letra;
            c++;
            resultado += (char)c;
        }
        return resultado;
    }  
  
    
    
}


/**
 *  MÉTODO SUMA: RESULTADO CLASE
 * 
 *  String suma(String cadena){
 *      int acumulado = 0;
 *      String resultado = "";
 * 
 *      for(int i=0; i<cadena.length(); i++){
 *      acumulado = cadena.charAt(i) + 1;
 *      resultado = resultado + (char) acumulado;
 * 
 *      //resultado = resultado + (char) (cadena.charAt(i) + 1);
 *      }
 * 
 *      return resultado;
 *   }
 */