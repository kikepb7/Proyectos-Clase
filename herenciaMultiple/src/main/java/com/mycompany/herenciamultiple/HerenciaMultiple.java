/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.herenciamultiple;

/**
 *
 * @author damci
 */
public class HerenciaMultiple {

    public static void main(String[] args) {
        
        SubclaseA objA = new SubclaseA();
        SubclaseB objB = new SubclaseB();
        
        objA.metodoInterface();
        objA.metodoSuperclase();
        
        System.out.println("");
        
        objB.metodoInterface();
        objB.metodoSuperclase();
    }
}
