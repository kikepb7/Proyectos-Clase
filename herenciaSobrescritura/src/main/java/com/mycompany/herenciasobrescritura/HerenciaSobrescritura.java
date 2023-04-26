package com.mycompany.herenciasobrescritura;

public class HerenciaSobrescritura {

    public static void main(String[] args) {
        
        System.out.println("----Sobrescritura------");        //Acceso desde la misma clase C
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
    }
}
