package com.mycompany.examenherencia;

/**
 *
 * @author Enrique Palma
 */
public class Television extends Electrodomestico{
    
    // 1. Atributos
    private double resolucion;
    private boolean Netflix;
    
    
    // 2. Constructores
    public Television() {
        super();
        this.resolucion = 20;
        this.Netflix = false;
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean Netflix) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.Netflix = Netflix;
    }
    
    
    // 3. Getter & Setter
    public double getResolucion() {
        return resolucion;
    }

    public boolean isNetflix() {
        return Netflix;
    }

    @Override
    public String toString() {
        return "Televisión:   \n" 
                + "------------------ \n"
                + "Precio base: " + getPrecioBase() + " euros" + "\n" 
                + "Consumo Energético: " + getConsumoEnergetico() + "\n" 
                + "Peso: " + getPeso() + " kg" + "\n" 
                + "Color: " + getColor() + "\n"
                + "Resolucion: " + resolucion + " pulgadas" + "\n"
                + "Netflix: " + Netflix;
    }

    
    // Método precioFinal() desde la clase Electrodoméstico
    @Override
    public double precioFinal(){
        double precioFinal = super.precioFinal();
        
        if(resolucion > 20){
            precioFinal *= 1.3;
        }
        
        if(Netflix = true){
            precioFinal += 50;
        }
        
        return precioFinal;
    }
}