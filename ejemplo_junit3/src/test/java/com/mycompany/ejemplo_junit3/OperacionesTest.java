package com.mycompany.ejemplo_junit3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Enrique Palma
 */
public class OperacionesTest {
    
    static final int MENOR = 0;
    static final int MAYOR = 1;
    
    public OperacionesTest() {
    }

    /**
     * Test of sumaArray method, of class Operaciones.
     */
    @Test
    public void testSumaArray() {
        System.out.println("sumaArray");
        // Given
        Operaciones instance = new Operaciones();
        // When
        int[] numeros = {2, 5, 7, 4, 1};
        int expResult = 19;

        int result = instance.sumaArray(numeros);
        // Then
        assertEquals(expResult, result);
    }

    @Test
    public void testMayorElementoArray() {
        System.out.println("mayorElementoArray");
        //Given
        Operaciones instance = new Operaciones();
        //When
        int[] numeros = {2, 5, 7, 4, 1};
        int expResult = 7;
        int result = instance.mayorElementoArray(numeros);
        //Then
        assertEquals(expResult, result);
    }
   
    @Test
    public void testMenorElementoArray() {
        System.out.println("menorElementoArray");
        //Given
        Operaciones instance = new Operaciones();
        //When
        int[] numeros = {2, 5, 7, 4, 1};
        int expResult = 1;
        int result = instance.menorElementoArray(numeros);
        //Then
        assertEquals(expResult, result);
    }
   
    @Test
    public void testMayorMenorElementoArray() {
        System.out.println("mayorMenorElementoArray");
        //Given
        Operaciones instance = new Operaciones();
        int[] numeros = {2, 5, 7, 4, 1};
        //When
        int tipo = MAYOR;
        int expResult = 7;
        int result = instance.menorMayorElementoArray(numeros, tipo);
        //Then
        assertEquals(expResult, result);
       
        //When
        tipo = MENOR;
        expResult = 1;
        result = instance.menorMayorElementoArray(numeros, tipo);
        //Then
        assertEquals(expResult, result);
    }

    /**
     * Test of menorMayorElementoArray method, of class Operaciones.
     */
    @Test
    public void menorMayorElementoArray() {
        System.out.println("mayorMenorElementoArray");
        //Given
        Operaciones instance = new Operaciones();
        int[] numeros = {2, 5, 7, 4, 1};
        //When
        int tipo = MAYOR;
        int expResult = 7;
        int result = instance.mayorElementoArray(numeros, MAYOR);
        //Then
        assertEquals(expResult, result);
       
        //When
        tipo = MENOR;
        expResult = 1;
        result = instance.menorElementoArray(numeros, tipo);
        //Then
        assertEquals(expResult, result);
    }
}