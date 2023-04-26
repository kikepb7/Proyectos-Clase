package com.mycompany.passwordsecreta;

import java.util.Scanner;

public class PasswordSecreta {

    public static void main(String[] args) {
        
        /*
        Pedimos por pantalla una contraseña "secreta"
        Tenemos 3 intentos
        Si acertamos --> Clave correcta
        Si no acertamos --> Clave incorrecta
        Después de 3 intentos --> Has agotado los intentos
        */

        int i = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("***********");
        System.out.println("CONTRASEÑA");
        System.out.println("***********");
        System.out.println("");
        
        // Pedimos por pantalla definir una contraseña
        System.out.println("Defina la contraseña: ");
        String password = sc.nextLine();
        // Pedimos por pantalla que el usuario introduzca la contraseña
        System.out.println("Introduzca la contraseña: ");
        // Creamos variable intento
        String intento = sc.nextLine();
        
        /* 
        Si el intento que hemos introducido coincide con la contraseña que asignamos al principio, el programa
        mostrará por pantalla "Clave correcta" y el programa finalizará
        */
        if(intento.equals(password)){
            System.out.println("Clave correcta");
        }
        /*
        En caso de que el intento no coincida con la contraseña, el programa entrará en otra fase para porporcionar
        3 intentos
        */
        else{
            /* 
            Mientras el intento sea diferente a la contraseña y a su vez no superemos 3 intentos, el programa
            seguirá pidiendo la contraseña, gastando a su vez un intento (indicamos i<2 ya que contamos un intento desde 0)
            */
            while(!intento.equals(password) && i<2){
                i++;
                System.out.println("Clave incorrecta, por favor inténtelo de nuevo:");
                intento = sc.nextLine();
                /*
                Si el intento coincide con la contraseña, el programa mostrará por pantalla "Clave correcta" y el
                programa finalizará
                */
                if(intento.equals(password)){
                    System.out.println("Clave correcta");
                    break;
                }
                /*
                Si hemos gastado todos los intentos (en este caso 3) el programa nos mostrará por pantalla
                "Has agotado los intentos", finalizandose a continuación
                */
                else if(i==2){
                    System.out.println("Has agotado los intentos");
                }
            }
        }
    }
}