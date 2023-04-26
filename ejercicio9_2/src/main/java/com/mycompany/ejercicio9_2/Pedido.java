package com.mycompany.ejercicio9_2;

import java.util.*;

/**
 *
 * @author Enrique Palma
 */
public class Pedido {
    
    // 1. Atributos
    private String id;
    private Cliente cliente;
    private HashMap<Producto, Integer> articulos;
    
    
    // 2. Constructores
    public Pedido() {
    }

    public Pedido(String id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.articulos = new HashMap<>();
    }

    
    // 3. Getter & Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public HashMap<Producto, Integer> getArticulos() {
        return articulos;
    }
    
    
    
    // 4. Métodos
    public void añadirArticulos(Producto producto, int unidades){
        if(articulos.containsKey(producto)){
            this.articulos.replace(producto, this.articulos.get(producto) + unidades);
        }
        else{
            this.articulos.put(producto, unidades);
        }
    }
    
    public void eliminarArticulo(Pedido producto){
        if(articulos.containsKey(producto)){
            articulos.remove(producto);
        }
    }
}