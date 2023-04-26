package com.mycompany.aburrido;

public class Componente {
    
    // Nombre del fabricante.
    public String name;
    // Codigo del fabricante.
    public String codeFabricante;
    // Codigo interno del producto.
    public String codeProduct;
    // Descripcion del producto.
    public String description;
    // Precio de venta al publico.
    public double price;
    // Contador de componentes
    public static int cont;
    
    
    
    // Constructor name + code + price
    public Componente(String name, String codeFabricante, String codeProduct, String description, double price) {
        this.name = name;
        this.codeFabricante = codeFabricante;
        this.codeProduct = codeProduct;
        this.description = description;
        this.price = price;
        cont++;
    }
    
    
    // Constructor name + code
    public Componente(String name, String codeFabricante, String codeProduct){
        this.name = name;
        this.codeFabricante = codeFabricante;
        this.codeProduct = codeProduct;
        this.description = "Desconocido";
        this.price = 00.00;
        cont++;
    }

    // Constructor code
    public Componente(String codeProduct) {
        this.name = "Desconocido";
        this.codeFabricante = codeFabricante;
        this.codeProduct = codeProduct;
        this.codeFabricante = "Desconocido";
        this.description = "Desconocido";
        this.price = 00.00;
        cont++;
    }
    

    
    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodeFabricante() {
        return codeFabricante;
    }

    public void setCodeFabricante(String codeFabricante) {
        this.codeFabricante = codeFabricante;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        Componente.cont = cont;
    }
 
    
    public void printInfo(){
        System.out.println("Fabricante: " + name);
        System.out.println("Código del Fabricante: " + codeFabricante);
        System.out.println("Referencia del producto: " + codeProduct);
        System.out.println("Detalles: " + description);
        System.out.println("Precio: " + price);
    }
}
