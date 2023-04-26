package com.mycompany.examenentornosjunit;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Enrique Palma
 */
public class OperacionesTest {
    
    public OperacionesTest() {
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    /**
     * Test of suma method, of class Operaciones.
     */
    @Test
    public void testSuma() {
        // Given
        System.out.println("suma");
        int a = 2;
        int b = 5;
        Operaciones instance = new Operaciones();
        // When
        int expResult = 7;
        int result = instance.suma(a, b);
        // Then
        assertEquals(expResult, result);
    }

    /**
     * Test of division method, of class Operaciones.
     */
    @Test(expected=ArithmeticException.class)
    public void testDivision() {
        // Given
        System.out.println("division");
        int a = 9;
        int b = 2;
        Operaciones instance = new Operaciones();
        // When
        float expResult = 4.5F;
        float result = instance.division(a, b);
        // Then
        assertEquals(expResult, result, 0);
        
        // When
        a = 9;
        b = 0;
        expResult = 0.0F;
        result = instance.division(a,b);
        assertEquals(expResult, result, 0);
        
        // Then
        result = instance.division(a, b);
        exception.expectMessage("No se puede dividir por cero.");
    }

    /**
     * Test of mayorDeEdad method, of class Operaciones.
     */
    @Test
    public void testMayorDeEdad() {
        // Given
        System.out.println("mayorDeEdad");
        Operaciones instance = new Operaciones();
        // When
        int edad = 9;
        String expResult = "Es menor de edad";
        String result = instance.mayorDeEdad(edad);
        // Then
        assertEquals(expResult, result);
        
        
        // When
        edad = 19;
        expResult = "Es mayor de edad";
        result =  instance.mayorDeEdad(edad);
        // Then
        assertEquals(expResult, result);
    }

    
    /**
     * Test of ofuscar method, of class Operaciones.
     */
    @Test
    public void testOfuscar() {
        System.out.println("ofuscar");
        // Given
        Operaciones instance = new Operaciones();
        // When
        String cadena = "hola";
        String expResult = "hola";
        String result = instance.ofuscar(cadena);
        // Then
        assertNotEquals(expResult, result);
    }

    
    /**
     * Test of conE method, of class Operaciones.
     */
    @Test(expected=IllegalArgumentException.class)
    public void testConE() {
        // Given
        System.out.println("conE");
        Operaciones instance = new Operaciones();
        // When
        String cadena = "patata";
        String expResult = "petete";
        String result = instance.conE(cadena);
        // Then
        assertEquals(expResult, result);

        // When
        cadena = "abcdefghijk";
        instance.conE(cadena);
        exception.expectMessage("No se puede introducir cadenas 10 o más caracteres.");
    }

    /**
     * Test of invertirParte method, of class Operaciones.
     */
    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testInvertirParte() {
        // Given
        System.out.println("invertirParte");
        Operaciones instance = new Operaciones();
        // When
        
        String[] frutas = {"piña", "pera", "plátano", "kiwi"};
        String[] expResult = {"piña", "kiwi", "plátano", "pera"};
        String[] result = instance.invertirParte(frutas);
        // Then
        assertArrayEquals(expResult, result);
        
        // When
        String[] frutas2 = {"piña", "pera", "plátano", "kiwi", "melón"};
        instance.invertirParte(frutas2);
    }
}