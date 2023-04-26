package com.mycompany.herencia;

public class Herencia {

    public static void main(String[] args) {
        
        C obj1 = new C();
        System.out.println("--------------------");
        C obj2 = new C("Mensaje");
        System.out.println("--------------------");
        C obj3 = new C(1234);
        System.out.println("--------------------");
    }
}