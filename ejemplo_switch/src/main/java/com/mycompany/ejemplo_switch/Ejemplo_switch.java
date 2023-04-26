package com.mycompany.ejemplo_switch;

import java.util.Scanner;

public class Ejemplo_switch {

    public static void main(String[] args) {
        
        ; // 1-L, 2-M, 3-X, 4-J, 5-V
        
        System.out.println("--------------------");
        System.out.println("* CONTADOR DE DÍAS *");
        System.out.println("--------------------");
        System.out.println(" ");
        System.out.println("Introduzca el día de la semana: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        
        switch (day){
            case 1: System.out.println("Lunes");
                break;
            case 2: System.out.println("Martes");
                break;
            case 3: System.out.println("Miércoles");
                break;
            case 4: System.out.println("Jueves");
                break;
            case 5: System.out.println("Viernes");
                break;
            case 6, 7: System.out.println("Fin de semana");
                break;
            default: System.out.println("No existen más de 7 días en la semana");
                break;
        }
        
        
        /*
        switch(animal){
            case "perro":
                sout ("guau");
                orisquear();
                break;
            case "gato montes":
                enElCampo();
            case "gato":
                sout ("miau");
                ronronear();
                break;
            default:
                sout("desconocido");
                break;
        }
        */   
    }
}