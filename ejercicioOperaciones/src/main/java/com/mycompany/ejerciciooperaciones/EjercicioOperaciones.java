package com.mycompany.ejerciciooperaciones;

public class EjercicioOperaciones {
    
    // Campos
    public double suma;

    
    public static void main(String[] args) {
        EjercicioOperaciones o = new EjercicioOperaciones();
        o.sumar(8, 9);
        
        System.out.println("******************");
        System.out.println("Suma: ");
        
        System.out.println(o.suma);
        System.out.println("******************");
        
        System.out.println("Incremento: ");
        System.out.println(o.incremento(50));
        System.out.println("******************");
    }
    
    
    // Método para realizar la suma de los dos valores
    public void sumar(double a, double b){
        double suma = a + b;
        
        // this.suma hace referencia al campo suma
        this.suma = suma;
    }
    
    
    public double incremento(final double a){
        double copia = a;
        copia = copia + 2;
        return copia;
    }
}


/**
 * Si se pone "void" no se va a devolver nada
 */