/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.ejercicio6tema3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author damci
 */
public class ConversorTest {
    
    public ConversorTest() {
    }

    /**
     * Test of fahrenheittocelsius method, of class Conversor.
     */
    @Test
    public void testFahrenheittocelsius() {
        // Given
        System.out.println("fahrenheittocelsius");
        Conversor instance = new Conversor();
        double temperatura = -5;
        // When
        double expResult = -20.55;
        double result = instance.fahrenheittocelsius(temperatura);
        // Then
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

        //When
        temperatura = 0;
        expResult = -17.78;
        result = instance.fahrenheittocelsius(temperatura);
        //Then
        assertEquals(expResult, result, .01);
       
        //When
        temperatura = 15;
        expResult = -9.44;
        result = instance.fahrenheittocelsius(temperatura);
        //Then
        assertEquals(expResult, result, .01);
       
        //When
        temperatura = 32;
        expResult = 0;
        result = instance.fahrenheittocelsius(temperatura);
        //Then
        assertEquals(expResult, result, .01);
    }

    /**
     * Test of celsiustofahrenheit method, of class Conversor.
     */
    @Test
    public void testCelsiustofahrenheit() {
        // Given
        System.out.println("celsiustofahrenheit");
        Conversor instance = new Conversor();
        // When
        double temperatura = -5;
        double expResult = 23;
        double result = instance.celsiustofahrenheit(temperatura);
        // Then
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //When
        temperatura = 0;
        expResult = 32;
        result = instance.celsiustofahrenheit(temperatura);
        //Then
        assertEquals(expResult, result, .01);
        
        //When
        temperatura = 15;
        expResult = 59;
        result = instance.celsiustofahrenheit(temperatura);
        //Then
        assertEquals(expResult, result, .01);
        
        //When
        temperatura = 32;
        expResult = 89.6;
        result = instance.celsiustofahrenheit(temperatura);
        //Then
        assertEquals(expResult, result, .01);
    }

    /**
     * Test of eurodolar method, of class Conversor.
     */
    @Test
    public void testEurodolar() {
        System.out.println("eurodolar");
        Conversor instance = new Conversor();
        double cantidad = 10.5;
        double expResult = 11.235;
        double result = instance.eurodolar(cantidad);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
       
       cantidad = 20.30;
       expResult = 21.721;
       result = instance.eurodolar(cantidad);
       assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of dolareuro method, of class Conversor.
     */
    @Test
    public void testDolareuro() {
        System.out.println("dolareuro");
        Conversor instance = new Conversor();
        double cantidad = 10.5;
        double expResult = 9.765;
        double result = instance.dolareuro(cantidad);
        //Then
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        
        cantidad = 20.30;
        expResult = 18.879;
        result = instance.dolareuro(cantidad);
        //Then
        assertEquals(expResult, result, 0.01);
    }  
}