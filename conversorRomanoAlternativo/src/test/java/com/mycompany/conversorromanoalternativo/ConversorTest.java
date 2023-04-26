/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.conversorromanoalternativo;

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
     * Test of roman2dec method, of class Conversor.
     */
    @Test
    public void testRoman2dec() {
        System.out.println("roman2dec");
        String romano = "MMMCXXV";
        int expResult = 3125;
        int result = Conversor.roman2dec(romano);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dec2roman method, of class Conversor.
     */
    @Test
    public void testDec2roman() {
        System.out.println("dec2roman");
        int decimal = 3125;
        String expResult = "MMMCXXV";
        String result = Conversor.dec2roman(decimal);
        assertEquals(expResult , result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
