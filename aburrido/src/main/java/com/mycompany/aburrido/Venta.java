package com.mycompany.aburrido;

import java.util.*;
import java.util.ArrayList;

public class Venta {
    
    // Campos
    private ArrayList<Componente> componentes;
    private String fechaVenta;
    private String codeProduct;
    private String idCliente;
    private String metodoPago;
    private String tarjeta;
    private String transferencia;
    private int hora;
    private int minuto;
    private int segundo;
    private int dia;
    private int mes;
    private int anio;
    private double precioTotal;
    
    
    // Constructor
    public void Venta(String metodoPago){
        this.metodoPago = metodoPago;
        componentes = new ArrayList<Componente>();
        System.out.println("El precio total de la venta es de: " + precioTotal);
    }
    
    
    public void FechaVenta(int hora, int minuto, int ssegundo, int dia, int mes, int anio){
        hora = hora;
        minuto = minuto;
        segundo = segundo;
        dia = dia;
        mes = mes;
        anio = anio;
    }

    
    // Getter & Setter
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    // Crear un identificador para cada Cliente
    public void Cliente(String idCliente){
        idCliente = idCliente;
    }
    
    public void setCodigoCliente(String idCliente){
        idCliente = idCliente;
    }
    
    public String getIdCliente(){
        return idCliente;
    }
    
    
    // Método que muestra el método de pago elegido
    public void metodoPago(String metodoPago){
        this.metodoPago = metodoPago;
    }
    
    public void setMetodoPago(String metodoPago){
        this.metodoPago = metodoPago;
    }
    
    public String getMetodoPago(){
        return metodoPago;
    }
}