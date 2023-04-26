package com.mycompany.ejercicio9_2;

import java.util.*;

/**
 *
 * @author Enrique Palma
 */
public class Ejercicio9_2 {

    public static void main(String[] args) {
        
        // Creamos Clientes
        Cliente Jose = new Cliente("7584134R", "Jose", "Noeque");
        Cliente Enrique = new Cliente("75570834X", "Enrique", "Palma");
        
        
        // Creamos Productos
        Producto p1 = new Producto("Tornillo 11", "Estrella", "3123", .1);
        Producto p2 = new Producto("Tornillo 21", "Plano", "2332", .1);
        Producto p3 = new Producto("Destornillador lujo", "Mixto", "2346", 4);
        
        
        // Creamos Pedidos
        Pedido pe1 = new Pedido("1", Jose);
        Pedido pe2 = new Pedido("2", Enrique);
        
        
        
        //Añadimos artículos
        pe1.añadirArticulos(p1,100);
        pe1.añadirArticulos(p2,100);
        pe1.añadirArticulos(p3, 50);
        
        pe2.añadirArticulos(p3,10);
        pe2.añadirArticulos(p1,100);
        pe2.añadirArticulos(p3, 2);
        
        
        // Creamos una Cola
        Cola c = new Cola();
        
        c.añadirPedido(pe2);
        c.añadirPedido(pe1);
        
        
        // Procesar pedidos
        Pedido atendido = c.borrarPedido();
        System.out.println("Nombre del cliente: "
                + atendido.getCliente().getNombre()
                + " "
                + atendido.getCliente().getApellidos());
        System.out.println(" ");
        
        System.out.println("Lista de productos: ");
        System.out.println("---------------------");
        
        HashMap<Producto, Integer> lista = atendido.getArticulos();
        
        for(Producto p: lista.keySet()){
            System.out.println("Número de serie: #" + p.getnSerie());
        }
        
        /*
        lista.keySet().forEach((prod1)-> {
            System.out.println("Número de serie: #" + prod1.getnSerie());
        });
        */
    }
}