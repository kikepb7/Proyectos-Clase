package com.mycompany.aburrido;

import java.util.ArrayList;
import java.util.*;

public class ProductoEnStock {
    
    // Campos
    private int stock;
    private int stockTotal;
    private int a;
    private String codeProduct;
    private ArrayList<ProductoEnStock> catalogo;
    
    
    // Constructor
    public ProductoEnStock(){
        this.stock = stock;
    }
    
    // Getter & Setter
    public int getProductoEnStock(int stock){
        return stock;
    }
    
    
    // Método para aumentar el stock
    public void aumentarStock(String codeProducto, int stock, int a){
        System.out.println("Si desea aumentar el stock, introduzca el código del producto: ");
        System.out.println(codeProduct);
        if(a == 1){
            stockTotal = stock + 1;
            System.out.println("La cantidad total de stock es de: " + stockTotal);
        }
    }  
    
    // Método para disminuir el stock
    public void disminuirStock(String codeProduct, int stock, int a){
        System.out.println("Si desea disminuir el stock, introduzca el código del producto: ");
        System.out.println("codeProduct");
        if(a == 0){
            stockTotal = stock - 1;
            System.out.println("La cantidad total de stock es de: " + stockTotal);
        }
    }
}
