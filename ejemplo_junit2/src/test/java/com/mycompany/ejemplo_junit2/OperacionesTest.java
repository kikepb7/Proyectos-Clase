/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.ejemplo_junit2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author damci
 */
public class OperacionesTest {
    
    public OperacionesTest() {
    }

    /**
     * Test of suma method, of class Operaciones.
     */
    @Test
    public void testSuma() {
        //Given
        Operaciones op = new Operaciones();
        
        //When
        int a = 4;
        int b = 2;
        
        int resultado = op.suma(a, b);
        
        //Then
        assertEquals(6, resultado);
    }
    
    @Test
    public void testFahrenheit(){
        
        //Given
        Operaciones op = new Operaciones();
        
        //When
        double a = 176d;
        double resultado = op.conversorFahrenheit(a, 'F');
        
        //Then
        assertEquals(80.0, resultado, 0);
        }
    
    @Test
    public void testKelvin(){
        
        //Given
        Operaciones op = new Operaciones();
        
        //When
        double a = 100;
        double resultado = op.conversorKelvin(a, 'K');
        
        //Then
        assertEquals(373, resultado, 0);
    }

    /**
     * Test of conversorFahrenheit method, of class Operaciones.
     */
    @Test
    public void testConversorFahrenheit() {
        System.out.println("conversorFahrenheit");
        double temperatura = 0.0;
        char sistema = ' ';
        Operaciones instance = new Operaciones();
        double expResult = 0.0;
        double result = instance.conversorFahrenheit(temperatura, sistema);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of conversorKelvin method, of class Operaciones.
     */
    @Test
    public void testConversorKelvin() {
        System.out.println("conversorKelvin");
        double temperatura = 0.0;
        char sistema = ' ';
        Operaciones instance = new Operaciones();
        double expResult = 0.0;
        double result = instance.conversorKelvin(temperatura, sistema);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}