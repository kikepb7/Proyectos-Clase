package com.mycompany.decimalesyromanos;

public class DecimalesYRomanos {

    public static void main(String[] args) {


    }
    
    public class RomanNumeral{
        
        private static final int[] valores_decimales = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        private static final String[] valores_romanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        
        public static int roman2dec(String numeroRomano){
            int numeroDecimal = 0;
            int i = 0;
            for(int j=0; j<valores_romanos.length; j++){
                while(numeroRomano.startsWith(valores_romanos[j], i)){
                    numeroDecimal += valores_decimales[j];
                    i += valores_romanos[j].length();
                }
            }
            return numeroDecimal;
        }
        
        
        public static String dec2roman(int numeroDecimal){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<valores_decimales.length; i++){
                while(numeroDecimal >= valores_decimales[i]){
                    sb.append(valores_romanos[i]);
                    numeroDecimal -= valores_decimales[i];
                }
            }
            return sb.toString();
        }
    }
}