package com.mycompany.versionb_desarrollodeclase;

public class Empleado {
    
    // Campos de la clalse Empleado
    public String nombre;
    public String apellidos;
    public double sueldo_basico;
    public int retenciones;
    public String categoria;
    public static int prima;
    public static int empleadosTotales;
    

    // Constructor para la clase Empleado usando todos los campos introducidos anteriomente
    public Empleado(String nombre, String apellidos, double sueldo_basico, int retenciones, String categoria){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldo_basico = sueldo_basico;
        this.retenciones = retenciones;
        this.categoria = categoria;
        empleadosTotales++;
    }
    
    
    /**
     * Constructor para la clase Empleado usando sólamente el campo nombre e inicializando los demás
     * campos con unos valores determinados
     */
    public Empleado(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldo_basico = 1500;
        this.categoria = "A";
        this.retenciones = 5;
        empleadosTotales++;
    }
    
    
    /**
     * Constructor para calcular el sueldo, obteniendo del empleado el sueldo base e incrementándolo según
     * la categoria a la que pertenece
     */
     public double calcularSueldo(){
        double incremento = 0;
        switch(categoria){
            case "A":incremento = 100;
                break;
            case "B":
                incremento = 200;
                break;
            case "C":
                incremento = 300;
                break;
            case "D":
                incremento = 500;
                break;
            default: System.out.println("No existe esta categoría");
                break;
        }
        
        // Método para calcular el sueldo final de cada Empleado
        double sueldoFinal = sueldo_basico;
        if(prima>0){
            sueldoFinal = sueldo_basico + incremento;
            sueldoFinal = sueldoFinal + (sueldo_basico * prima / 100);
            sueldoFinal = sueldoFinal - (sueldoFinal * retenciones / 100);
        } else{
            sueldoFinal = sueldo_basico + incremento;
            sueldoFinal -= (sueldoFinal * retenciones / 100);
        }
        return sueldoFinal;
    }
    
     
     // Método toString mostrando el Nombre y Apellidos del empleado y el sueldo total del mismo
     public String toString(){
         String mensaje = "Nombre y Apellidos: " + nombre + " " + apellidos + ", " + "Sueldo Total: " + calcularSueldo();
         return mensaje;
     }
  
     
     
    // Métodos get y set de los campos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSueldo_basico() {
        return sueldo_basico;
    }

    public void setSueldo_basico(double sueldo_basico) {
        this.sueldo_basico = sueldo_basico;
    }

    public double getRetenciones() {
        return retenciones;
    }

    public void setRetenciones(int retenciones) {
        this.retenciones = retenciones;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    

    // Método de escritura en el campo Prima
    public static void setPrima(int prima) {
        Empleado.prima = prima;
    }

    // Método de lectura en el campo EmpleadosTotales
    public static int getEmpleadosTotales() {
        return empleadosTotales;
    }
}