package com.mycompany.academia;

public class Academia {
    
    public static void main(String[] args){
        
    Alumno a1 = new Alumno("Carlos", "López", 5, 8, 7);
    
    Alumno a2 = new Alumno("María", "Ruiz", 7, 7, 7);
    
    System.out.println("La nota media de Carlos es de: " +a1.notaMedia());
    System.out.println("La nota media de María es de: " +a2.notaMedia());

    }   
}