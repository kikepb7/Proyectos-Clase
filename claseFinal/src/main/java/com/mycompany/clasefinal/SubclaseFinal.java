package com.mycompany.clasefinal;

public class SubclaseFinal extends Clase_Final{

    final double PI = 3.14;
    
    
    // Sobreescritura
    @Override
    public void metodoEjemplo(){
        //super.metodoEjemplo();
        System.out.println("En subclase final " 
                    + this.cad);
        
        super.metodoEjemplo();
    }
    
    
    // Sobrecarga
    public void metodoFinal2(String cadena){
        
        System.out.println("Sobrecargado: " + cadena);
    }
}