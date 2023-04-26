package com.mycompany.examenherencia;

/**
 *
 * @author Enrique Palma
 */
public class ExamenHerencia {

    public static void main(String[] args) {

        // Creamos electrodomésticos
        Lavadora AEG = new Lavadora(400, "Amarillo limón", 'A', 30, 7);
        
        Television Samsung = new Television(190, "Negro", 'P', 10, 24, true);
        
        
        
  
        
        // Modificamos datos de la televisión Samsung
        Samsung.setConsumoEnergetico('A');
        
        
        
        // Mostramos por pantalla los atributos de cada objeto
        System.out.println(AEG.toString());
        System.out.println("Precio total: " + AEG.precioFinal() + " Euros");
        System.out.println("");
        System.out.println(Samsung.toString());
        System.out.println("Precio total: " + Samsung.precioFinal() + " Euros");
        
        System.out.println("");
        
        // Modificamos el consumo energético de la televisión y mostramos los datos actualizados
        Samsung.setConsumoEnergetico('B');
        
        System.out.println("Precio total de la televisión: " 
                + Samsung.precioFinal() + " Euros");     
    }
}