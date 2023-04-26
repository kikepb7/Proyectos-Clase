package com.mycompany.tablas_multi;

import java.util.Scanner;

public class Tablas_multi{
    public static void main(String[] args){
        int n = obtenerNumero();
        dibujarTabla(n);
    }
        
        /**
         * obtiene por pantalla un numero entero, entre 1-10
         * @return entero entre 1 y 10
         */
        public static int obtenerNumero()
        {   
            Scanner sc = new Scanner(System.in);
        int n;
        
        do{
            System.out.println("Introduzca un numero entre 1 y 10:");
                if (sc.hasNextInt())
                {
                try {
                        n= sc.nextInt();
                        if (n>=1 && n<=10) return n;//return n para salirse ya y no seguir
                        }
                        catch (Exception ex)
                        {
                            System.out.println(ex.getMessage());
                        }
                    }
                    else 
                    {
                        System.out.println("Introduzca un número entero");
                        sc.next();
                    }
                }while (true);
        }
        
        /**
         * Dibuja la tabla de multiplicar de n
         * @param n número entero para la tabla
         */
        
        public static void dibujarTabla(int n)
        {
            for(int i=0; i<=10; i++)
            {
                System.out.println(n + " x " + i +" = " + (n*i));
            }
        }
    }
        
