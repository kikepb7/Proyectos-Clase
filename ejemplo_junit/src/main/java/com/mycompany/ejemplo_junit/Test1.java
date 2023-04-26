package com.mycompany.ejemplo_junit;

public class Test1 {
    
    
    public int multiplica(int a, int b){
        return a * b;
    }
    
    
    public int factorial(int numero){
        if(numero < 0){
            throw new ArithmeticException("El factorial de un número negativo no existe");
        }
        else if(numero == 0){
            return 1;
        }
        int factorial = numero;
        for(int i = (numero - 1); i > 1; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
    
    
    public int sumar(int a, int b){
        if (a<0 || b<0){
            throw new IllegalArgumentException("No se aceptan valores negativos");
        }
        else{
            return a+b;
        }
    }
}
    




    
//    public int suma(int a, int b){
//        //if(a < 0 || b < 0) throw new IllegalArgumentException("No se aceptan valores negativos"){
//            return a + b;
//        }
//    }





/**
 * #TEST#
 * 
 * public ExpectedException exception = ExpectedException();
 * 
 * public void test Sumar(){
 *  sout("sumar");
 * 
 * Test1 instance = new Test1();
 * int a = 9; b = 3;
 * 
 * 
 * // When
 * int resultado = instance.sumar(a,b);
 * 
 * // Then
 * assertEquals(12, resultado, 0);
 */