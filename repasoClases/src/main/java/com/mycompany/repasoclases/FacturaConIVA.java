package com.mycompany.repasoclases;

/**
 * Clase FacturaConIVA
 * Consultar {@link Factura} para más información
 * @author damci
 * @version 1.0
 */

public class FacturaConIVA extends Factura {
    
    private float total;
    
    /**
     * 
     * @param baseImponible Base Imponible
     * @param iva IVA en porcentaje
     * @param total Total de la factura
     * @see <a target="_blank" href="http://www.javadesdecero.es"> Información sobre Java</a>
     */

    public FacturaConIVA(float baseImponible, float iva, float total) {
        this.setBaseImponible(baseImponible);
        this.setIva(iva);
        this.total = total;
    }
    
 
    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    public void calcularTotal(){
        this.total = this.getBaseImponible() + (this.getBaseImponible()*this.getIva());
    }
}