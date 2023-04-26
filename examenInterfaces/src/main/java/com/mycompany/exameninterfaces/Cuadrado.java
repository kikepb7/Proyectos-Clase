package com.mycompany.exameninterfaces;

/**
 *
 * @author Enrique Palma
 */
public class Cuadrado extends Figura implements ILados{
    
    /**
     * Atributos de la clase cuadrado
     */
    private double lado;
    
    
    /**
     * Constructor de la clase Cuadrado
     * @param lado 
     */
    public Cuadrado(int lado){
        this.lado = lado;
    }
    

    
    /**
     * Set del atributo lado
     * @param lado 
     */
    public void setLado(double lado) {
        this.lado = lado;
    }
    /**
     * Get del atributo lado
     * @return lado
     */
    public double getLado() {
        return lado;   
    }
    

    
    // 4. Métodos
    
    /**
     * Devuelve el número de lados del cuadrado
     * @return número de lados
     */
    @Override
    public int numLados() {
        return 4;
    }
    
    
    /**
     * Método para calcular el área de un cuadrado
     * @return área
     */
    public double calcularArea(){
        return lado * lado;
    } 

    
    /**
     * Muestra la información del número de lados y la superficie del cuadrado
     * @return información
     */
    public String mostrar() {
        return "Cuadrado \n"
                + "-------------- \n"
                + "Número de lados: " + numLados() + "\n" 
                + "Superficie: " + calcularArea() + " cm^2.";
    }
}