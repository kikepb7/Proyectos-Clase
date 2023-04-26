package com.mycompany.sobreescriturametodosoverride;

public class SobreescrituraMetodosOverride {

    public static void main(String[] args) {
        
        C obj = new C();

        //Acceso desde la misma clase C
        System.out.println("---- Acceso desde la misma clase C ----");
        obj.verCampos();
       
        C obj2 = new C();
        obj2.metodoA();
        obj2.metodoB();
        obj2.metodoC();
        System.out.println("-------------------");
        obj2.metodoSobrescrito1();
        ((B)obj2).metodoSobrescrito1();
        ((A)obj2).metodoSobrescrito1();
        System.out.println("-------------------");
        obj.metodoSobrescrito2();
        
        System.out.println("-------------------");
        B obj4 = (B)obj2;
        obj4.metodoSobrescrito1();
    }
}