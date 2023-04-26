package com.mycompany.conversorromanoalternativo;

public class SolucionClase {
    /**
     * Convierte letra romana en número
     * @param c
     * @return 
     */
    
    int valorDecimal(char c){
        return switch (c)
        {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
    
    int romanoADecimal(String numeroRomano){
        
        int actual;
        int anterior;
        int resultado = 0;
        
        for(int i=0; i<numeroRomano.length(); i++){

            if(i>0){
                anterior = valorDecimal(numeroRomano.charAt(i-1));
            }
            else{
                anterior = 0;
            }
            actual = valorDecimal(numeroRomano.charAt(i));
            
            if(actual > anterior){
                resultado = actual - anterior*2;
            }
            else{
                resultado = actual + anterior;
            }
        }
        return resultado;
    }
}