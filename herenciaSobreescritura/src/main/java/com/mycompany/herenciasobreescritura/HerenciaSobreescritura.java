package com.mycompany.herenciasobreescritura;

public class HerenciaSobreescritura {

    public static void main(String[] args) {
        
        C obj = new C();
        
        // Acceso desde la misma clase C
        System.out.println("---- Acceso desde exterior ----");
        System.out.println("Campo c2 de C = " + obj.c2);
        System.out.println("Campo c1 de C = " + obj.c1);
        System.out.println("Campo c1 oculto de B = " + ((B)obj).c1);
        System.out.println("Campo c1 oculto de A = " + ((A)obj).c1);
        
        obj.c2 = "azul";
        obj.c1 = 'k';
        
        // Casting
        B obj3 = (B)obj;
        obj.c1='M';
        System.out.println("obj3.c2 --> " + obj3.c2);
        
        
        System.out.println("---- Sobrescritura ----");
        // Acceso desde la misma clase C
        obj.verCampos();
    }
}
