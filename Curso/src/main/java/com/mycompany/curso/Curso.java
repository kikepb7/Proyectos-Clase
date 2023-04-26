package com.mycompany.curso;

public class Curso {

    public static void main(String[] args) {
        
        Alumnos juan = new Alumnos("Juan", "López", 8);
        Alumnos maria = new Alumnos("Maria", "Sánchez", 9);
        Alumnos juana = new Alumnos("Juana", "Ruiz", 8.5);
        
        System.out.println("*********************************************************");
        System.out.println(juan.toString());
        System.out.println(maria.toString());
        System.out.println(juana.toString());
        System.out.println("*********************************************************");
        System.out.println("Número total de alumnos: " + Alumnos.getnAlumnos());
        System.out.println("Media de todos los alumnos: " + Alumnos.getMediaTotal());
        System.out.println("*********************************************************");
    }
}