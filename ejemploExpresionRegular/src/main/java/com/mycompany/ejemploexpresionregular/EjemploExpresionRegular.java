package com.mycompany.ejemploexpresionregular;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EjemploExpresionRegular {

    public static void main(String[] args) {
        
        // Pedir nombre y teléfono (validar teléfono)
        // Dar por pantalla:
        // Datos del usuario: Carlos Pérez
        //                      615401030
        // Si el teléfono no lo valida, ponemos N/A
        
        Scanner sc = new Scanner (System.in, "ISO-8859-1");
        String regExPhone= "[6|7|9][0-9]{8}";
        
        
        System.out.println("Introduzca su nombre y apellidos: ");
        String name = sc.nextLine();
        
        System.out.println("Introduzca su teléfono: ");
        String phone = sc.next();
        
        
        if(Pattern.matches(regExPhone, phone)){
                 System.out.println(name);
                 System.out.println(phone);
        }
        else{
            System.out.println(name);
            System.out.println("N/A");
        }    
    }
}