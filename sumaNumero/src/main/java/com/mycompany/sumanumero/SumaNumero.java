package com.mycompany.sumanumero;

public class SumaNumero {

    public static void main(String[] args) {
        /*
        Paso por parámetros 8 7 y 6
        La suma es 21
        */
        
        System.out.println("-----------------");
        System.out.println("* SUMAR NÚMEROS *");
        System.out.println("-----------------");
        System.out.println(" ");
        
        int suma = 0;
        int numeroActual = 0;
        
        String n1 = args[0];
        String n2 = args[1];
        String n3 = args[2];
        
        // Pasar parámetros del array a enteros para poder sumarlos
        int nn1 = Integer.parseInt(n1);
        int nn2 = Integer.parseInt(n2);
        int nn3 = Integer.parseInt(n3);
        
        //int n1 = Integer.parseInt(args[0]);
        //int n2 = Integer.parseInt(args[1]);
        //int n3 = Integer.parseInt(args[2]);
        
        System.out.println("Voy a sumar " + nn1 + ", " +  nn2 + " y " +  nn3);
        System.out.println("La suma es " + (nn1 + nn2 + nn3));
        System.out.println("***********************");
        
        // Haremos la suma usando un bucle for para el array args[]
        for(int i=0; i<args.length; i++){
            //suma = suma + Integer.parseInt(args[i]);
            suma += Integer.parseInt(args[i]);       
        }
        System.out.println("La suma es " + suma);
    }
}