package com.mycompany.herencia;

public class A {
    
    private int campo1;
    private int campo2;
    
    A(){
        System.out.println("En constructor A");
    }
    
    public A(String mensaje){
        System.out.println("A: " + mensaje);
    }
    
    public A(int numero){
        System.out.println("A: " + numero);
    }
}