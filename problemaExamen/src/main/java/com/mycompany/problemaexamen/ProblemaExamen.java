package com.mycompany.problemaexamen;

public class ProblemaExamen {

    public static void main(String[] args) {
        
        /*
        int i = 0;
        do{
            System.out.println(++i);
        }while(i<11);
        
        
        System.out.println("******************************");
        
        int i=0;
        for(i=0; i<=10; i=i+2){
            System.out.println(i);
        }
        
        System.out.println("******************************");
        
        for(int j=10; j>0; j=j-3){
        System.out.println(j);
        }
        
        System.out.println("******************************");
       /*
        
        int k=0;
        do{
            k=k+1;
            System.out.println(k);
        }while(k<=10);
        
        
        System.out.println("******************************");
        
        int i=10;
        while(i>0){
            System.out.println(i);
            i=i-3;
        }
        
        
        System.out.println("******************************");
        
        int i = 10;
        while(i>0){
            i=i-3;
            System.out.println(i);
        }
       
        
        System.out.println("******************************");
        
      while(true){
          System.out.println("Dentro del bucle 1");
          while(true){
              System.out.println("Dentro del bucle 2");
              continue;
          }
      }
      
        System.out.println("******************************");
        
        for(int j=1; j<=3; j++){
            System.out.println("Iteración " + j);
            if(j<3) continue;
            System.out.println("Saliendo del bucle");
            }
        System.out.println("Fuera del bucle");
        }
       
        
        A: while (true){
            System.out.println("Dentro de A");
            B: while(true){
                System.out.println("Dentro de B");
                break A;
            }
        }
        C: while(true){
            System.out.println("Dentro de C");
            D: while(true){
                System.out.println("Dentro de D");
                continue C;
            }
        }
        */
        
        
        /*
        Mostrar el cuadrado de los 20 primeros números (USANDO BREAK O CONTINUE)
        Excepto los números 3 y 7
        Deberemos mostrar: 
            1 x 1 = 1
            2 x 2 = 4
            4 x 4 = 16
            .
            .  
            .
        */
        
        System.out.println("*************************************");
        System.out.println("MOSTRAR CUADRADOS POR PANTALLA");
        System.out.println("*************************************");
        System.out.println();
        
        // Usando un For
        System.out.println("Usando un bucle FOR: ");
        for(int i = 0; i<=20; i++){
            if(i==3 || i==7){
                continue;
            }
            else{
            System.out.println(i + " x " + i + " = " + (i*i));
            }
        }
        
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("");
        
        // Usando un While
        System.out.println("Usando un bucle WHILE: ");
        int i=0;
        while(i<20){
            i++;
            if(i==3 || i==7){
                continue;
            }
            System.out.println(i + " x " + i + " = " + (i*i));
        }
    }
}