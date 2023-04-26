package com.mycompany.herencia;

public class B extends A{
    
    B(){
        System.out.println("En constructor B");
    }
    
    public B(String mensaje){
        System.out.println("B: " + mensaje);
    }
    
    public B(int numero){
        super(numero);
        System.out.println("B: " + numero);
    }
}