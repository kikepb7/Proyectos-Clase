package com.mycompany.examenherencia;

/**
 *
 * @author Enrique Palma
 */
public class Electrodomestico {
    
    // 1. Atributos
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    protected static final String[] colores = {"blanco", "negro", "azul", "gris"};
    
    
    // 2. Constructores
    public Electrodomestico() {
        this.precioBase = 100;
        this.color = "blanco";
        this.consumoEnergetico = 'A';
        this.peso = 5;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    
    
    // 3. Getter & Setter
    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static String[] getColores() {
        return colores;
    }
    
    
    
    // 4. Métodos
    private void comprobarConsumoEnergetico(char consumoEnergetico){
        if (consumoEnergetico >= 'A' && consumoEnergetico <= 'F') {
            System.out.println("El consumo energético: " + consumoEnergetico + " es correcto.");
        } else {
            System.out.println("El consumo energético es erroneo, por lo que usaremos el valor por defecto: ");
            consumoEnergetico = this.consumoEnergetico;
        }
    }

    
    // Mostramos por pantalla la información del electrodmoéstico
    @Override
    public String toString() {
        return "Precio base: " + precioBase + " Euros" + "\n"
                + "Consumo Energetico: " + consumoEnergetico 
                + "Peso: " + peso + " kg";
    }
    
    
    public double precioFinal() {
        double precioFinal = precioBase;

        // Aumentar precio según la letra
        switch(consumoEnergetico) {
            case 'A' -> precioFinal += 100;
            case 'B' -> precioFinal += 80;
            case 'C' -> precioFinal += 60;
            case 'D' -> precioFinal += 50;
            case 'E' -> precioFinal += 30;
            default -> precioFinal += 10;
        }

        // Aumentar precio según el tamaño
        if(peso >= 0 && peso < 20) {
            precioFinal += 10;
        } else if(peso >= 20 && peso < 50) {
            precioFinal += 50;
        } else if(peso >= 50 && peso < 80) {
            precioFinal += 80;
        } else {
            precioFinal += 100;
        }

        return precioFinal;
    }
}