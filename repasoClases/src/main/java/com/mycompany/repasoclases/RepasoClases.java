package com.mycompany.repasoclases;

public class RepasoClases {

    public static void main(String[] args) {
        
        FacturaConIVA f1 = new FacturaConIVA(100f, 21f, 121f);
        
        f1.setBaseImponible(200);
        f1.calcularTotal();
    }
}