package com.mycompany.herencia;

public class C extends B{
    
    C(){
        System.out.println("En constructor C");
    }
    
    public C(String mensaje){
        super(mensaje);
        System.out.println("C: " + mensaje);
    }
    
    public C(int numero){
        super(numero);
        System.out.println("C: " + numero);
    }
    
    
}
