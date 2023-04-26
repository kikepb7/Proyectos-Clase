/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopag141;

/**
 *
 * @author damci
 */
public class AvionB extends AereoB{
    
    private int numMotores;
    
    public AvionB(int numMotores){
        this.numMotores = numMotores;
    }
    
    public void getInfo(){
        System.out.println("Avión");
    }
    
    public void getNumMotores(){
        System.out.println("Tiene " + numMotores + " motores.");
    }
}