/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciopag141;

/**
 *
 * @author damci
 */
public class EjercicioPag141 {

    public static void main(String[] args) {
        
        MedioTransporteA objMedioTransporteA;
        
        objMedioTransporteA = new AvionA(4);
        objMedioTransporteA.getInfo();
        
        System.out.println(objMedioTransporteA.getClass().toString());
        ((AvionA) objMedioTransporteA).getNumMotores();
        
        
        
        System.out.println("*************************");
        
        
        MedioTransporteB objMedioTransporteB;
        
        objMedioTransporteB = new AvionB(4);
        objMedioTransporteB.getInfo();
        
        System.out.println(objMedioTransporteB.getClass().toString());
        ((AvionB) objMedioTransporteB).getNumMotores();
    }
}