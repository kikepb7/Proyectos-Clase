package org.example;

/*
   Las clases genéricas se utilizan para crear código reutilizable y flexible
   que puede manejar diferentes tipos de datos
 */

public class ClaseGenerica <T> { // Declaramos una clase genérica

    // 1. Atributo
    private T elemento;

    // 2. Constructor
    public ClaseGenerica(T e) {
        elemento = e;
    }



    // 3. Método
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    public T getElemento() {
        return elemento;
    }
}