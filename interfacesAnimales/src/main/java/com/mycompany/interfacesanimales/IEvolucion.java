package com.mycompany.interfacesanimales;

/**
 *
 * @author Enrique Palma
 */
public interface IEvolucion {
    
    public void hablar();
    
    public void pensar();
    
    default void crearHerramienta(){
        System.out.println("Usar rama.");
    }
}