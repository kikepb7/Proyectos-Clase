/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examentest;

/**
 *
 * @author damci
 */
class Saludo {

     static String comienzoSaludo = "Hola ";

    String nombre;

    Saludo (String nombre){

        this. nombre = nombre;

    }

    void saludar() {

        System.out.println(comienzoSaludo + nombre);

    }

    void saludar (String nombre){

        System.out.println(comienzoSaludo + nombre);

    }

    String getNombre(){

        return nombre;

    }

}