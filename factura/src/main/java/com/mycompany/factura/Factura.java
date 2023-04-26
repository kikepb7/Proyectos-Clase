package com.mycompany.factura;

import java.util.Scanner;

public class Factura {

    public static void main(String[] args) {
        
        // Pedimos la base imponible de una factura (100 €), el IVA (21%) y dar el total (121 €)
        // Base imponible: 100 Euros
        // IVA: 21€
        // Total: 121 €
        
        int IVA = 21;
        float bi = 0f;
        float iva = 0f;
        float total = 0f;
        String entradaTeclado = " ";
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el valor de la base imponible: ");
     
        if(sc.hasNextFloat()){
            bi = sc.nextFloat();
        }
        else{
            entradaTeclado = sc.nextLine();
            System.out.println(entradaTeclado + " no es un número.");
        }
        
        System.out.println("Introduzca el IVA: ");
        
        if(sc.hasNextFloat()){
            iva = sc.nextInt();
            System.out.println("La base imponible es de: " + iva);
        }
        else{
            entradaTeclado = sc.nextLine();
            System.out.println(entradaTeclado + " no es un porcentaje.");
        }
        
        total = (bi + (bi * IVA/100));
        
                    System.out.println("BI: " + bi + " euros");
                    System.out.println("IVA: " + iva + " %");
                    System.out.println("Total: " + total + " €");
    }
}