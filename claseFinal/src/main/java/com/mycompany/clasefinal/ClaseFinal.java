package com.mycompany.clasefinal;

public class ClaseFinal {

    public static void main(String[] args) {

        Clase_Final cf = new Clase_Final();
        
        cf.cad = "Hola";
        cf.metodoEjemplo();
        cf.metodoFinal();
        
        
        SubclaseFinal scf = new SubclaseFinal();
        
        scf.cad = "Hola";
        scf.metodoEjemplo();
        scf.metodoFinal();
    }
}