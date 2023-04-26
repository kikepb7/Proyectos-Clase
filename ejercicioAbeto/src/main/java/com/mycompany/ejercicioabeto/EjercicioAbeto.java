package com.mycompany.ejercicioabeto;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioAbeto {

    public static void main(String[] args) {
        
        int n = obtenerNumero();
        
        for(int i=1; i<n+(n/2); i++){
            for(int j=n+(n/2); j>i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=1; i<n-(n/2); i++){
            for(int j=n+(n/2); j>1; j--)
            {
                System.out.print(" ");}
            for(int k=n/2; k<=(n/2)+1; k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    
    
    public static int obtenerNumero(){
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Indique un numero entre 1 y 10: ");
            n = sc.nextInt();
        }while(n<1 || n>10);
        return n;
    }
}
