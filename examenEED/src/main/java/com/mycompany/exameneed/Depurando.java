/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exameneed;

/**
 *
 * @author Enrique Palma Bullejos
 * @version 1.0
 * @since 05/12/2022
 */
public class Depurando {

    
     public static void main(String[] args) {

        

        for(int i=0;i<100;i = i +2)

        {

            for(int j=50;j>1;j = j - 3)

            {

                int k=1;

                int l = 3;

                while (k<=20)

                {

                    k++;

                    l = l*k;

                    calculando(i, j, l);

                }

                    

            }

        }

        

            

    }

    

    public static void calculando(int i, int j, int l)

    {

        int resultado = i * j * (l - 3) /10 ;

        

    }

}