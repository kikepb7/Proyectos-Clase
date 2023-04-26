package com.mycompany.aburrido;

public class Aburrido {

    public static void main(String[] args) {

        
        Tienda tienda = new Tienda();
        
        Componente componente1 = new Componente();
        ProductoEnStock producto1 = new ProductoEnStock();
        
        Componente componente2 = new Componente();
        ProductoEnStock producto2 = new ProductoEnStock();
        
        Componente componente3 = new Componente();
        ProductoEnStock producto3 = new ProductoEnStock();
        
        CarritoDeLaCompra carrito1 = new CarritoDeLaCompra();
        Componente componente4 = new Componente();
        
        carrito.añadir(componente1);
        carrito.añadir(componente2);
        carrito.comprar("tarjeta");
        
        producto1.disminuirStock("wedr2", 5000, 0);
        producto2.disminuirStock("k343n", 459, 0);
        
        Venta venta1 = new Venta();
        
        carrito1.eliminar(componente2);
        producto2.aumentarStock("k343n",458, 1);
        tienda.imprimirStockTienda();
    }
}
