package com.mycompany.bucles;

public class Bucles {

    public static void main(String[] args) {

       int i=0;
       int suma=0;
       // Bucle que muestra los números desde el 0 hasta el 10
       // 
       // for(int i=0; i<=10; i++){
       //     System.out.println(i);
       // }
        
       
       // Bucle que suma los números desde el 0 hasta el 10
       //
       // for(i=0; i<=10; i++){
       //     suma = suma + i;
       //     System.out.println(suma);
       // }  
       
       
       // Bucle que muestra el valor final de i y el valor de la suma
       
      // for (i=0; i<=10; i++){
      //     System.out.println(i);
      //     suma = suma + i;
      // }
          
      //     System.out.println("Valor final de i: " + i);
      //     System.out.println("Valor de la suma: " + suma);
      
      
      for (i=1; i<10; i=i+3){
           System.out.println(i);
           suma = suma + i;
      }
       System.out.println("Valor final de i: " + i);
       System.out.println("Valor de la suma: " + suma);
    }
}