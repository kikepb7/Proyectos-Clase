package com.mycompany.exameninterfaces;

/**
 *
 * @author Enrique Palma
 */
public class Triangulo extends Figura implements ILados{
    
    /**
     * Atributos de la clase Triángulo
     */
    private double base;
    private double altura;

    
    /**
     * Constructor de la clase Triángulo
     * @param base
     * @param altura 
     */
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    
    
    /**
     * Get del atributo base
     * @param lado 
     */
    public double getBase() {
        return base;
    }

    /**
     * Set del atributo base
     * @param base 
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Get del atributo altura
     * @return 
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Set del atributo altura
     * @param altura 
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
    /**
     * Método para calcular el área de un triángulo
     * @return área
     */
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    
    /**
     * Devuelve el número de lados del triángulo
     * @return número de lados
     */
    @Override
    public int numLados() {
        return 3;
    }

    
    /**
     * Muestra la información del número de lados y la superficie del triángulo
     * @return información
     */
    public String mostrar() {
        return "Triángulo \n"
                + "-------------- \n"
                + "Número de lados: " + numLados() + "\n" 
                + "Superficie: " + calcularArea() + " cm^2.";
    }
}