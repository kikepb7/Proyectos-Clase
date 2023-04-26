package com.mycompany.actividad_pag122;

public class Actividad_pag122 {

    public static void main(String[] args) {
        
        // Creando 2 productos
        Producto p1 = new Producto(10);
        Producto p2 = new Producto(30);
        Producto.infoRebajaActual();
        
        System.out.println("Precio p1: " + p1.getPrecioFinal());
        System.out.println("Precio p2: " + p2.getPrecioFinal());
        
        // Primeras rebajas y se decide bajar todos los precios un 10%
        p2.rebaja = 25;
        p1.infoRebajaActual();
        System.out.println("Precio p1 primeras rebajas: " + p1.getPrecioFinal());
        System.out.println("Precio p2 primeras rebajas: " + p2.getPrecioFinal());
        
        // Segundas rebajas y se decide bajar todos los precios a la mitad (50%)
        Producto.rebaja = 50;
        p2.infoRebajaActual();
        System.out.println("Precio p1 segundas rebajas: " + p1.getPrecioFinal());
        System.out.println("Precio p2 segundas rebajas: " + p2.getPrecioFinal());
    }
}

class Producto{
    
    private double precioFinal;
    public static double rebaja = 0;
    
    
    public Producto(double precioFinal){
        this.precioFinal = precioFinal;
    }
    
    public double getPrecioFinal(){
        return precioFinal - (precioFinal * rebaja / 100);
    }
    
    public double getRebaja(){
        return rebaja;
    }
    
    public static void infoRebajaActual(){
        System.out.println("La rebaja actual es del: " + rebaja + " %");
    }
}