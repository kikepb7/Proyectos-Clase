package com.mycompany.interfacesanimales;

public class EstrellaMar implements Animales{
    
    // 1. Atributos
    String nombre;
    int peso;
    int brazos;

    
    
    // 2. Constructores
    public EstrellaMar(){
    }
    
    public EstrellaMar(String nombre, int peso, int brazos){
        this.nombre = nombre;
        this.peso = peso;
        this.brazos = brazos;
    }
    
    
    // 3. Métodos
    void nadar(){
        System.out.println("Estoy nadando!!!");
    }
    
    void regenerar(){
        System.out.println(nombre + " se ha regenerado");
    }
    
    @Override
    public void mover(int x, int y){
        System.out.println("La estrella se mueve a (" + x + ", " + y + ")");
    }  
    
    @Override
    public void comer(int cantidad){
        System.out.println("Comiendo " + cantidad + " de placton.");
    }
    
    @Override
    public String informe(){
        return Animales.super.informe()
                + "\n"
                + "Animal: Estrella de mar\n"
                + "Nombre: " + nombre + "\n"
                + "Peso: " + peso + " gr\n"
                + "Brazos: " + brazos;
    }
    
    
    // 4. Getter & Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }
    
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getBrazos() {
        return brazos;
    }

    public void setBrazos(int brazos) {
        this.brazos = brazos;
    }  
}