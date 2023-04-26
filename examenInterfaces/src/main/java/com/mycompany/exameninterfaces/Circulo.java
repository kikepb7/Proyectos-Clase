package com.mycompany.exameninterfaces;

/**
 *
 * @author Enrique Palma
 */
public class Circulo extends Figura{
    
    /**
     * Atributos de la clase Círculo
     */
    private double radio;
    
    
    /**
     * Constructor de la clase Círculo
     * @param radio 
     */
    public Circulo(double radio){
        this.radio = radio;
    }
    
    
    /**
     * Get del atributo radio
     * @param lado 
     */
    public double getRadio() {
        return radio;
    }
    
    /**
     * Set del atributo radio
     * @param radio 
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
    /**
     * Método para calcular el área de un círculo
     * @return área
     */
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    
    /**
     * Muestra la información de la superficie del círculo
     * @return información
     */
    public String mostrar() {
        return "Círculo \n"
                + "-------------- \n"
                + "Superficie: " + calcularArea() + " cm^2.";
    }
}