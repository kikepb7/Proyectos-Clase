package com.mycompany.abstracto;

abstract class SubclaseAbstracta extends ClaseAbstracta{}
    
    class Subclase extends ClaseAbstracta {
        
        @Override
        public void metodoAbstracto(){
            System.out.println("Implementando método abstracto");
        }
    }