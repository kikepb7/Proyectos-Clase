package com.mycompany.sobreescriturametodosoverride;

public class B extends A{
    
    int c1 = 1;
   
    public void metodoB()
    {
        System.out.println("metodoB en B");
    }
   
    @Override
    public void metodoSobrescrito1()
    {
        System.out.println("metodoSobrescrito1 en B");
    }
   
    @Override
    public void metodoSobrescrito2()
    {
        super.metodoSobrescrito2();
    }
}
