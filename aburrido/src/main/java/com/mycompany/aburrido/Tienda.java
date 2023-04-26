package com.mycompany.aburrido;

import java.util.ArrayList;

public class Tienda {
    
    public String name;
    public String shopID;
    public String adress;
    public int number;
    private ArrayList<Componente> componentes;
    private ArrayList<ProductoEnStock> catalogo;
    private ArrayList<CarritoDeLaCompra> carritos;
    private ArrayList<Venta> ventas;
    
    
    // Constructor Tienda name + shopID + adress + number
    public Tienda(String name, String shopID, String adress, int number){
        this.name = name;
        this.shopID = shopID;
        this.adress = adress;
        this.number = number;
    }
    // Constructor Tienda shopID + adress
    public Tienda(String shopID, String adress){
        this.shopID = shopID;
        this.adress = adress;
        this.name = "Desconocido";
        this.number = 0;
    }
    
    
    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopID() {
        return shopID;
    }

    public void setShopID(String shopID) {
        this.shopID = shopID;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
