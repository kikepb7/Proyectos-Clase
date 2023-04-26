package org.example;

import java.util.Collections;

public class Ejemplo {

    int Maximo(int[] numeros, int limiteInferior, int limiteSuperior){
        if(limiteInferior == limiteSuperior) {
            return numeros[limiteInferior];
        }
        else{
            int posicionMedia = (limiteInferior + limiteSuperior)/2;
            int maximoInferiores = Maximo (numeros, limiteInferior, posicionMedia);
            int maximoSuperiores = Maximo (numeros, posicionMedia+1, limiteSuperior);
            return (Math.max(maximoInferiores, maximoSuperiores));
        }
    }


    public static boolean par(int n){
        if(n==0){
            return true;
        }
        else{
            return impar(n-1);
        }
    }

    public static boolean impar(int n){
        if(n==0){
            return false;
        }
        else{
            return par(n-1);
        }
    }
}
