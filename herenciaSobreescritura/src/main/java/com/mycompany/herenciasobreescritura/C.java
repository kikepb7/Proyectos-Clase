package com.mycompany.herenciasobreescritura;

public class C extends B{
    
    // Campo de la clase C
    char c1 = 'Z';
    
    // Método de la clase C
    void verCampos(){
        System.out.println("---- Acceso desde clase C ----");
        System.out.println("Campo c2 de C = " + c2);
        System.out.println("Campo c1 de C = " + c1);
        System.out.println("Campo c1 de C = " + this.c1);
        System.out.println("Campo c1 oculto de B = " + super.c1);
        System.out.println("Campo c1 oculto de B = " + ((B)this).c1);
        System.out.println("Campo c1 oculto de A = " + ((A)this).c1);
    }
}
