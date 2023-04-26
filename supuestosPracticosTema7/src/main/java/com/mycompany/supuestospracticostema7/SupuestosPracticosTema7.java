package com.mycompany.supuestospracticostema7;

public class SupuestosPracticosTema7 {

    public static void main(String[] args) {

        // Instancia de la clase Animal
        Animal foca = new Animal();
        
        // Introducir los campos de la instancia Animal
        foca.setNombreCientifico("Phocidae");
        foca.setNombreComun("Foca");
        foca.setAltura(1.50);
        foca.setPeso(60);
        
        // Imprime los datos de la instancia
        System.out.println(foca.toString());
        
        
        System.out.println("");
        System.out.println("*****************************");
        System.out.println("");
        
        
        // Instancia de la clase Vegetal
        Vegetal limonero = new Vegetal();
        
        // Introducir los campos de la instancia Vegetal
        limonero.setNombreComun("Limonero");
        limonero.setNombreCientifico("Citrus limon");
        limonero.setAltura(1.80);
        
        // Imprime los datos de la instancia
        System.out.println(limonero.toString());
    }
}