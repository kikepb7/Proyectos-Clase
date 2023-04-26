package com.mycompany.sobreescriturametodosoverride;

public class C extends B{

    char c1 = 'z';
    void verCampos()
    {
        System.out.println("---Acceso desde clase C---");
        System.out.println("Campo c2 de C = " + c2);
        System.out.println("Campo c1 de C = " + c1);
        System.out.println("Campo c1 de C = " + this.c1);
        System.out.println("Campo c1 oculto de B = " + super.c1);
        System.out.println("Campo c1 oculto de B = " + ((B)this).c1);
        System.out.println("Campo c1 oculto de A = " + ((A)this).c1);
    }
    
    public void metodoC(){
        System.out.println("metodoC en C");
    }
    
    @Override
    public void metodoSobrescrito1(){
        System.out.println("metodoSobrescrito1 en C");
    }
    
    @Override
    public void metodoSobrescrito2(){
        super.metodoSobrescrito2();
    }
}
