package com.mycompany.ejemplometodos;

public class EjemploMetodos {

    public static void main(String[] args) {
        Saludo s1 = new Saludo(null);
        Saludo s2 = new Saludo("Mario");
        s1.saludar("Luis");
        s2.saludar();
        Utilidades.saludar("Ana");
        s2.comienzoSaludo = "Adiós ";
        s1.saludar("Luis");
        s1.saludar(s2.getNombre());
        Utilidades.saludar("Ana");
    }
}

class Saludo{
    static String comienzoSaludo = "Hola ";
    String nombre;
    Saludo (String nombre){
        this.nombre = nombre;
    }
    void saludar(){
        System.out.println(comienzoSaludo + nombre);
    }
    void saludar(String nombre){
        System.out.println(comienzoSaludo + nombre);
    }
    String getNombre(){
        return nombre;
    }
}

class Utilidades{
    static void saludar(String nombre){
        System.out.println(Saludo.comienzoSaludo + nombre);
    }
}