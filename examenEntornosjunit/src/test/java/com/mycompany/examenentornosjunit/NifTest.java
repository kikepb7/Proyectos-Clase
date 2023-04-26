/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.examenentornosjunit;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author damci
 */
public class NifTest {
    
    public NifTest() {
    }

    @Rule
    public ExpectedException exception=ExpectedException.none();
    /**
     * Test of calcularLetraNIF method, of class Nif.
     */
    @Test(expected=IllegalArgumentException.class)
    public void testCalcularLetraNIF() {
        // Given
        Nif instance = new Nif();
        System.out.println("calcularLetraNIF");
        int nif = 12345678;
        char expResult = 'Z';
        
        // When
        char result = instance.calcularLetraNIF(nif);
        
        // Then
        assertEquals(expResult, result);    
         
        nif = 11778777;
        expResult = 'V';
        result = instance.calcularLetraNIF(nif);
        assertEquals(expResult, result);
        
        
        nif = 75570834;
        expResult = 'X';
        result = instance.calcularLetraNIF(nif);
        assertEquals(expResult, result);
        
        // Probar excepción
        nif = 999999999;
        instance.calcularLetraNIF(nif);
        exception.expectMessage("No se puede calcular la letra de números superiores a 8 cifras.");
    }   
}