package com.mycompany.facturaejemplodavid;

import java.util.Scanner;

public class FacturaEjemploDavid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double baseImponible = 0;
        double iva = 0;
        double neto;
        System.out.println("\n");
        System.out.println("*******************************************************************");
        System.out.println("************ Bienvenido a la calculadora de valor neto ************");
        System.out.println("*******************************************************************");
        System.out.println("\n");
        while (baseImponible == 0) {
            System.out.println("Ingrese el monto de base imponible:");
            String baseImponibleStr = scanner.nextLine();
            try {
                baseImponible = Double.parseDouble(baseImponibleStr);
            } catch (NumberFormatException e) {
                System.out.println("Base imponible ingresada no es un valor valido.");
            }
            System.out.println("\n");
        }
        while (iva == 0) {
            System.out.println("Ingrese el % del IVA:");
            String ivaStr = scanner.nextLine();
            try {
                iva = Double.parseDouble(ivaStr);
            } catch (NumberFormatException e) {
                System.out.println("IVA ingresado no es un valor correcto.");
            }
            System.out.println("\n");
        }
        scanner.close();
        double ivaMultiplier = (iva / 100) + 1;
        neto = baseImponible * ivaMultiplier;
        System.out.println("*******************************************");
        System.out.println("* Base Imponible: " + baseImponible + " €");
        System.out.println("* Iva           :  " + iva + " %");
        System.out.println("* Total         : " + neto + " €");
        System.out.println("*******************************************");
    }
}