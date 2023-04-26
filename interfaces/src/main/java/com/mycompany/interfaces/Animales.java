
package com.mycompany.interfaces;


interface Animales {
    
    // Los métodos de la clase interfaz no tienen cuerpo
    
    public void mover(int x, int y);
    
    public void comer(int cantidad);
    
    default String informe(){
        return ("DATOS DEL ANIMAL\n------------------------------");
    }
}