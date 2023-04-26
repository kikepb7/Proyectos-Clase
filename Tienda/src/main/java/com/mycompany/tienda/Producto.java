package com.mycompany.tienda;

/**
 *
 * @author Enrique Palma Bullejos
 */
public class Producto {
    
    // Campos de la clase Producto
    public String nombreProducto;
    public double precio_producto;
    public int iva;
    public int descuento;
    public static int productos_tienda=0;
    public static int descuento_global=0;

    
    // Método para crear un Producto con todos los campos
    public Producto(String nombreProducto, double precio_producto, int iva, int descuento){
        this.nombreProducto = nombreProducto;
        this.precio_producto = precio_producto;
        this.iva = iva;
        this.descuento = descuento;
        productos_tienda+=1;
    }

    
    // Método para crear un Producto sólamente con el nombre del mismo
    public Producto(String producto){
        this.nombreProducto = producto;
        this.precio_producto = 10;
        this.descuento = 0;
        this.iva = 21;
        productos_tienda+=1;
    }
    
    
    // Método calcularPrecio()
    public double calcularPrecio(double descuento, double descuento_global){
        if(descuento_global>=descuento){
            double precio_final = precio_producto - (precio_producto * (descuento_global/100));
            precio_final += precio_final * (iva/100);
        }
        else{
            double precio_final = precio_producto - (precio_producto * (descuento/100));
            precio_final += precio_final * (iva/100);
        }
        
        return precio_producto;
    }
    
    
    // Mostrará por pantalla el nombre del producto y el precio final
    public String toString(){
        String mensaje = "El producto " + nombreProducto + " tiene un precio de " + calcularPrecio();
        return mensaje;
    }
    
    
    
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(double precio_producto) {
        this.precio_producto = precio_producto;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public static int getProductos_tienda() {
        return productos_tienda;
    }

    public static void setProductos_tienda(int productos_tienda) {
        Producto.productos_tienda = productos_tienda;
    }

    public static void setDescuento_global(int descuento_global) {
        Producto.descuento_global = descuento_global;
    }  
}