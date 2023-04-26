package com.mycompany.wrapper;

public class Wrapper {

    public static void main(String[] args) {
        
        // Ejemplos de wrapper
        Integer i = 8;
        Float f = 5.6995f;
        String s = "7";
        
        //Pasar un valor String a int
        System.out.println(Integer.parseInt("10"));
        System.out.println(f.intValue());
        System.out.println(Integer.valueOf(s));
        
        
        // Ejemplos de autoboxing y unboxing
        //
        // Integer a = 11, b = 20;     (Autoboxing)
        // int c = b - a;                 (Unboxing)
        
        
        int n = 9;
        Integer convertido = 0;
        
        convertido = n;
        convertido = Integer.valueOf(s);
        
        // (?) Compara que una variable cumpla una condición y cuando se comprueba se imprime por pantalla
        System.out.println((n>10)?"Es mayor de 10":"Es menor de 10");
        
        
        /* Incremento y decremento
        
         int a = 8;
         
         System.out.println(a++);
         System.out.println(++a);
         System.out.println("Valor final de a: " + a);
        */
        
        
       /* Te convierte el número en binario y añade dos ceros para después convertir el número
    
        int c = 9 << 2;
        System.out.println(c);
       */
        
       }
}