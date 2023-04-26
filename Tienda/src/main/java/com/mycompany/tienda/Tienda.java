package com.mycompany.tienda;

public class Tienda {

    public static void main(String[] args) {

        // Creamos 3 objetos de la clase Producto
        Producto p1 = new Producto("Impresora", 100, 21, 5);
        Producto p2 = new Producto("Logitech");
        Producto p3 = new Producto("Libro Java", 20, 4, 15);
        
        // Mostramos todos los datos de los productos y número de productos
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p1.calcularPrecio();
        p2.calcularPrecio();
        p3.calcularPrecio();
        System.out.println("Número de productos: " + Producto.getProductos_tienda());
        System.out.println("********************");
        System.out.println("********************");
        
        
        // Aplicamos un descuento a todos los productos del 10%
        p1.calcularPrecio();
        p2.calcularPrecio();
        p3.calcularPrecio();
        
        // Subir el precio de Logitech
        p2.setPrecio_producto(12);
        
        // Mostramos todos los datos de los productos y número de productos
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("Número de productos: " + Producto.getProductos_tienda());
        System.out.println("********************");
        System.out.println("********************");
    }
}