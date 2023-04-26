package com.mycompany.interfacesanimales;

/**
 *
 * @author Enrique Palma
 */
public class Humano implements Animales, IEvolucion{
    
    // 1. Atributos
    String nombre;
    int edad;
    int peso;
    
    
    // 2. Constructores
    public Humano(){
    }
    
    public Humano(String nombre, int edad, int peso){
        this.nombre = nombre;
        this.edad = edad;
        this. peso = peso;
    }
    
    
    // 3. Métodos
    void cantar(){
        System.out.println(nombre + " está cantando!!!");
    }
    
    void hacerFuego(){
        System.out.println(nombre + " está haciendo fuego.");
    }
    
    @Override
    public void hablar(){
        System.out.println("El humano " + nombre + " está hablando!!!");
    }
    
    @Override
    public void pensar(){
        System.out.println("El humano " + nombre + " está pensando...");
    }
    
    @Override
    public void mover(int x, int y){
        System.out.println("El humano " + nombre + " se mueve a (" + x + ", " + y + ")");
    }
    
    @Override
    public void comer(int cantidad){
        peso = peso + (cantidad/1000);
    }
    
    @Override
    public String informe(){
        return Animales.super.informe()
                + "\n"
                + "Animal: Humano\n"
                + "Nombre: " + nombre + "\n"
                + "Edad: " + edad + "\n"
                + "Peso: " + peso + " Kg";
    }
    
    @Override
    public void crearHerramienta(){
        System.out.println("Usar herramientas complejas.");
    }
    
    
    // 4. Getter & Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}