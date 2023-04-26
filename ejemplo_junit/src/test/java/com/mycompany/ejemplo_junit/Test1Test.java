/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.ejemplo_junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author damci
 */
public class Test1Test {
    
    public Test1Test() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("setUpClass");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("tearDownClass");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("setUp");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown");
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    
    
    /**
     * Test of multiplica method, of class Test1.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        int a = 2;
        int b = 2;
        Test1 instance = new Test1();
        int expResult = 4;
        int result = instance.multiplica(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of factorial method, of class Test1.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        int numero = 3;
        Test1 instance = new Test1();
        int expResult = 6;
        int result = instance.factorial(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSuma(){
        
        // Given
        Test1 instance = new Test1();
        int a = 3;
        int b = 4;
        
        // When
        int expResult = 7;
        
        // Then
        System.out.println("suma");
        int result = instance.sumar(a,b);
        assertEquals(expResult, result);
    }
    

    @Test
    public void testFactorialNegativo() {
        System.out.println("factorial negativo");
        int numero = -3;
        Test1 instance = new Test1();
        exception.expect(ArithmeticException.class);
        exception.expectMessage("El factorial de un número negativo no existe");
        int result = instance.factorial(numero);
        assertEquals(7, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sumar method, of class Test1.
     */
    @Test(expected=IllegalArgumentException.class)
    public void testSumar() {
        // Given
        Test1 instance = new Test1();
        System.out.println("sumar");
        int a=9, b=3;
        
        // When
        int resultado = instance.sumar(a,b);

        // Then
        assertEquals(12, resultado ,0);
        
        // Probar excepción
        a = -9;
        b = 3;
        
        // When
        instance.sumar(a,b);
    }
}