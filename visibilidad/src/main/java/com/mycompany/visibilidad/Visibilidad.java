package com.mycompany.visibilidad;

public class Visibilidad {

    public static void main(String[] args) {
        
        Persona p = new Persona();
        p.nombre="Enrique";
        p.nif="11111111-A";
        
        Integer valor = 9;
        String c = "Hola";
        
        prueba(valor);
        prueba(c);
        prueba(p);

        
        System.out.println(p.nombre);
        System.out.println(p.nif);
        System.out.println(valor);
        System.out.println(c);
        System.out.println(p);
    }
    
    static void prueba(Integer num){
        num = 14;
    }
    
    static void prueba(String c){
        c = "Adios";
    }
    
    static void prueba (Persona par){
        par.nombre="Jose";
        par.nif="22222222-B";
        }
}