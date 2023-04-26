package com.mycompany.examenentornosjunit;

public class Nif {
    
   public static char calcularLetraNIF(int numeroNIF) {
       if(numeroNIF > 99999999){
            throw new IllegalArgumentException("No se puede calcular la letra de números superiores a 8 cifras.");
        }
       
        String letrasNIF = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = numeroNIF % 23;
        char letraNIF = letrasNIF.charAt(resto);
        return letraNIF;
   }
}