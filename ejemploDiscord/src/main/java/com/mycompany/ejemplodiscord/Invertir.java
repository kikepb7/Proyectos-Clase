package com.mycompany.ejemplodiscord;

public class Invertir {
    
    String[] frutas;

    public Invertir(){
        
    }
    
    public Invertir(String[] frutas) {
        this.frutas = frutas;
    }

    
    // Array esperado: String[] frutas = {"piña", "kiwi", "plátano", "pera"}
    
    public String[] invertirParte(String[] frutas) {

        String v1 = frutas[1]; // Creamos una variable para guardar "pera"
        
        frutas[1] = frutas[frutas.length -1]; // Intercambiamos "pera" por "kiwi"  //frutas[1] = frutas[3]
        
        frutas[frutas.length -1] = v1; // Intercambiamos "kiwi" por "pera" (guardada en la variable v1)
        
        return frutas; // Mostramos el array modificado
    }

    public String[] getFrutas() {
        return frutas;
    }

    public void setFrutas(String[] frutas) {
        this.frutas = frutas;
    }
    
    
    
    
}
