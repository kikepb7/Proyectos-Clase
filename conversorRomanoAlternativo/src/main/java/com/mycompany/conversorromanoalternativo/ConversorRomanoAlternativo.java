package com.mycompany.conversorromanoalternativo;

public class ConversorRomanoAlternativo {

    public static void main(String[] args) {

        Conversor cv = new Conversor();
        SolucionClase c1 = new SolucionClase();
        
        System.out.println(cv.roman2dec("cmxcix"));
        System.out.println(cv.dec2roman(550));
        

        System.out.println(c1.romanoADecimal("CMXCIX"));
    }
}
