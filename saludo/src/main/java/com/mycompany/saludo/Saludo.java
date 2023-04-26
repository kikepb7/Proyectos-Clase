package com.mycompany.saludo;
import java.util.Scanner;

public class Saludo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduzca su nombre: ");
        String name = scanner.nextLine();
                System.out.println("Hola " + name);
        
        System.out.print("¿Cómo se llama el profesor?");
        String name2 = scanner.nextLine();
                System.out.println("El profesor se llama: " + name2);
      }
}