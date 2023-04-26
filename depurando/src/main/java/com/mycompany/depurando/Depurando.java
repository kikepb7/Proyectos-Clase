package com.mycompany.depurando;

public class Depurando {

    public static void main(String[] args) {
        
        int resultado = 0;
        // Primer bucle recorre 50 veces
        for(int i=0; i<100; i=i+2){
            // Segundo bucle recorre 16 veces
            for(int j=50; j>1; j=j-3){
                int k=1;
                while(k<=40){
                    k++;
                    resultado = i * j * k;
                }
            }
        }
    }
}