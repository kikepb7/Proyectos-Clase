package com.mycompany.ejercicioherencia;

public class Empleado extends Persona{
    
    // Campos de la clase Empleado
    private String categoria;
    private int irpf;
    private String departamento;
    private int numeroEmpleado;

    
    // Constructores de la clase Empleado NOMBRE + APELLIDOS + NIF + CIUDAD + CATEGORIA + DEPARTAMENTO + IRPF
    public Empleado(String nombre, String apellidos, String nif, String ciudad, String categoria, String departamento, int irpf) {
        super(nombre, apellidos, nif, ciudad);
        this.categoria = categoria;
        this.irpf = 5;
        this.departamento = departamento;
        numeroEmpleado++;
    }

    // Constructor de la clase Empleado NOMBRE + APELLIDOS + NIF + CIUDAD + CATEGORIA + DEPARTAMENTO
    public Empleado(String nombre, String apellidos, String nif, String ciudad, String categoria, String departamento) {
        super(nombre, apellidos, nif, ciudad);
        this.categoria = categoria;
        this.departamento = departamento;
        this.irpf = 5;
        numeroEmpleado++;
    }

    // Constructor de la clase Empleado NOMBRE + APELLIDO + NIF + CIUDAD + CATEGORIA
    public Empleado(String nombre, String apellidos, String nif, String ciudad, String categoria) {
        super(nombre, apellidos, nif, ciudad);
        this.categoria = categoria;
        this.irpf = 5;
        this.departamento = "N/A";
        numeroEmpleado++;
    }

    // Constructor de la clase Empleado NOMBRE + APELLIDOS + NIF + CATEGORIA
    public Empleado(String nombre, String apellidos, String nif, String categoria) {
        super(nombre, apellidos, nif);
        this.categoria = categoria;
        this.ciudad = "Desconocido";
        this.irpf = 5;
        this.departamento = "N/A";
        numeroEmpleado++;
    }

    
    
    // Getter & Setter
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getIrpf() {
        return irpf;
    }

    public void setIrpf(int irpf) {
        this.irpf = irpf;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
    
    
    // Método toString
    @Override
    public String toString() {
        return  super.toString() + "\nCategoria: " + categoria + "\nDepartamento: " + departamento;
    }
}