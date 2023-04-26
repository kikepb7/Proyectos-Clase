package com.mycompany.ejercicio9_2;

import java.util.*;
/**
 *
 * @author Enrique Palma
 */
public class Cola {
    
    // 1. Atributos
    private final LinkedList<Pedido> cola;
    
    
    // 2. Constructor
    public Cola() {
        this.cola = new LinkedList<>();
    }
    
    
    // 3. Métodos
    public void añadirPedido(Pedido pedido){
        cola.add(pedido);
    }
    
    public Pedido borrarPedido(){
        return cola.remove();
    }
}