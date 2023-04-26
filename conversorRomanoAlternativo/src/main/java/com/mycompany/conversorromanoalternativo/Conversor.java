package com.mycompany.conversorromanoalternativo;

public class Conversor {
    
    public static int roman2dec(String romano){
        
        // Inicializamos el valor decimal en 0
        int decimal = 0;
        
        // Pasamos todo carácter introducido a mayúsculas
        String numeroRomano = romano.toUpperCase();
        
        // Recorremos la cadena de caracteres introducida
        for(int i=0; i<numeroRomano.length(); i++){
                char convertirADecimal = numeroRomano.charAt(i);
                
                // Mostramos las diferentes posibilidades
                switch(convertirADecimal){
                    case 'M' -> decimal += 1000;
                    case 'D' -> decimal += 500;
                    case 'C' -> decimal += 100;
                    case 'L' -> decimal += 50;
                    case 'X' -> decimal += 10;
                    case 'V' -> decimal += 5;
                    case 'I' -> decimal += 1;
                }
        }
        
        if(numeroRomano.contains("IV")){
            decimal -= 2;
        }
        if(numeroRomano.contains("IX")){
            decimal -= 2;
        }
        if(numeroRomano.contains("XL")){
            decimal -= 20;
        }
        if(numeroRomano.contains("XC")){
            decimal -=20;
        }
        if(numeroRomano.contains("CD")){
            decimal -= 200;
        }
        if(numeroRomano.contains("CM")){
            decimal -= 200;
        }
        return decimal;
    } 
    
    
    
    public static String dec2roman(int decimal){
        int i, miles, centenas, decenas, unidades;
        String numeroRomano = "";
        
        miles = decimal / 1000;
        centenas = decimal /100 % 10;
        decenas = decimal /10 % 10;
        unidades = decimal % 10;
        
        for(i=1; i<=miles; i++){
            numeroRomano += "M";
        }
        
        if(centenas == 9){
            numeroRomano += "CM";
        }
        else if(centenas >= 5){
            numeroRomano += "D";
            for(i=6; i<=centenas; i++){
                numeroRomano += "C";
            }
        }
        else if(centenas == 4){
            numeroRomano += "CD";
        }
        else{
            for(i=1; i<=centenas; i++){
                numeroRomano += "C";
            }
        }
        
        if(decenas == 9){
            numeroRomano += "XC";
        }
        else if(decenas >= 5){
            numeroRomano += "L";
            for(i=6; i<=decenas; i++){
                numeroRomano += "X";
            }
        }
        else if(decenas == 4){
            numeroRomano += "XL";
        }
        else{
            for(i=1; i<=decenas; i++){
                numeroRomano += "X";
            }
        }
        
        if(unidades == 9){
            numeroRomano += "IX";
        }
        else if(unidades >= 5){
            numeroRomano += "V";
            for(i=6; i<=unidades; i++){
                numeroRomano += "I";
            }
        }
        else if(unidades == 4){
            numeroRomano += "IV";
        }
        else{
            for(i=1; i<=unidades; i++){
                numeroRomano += "I";
            }
        }
        return numeroRomano;
    }   
}


// 3125 -> MMMCXXV

/* SOLUCIÓN MATIAS

public String decimalToRoman(int numero){


    int m = (numero / 1000) % 10;
    int c = (numero / 100) % 10;
    int d = (numero / 10) % 10;
    int u = numero % 10;
    String total = "";
    if (m > 3) return "No se puede convertir";
    switch (m) {
        case 1 -> total = total + "M";
        case 2 -> total = total + "MM";
        case 3 -> total = total + "MMM";
    }
    switch (c) {
        case 1 -> total = total + "C";
        case 2 -> total = total + "CC";
        case 3 -> total = total + "CCC";
        case 4 -> total = total + "CD";
        case 5 -> total = total + "D";
        case 6 -> total = total + "DC";
        case 7 -> total = total + "DCC";
        case 8 -> total = total + "DCCC";
        case 9 -> total = total + "CM";
    }
    switch (d) {
        case 1 -> total = total + "X";
        case 2 -> total = total + "XX";
        case 3 -> total = total + "XXX";
        case 4 -> total = total + "XL";
        case 5 -> total = total + "L";
        case 6 -> total = total + "LX";
        case 7 -> total = total + "LXX";
        case 8 -> total = total + "LXXX";
        case 9 -> total = total + "XC";
    }
    switch (u) {
        case 1 -> total = total + "I";
        case 2 -> total = total + "II";
        case 3 -> total = total + "III";
        case 4 -> total = total + "IV";
        case 5 -> total = total + "V";
        case 6 -> total = total + "VI";
        case 7 -> total = total + "VII";
        case 8 -> total = total + "VIII";
        case 9 -> total = total + "IX";
    }
    return total;
}
*/

/* SOLUCIÓN CON ARRAY

public static String decimalToRomano(int decimal) {
    String roman = "";
    int[] decimalV = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] numeroRomano = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    for (int i = 0; i < decimalV.length; i++) {
        while (decimal >= decimalV[i]) {
            decimal -= decimalV[i];
            roman += numeroRomano[i];
        }
    }
    return roman;
}
*/



/* SOLUCIÓN PROFESOR

import java.util.TreeMap;

public class RomanNumber {
    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();
    static {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    public final static String toRoman(int number) {
        int l =  map.floorKey(number);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number-l);
    }
}
*/







/**
 * String nombre = "Enrique";
 * char resultado = nombre.charAt(0);
 * System.out.println(resultado);
 */