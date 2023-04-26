package com.mycompany.passwordsecreta2;

import java.util.Scanner;

public class PasswordSecreta2 {

    public static void main(String[] args) {
        
        String password = "secreta";
        int i = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("***********");
        System.out.println("CONTRASEÑA");
        System.out.println("***********");
        System.out.println("");
        System.out.println("Introduzca la contraseña: ");
        String intento = sc.nextLine();
        
        do{
            if(intento.equals(password)){
                System.out.println("Clave correcta");
            break;
            }
            
            System.out.println("Clave incorrecta, por favor inténtelo de nuevo:");
            intento = sc.nextLine();
            i++;

            if(intento.equals(password)){
                    System.out.println("Clave correcta");
                    break;
            }
            else if(i==2){
                    System.out.println("Has agotado los intentos");
                }
        }while(!intento.equals(password) && i<2);
    }
}