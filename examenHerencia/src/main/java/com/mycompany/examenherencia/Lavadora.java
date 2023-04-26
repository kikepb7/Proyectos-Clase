package com.mycompany.examenherencia;

/**
 *
 * @author Enrique Palma
 */
public class Lavadora extends Electrodomestico{
    
    // 1. Atributos
    private double carga;
    
    
    // 2. Constructores
    public Lavadora() {
        super();
        this.carga = 5;
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    
    
    // 3. Getter & Setter
    public double getCarga() {
        return carga;
    }
    
    
    // 4. Métodos
    @Override
    public String toString() {
        return "Lavadora:   \n" 
                + "------------------ \n"
                + "Precio base: " + getPrecioBase() + " euros" + "\n" 
                + "Consumo Energético: " + getConsumoEnergetico() + "\n" 
                + "Peso: " + getPeso() + " kg" + "\n" 
                + "Color: " + getColor() + "\n"
                + "Carga: " + carga + " kg";
    }
    
    
    // Método precioFinal() desde la clase Electrodoméstico
    @Override
    public double precioFinal(){
        double precioTotal = super.precioFinal();
        
        if(carga > 6){
            precioTotal += 50;
        }
        
        return precioTotal;
    } 
}