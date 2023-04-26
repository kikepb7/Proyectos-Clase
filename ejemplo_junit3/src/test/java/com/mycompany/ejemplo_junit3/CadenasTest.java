/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.ejemplo_junit3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author damci
 */
public class CadenasTest {
    
    public CadenasTest() {
    }

    /**
     * Test of invertir method, of class Cadenas.
     */
    @Test
    public void testInvertir(){
        System.out.println("invertir");
        Cadenas instance = new Cadenas();
        String expResult = "AO";
        String result = instance.invertir("OA");
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of sumaCadena method, of class Cadenas.
     */
     @Test
     public void testSuma(){
         System.out.println("suma");
         Cadenas instance = new Cadenas();
         String cadena = "HAL";
         String expResult = "IBM";
         String result = instance.suma(cadena);
         assertEquals(expResult, result);
     }
     
     
     
     @Test       
     public void testAssert(){                   

        //Variable declaration       
        String string1="Junit";                   
        String string2="Junit";                   
        String string3="test";                   
        String string4="test";                   
        String string5=null;                   
        int variable1=1;                   
        int    variable2=2;                   
        int[] airethematicArrary1 = { 1, 2, 3 };                   
        int[] airethematicArrary2 = { 1, 2, 3 };                   

        //Assert statements       
        assertEquals(string1,string2);
        assertSame(string3, string4);                   
        assertNotSame(string1, string3);                   
        assertNotNull(string1);           
        assertNull(string5);           
        assertTrue(variable1<variable2);                   
        assertArrayEquals(airethematicArrary1, airethematicArrary2);                   
        
        Persona p1 = new Persona("Ana", 20);
        Persona p2 = new Persona("Ana", 20);
        assertNotSame(p1,p2);
        //p2 = p1;
        assertEquals(p1,p2);
    }
}