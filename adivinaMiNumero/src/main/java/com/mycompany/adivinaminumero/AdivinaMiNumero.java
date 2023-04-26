package com.mycompany.adivinaminumero;

import java.util.Random;
import java.util.Scanner;

public class AdivinaMiNumero {

    public static void main(String[] args) {
        
        /*
            Pedimos un número por pantalla
            Hasta que no introduzcamos el número correcto no acabará el programa
            Cuando introducimos el número correcto: "¡Has adivinado el número!"
            Cuando no introducimos el número correcto: "¡Inténtalo de nuevo!"
        */
        
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int secret = 4;
        
        System.out.println("---------------------");
        System.out.println(" Introduce un número: ");
        System.out.println("---------------------");
        System.out.println(" ");
        
        do{
            if(sc.hasNextInt()){
                number = sc.nextInt();
                if(number == secret){
                    System.out.println("¡Has acertado!");
                }
                else{
                    System.out.println("¡Sigue intentándolo!");
                }
            }
        }while(number!=secret);
     }
}

/*
int numero = -1;
Random random = new Random();
int secreto = random.nextInt(9)+1;
int secreto2 = (int)(Math.random()*9) + 1;

do{
System.out.printlnl("Introduce un número: ");
Scanner sc = new Scanner(System.in);
if(sc.hasNextInt()){
                number = sc.nextInt();
                if(number == secret){
                    System.out.println("¡Has acertado!");
                }
                else{
                    System.out.println("¡Sigue intentándolo!");
                }
            }
        }while(number!=secret);
     }
*/