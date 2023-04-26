/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.exameninterfaces;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Enrique Palma
 */
public class CuadradoTest {
    
    public CuadradoTest() {
    }


    /**
     * Test of calcularArea method, of class Cuadrado.
     */
    @Test
    public void testCalcularArea() {
        System.out.println("calcularArea");
        Cuadrado cr1 = new Cuadrado(4);
        double expResult = 16;
        double result = cr1.calcularArea();
        assertEquals(expResult, result, 0);
        
        
        Triangulo t1 = new Triangulo(5, 3);
        double expResult2 =  7.5;
        double result2 = t1.calcularArea();
        assertEquals(expResult2, result2, 0);
        
        
        Circulo c1 = new Circulo(10);
        double expResult3 = 314.15;
        double result3 = c1.calcularArea();
        assertEquals(expResult3, result3, 0.01);
    }
}