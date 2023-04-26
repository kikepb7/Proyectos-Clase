package com.mycompany.facturaprofesor;

import java.util.Scanner;

public class FacturaProfesor {

    public static void main(String[] args) {
        
        // EJEMPLO PROFESOR
        //
        // Pedimos la base imponible de una factura (100 €), el IVA (21%) y dar el total (121 €)
        // Base imponible: 100 Euros
        // IVA: 21€
        // Total: 121 €
        
        Scanner sc = new Scanner(System.in);
        float bi = 0;
        int iva = 0;
        
        System.out.println("Introduzca BI");
        if(sc.hasNextFloat()){
            bi = sc.nextFloat();
            
            System.out.println("Introduzca IVA");
            if(sc.hasNextInt()){
                iva = sc.nextInt();
                
                float total = bi+(bi*iva/100);
                System.out.println("BI: " + bi);
                System.out.println("IVA: " + iva);
                System.out.println("Total: " + total);
            }
            else System.out.println("El IVA debe ser int"); 
        }
        else System.out.println("BI debe ser float"); 
    }
}   