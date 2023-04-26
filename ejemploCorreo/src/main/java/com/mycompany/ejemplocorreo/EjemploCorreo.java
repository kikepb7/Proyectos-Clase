package com.mycompany.ejemplocorreo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EjemploCorreo {

    public static void main(String[] args) {
        
        // Pedir un correo y comprobarlo
        
        String regExCorreo = "[a-zA-Z0-9 +&*-]+(?:\\.[a-zA-Z0-9 +&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}";
        
        System.out.println("Introduzca su email: ");
        Scanner sc = new Scanner (System.in);
        String correo = sc.next();
  
        // Comprobar expresión regular con correo
        boolean esCorreo = Pattern.matches(regExCorreo, correo);
        
        if(esCorreo){
            System.out.println("Correo registrado");
        }
        else{
            System.out.println("Correo inválido");
        }
        
        
        // Comprobar expresión regular con correo MÁS COMPACTO
        if(Pattern.matches(regExCorreo, correo)){
            System.out.println("Correo registrado");
        }
        else{
            System.out.println("Correo inválido");
        }
    }
}