package com.mycompany.repasoclases;

public class Factura {
    
    private float baseImponible;
    private float iva;
    
    
    public float getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(float baseImponible) {
        this.baseImponible = baseImponible;
        this.contabilizar();
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }
    
    private void contabilizar(){
        // Crear un asiento con factura
        int añoActual = 2022;
    } 
}