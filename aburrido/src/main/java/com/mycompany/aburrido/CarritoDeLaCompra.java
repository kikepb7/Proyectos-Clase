package com.mycompany.aburrido;

import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;

public class CarritoDeLaCompra {
    
    // Campos
    private ArrayList<Componente> componentes;
    private String idproducto;
    private String codigocliente;
    private int hora;
    private int minuto;
    private int segundo;
    private int dia;
    private int mes;
    private int anio;
    private String metodopago;
    private String transferencia;
    private String tarjeta;
    boolean vacio = true;
    
    public void CarritoDeLaCompra(){
        componentes = new ArrayList<Componente>();
    }
    
    public void estado(){
        if(vacio == true){
            System.out.println("El carrito está vacio.");
        }
        else if(vacio == false){
            System.out.println("El carrito no está vacio.");
        }
    }
    
    
    public void añadirComponente(Componente codeProduct){
        Componente componente = new Componente();
        componentes.add(componente);
    }
    
    public boolean eliminarComponente(Componente codeProduct){
        return componentes.remove(codeProduct);
    }
    
    public void comprar(String metodopago){
        if(metodopago == tarjeta){
            System.out.println("El método de pago es mediante tarjeta de crédito");
        }
        else if(metodopago == transferencia){
            System.out.println("El método de pago es mediante transferencia bancaria");
        }
    }
    
    
    // Getter & Setter
    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getCodigocliente() {
        return codigocliente;
    }

    public void setCodigocliente(String codigocliente) {
        this.codigocliente = codigocliente;
    }

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

    public String getMetodopago() {
        return metodopago;
    }

    public void setMetodopago(String metodopago) {
        this.metodopago = metodopago;
    }

    public String getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(String transferencia) {
        this.transferencia = transferencia;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public boolean isVacio() {
        return vacio;
    }

    public void setVacio(boolean vacio) {
        this.vacio = vacio;
    }
   
    Componente componente = new Componente();
    // Añadir Componente al Carrito
    public void añadir(Componente idProduct){
        
        componentes.add(componente);
        
        if(componentes.contains(idProduct)){
            componentes.remove(idProduct);
        }
    }
    
    // Eliminar Componente del Carrito
    public boolean eliminar(Componente idProduct){
        return componentes.remove(idProduct);
    }
    
    
    // Mostrar información por pantalla de los productos que contiene el Carrito
    public void pintInfo(){
        Componente componente = new Componente();
        componente.printInfo();
    }
    
    public void comprar(String metodoPago){
        if(metodoPago == tarjeta){
            System.out.println("El método de pago es mediante tarjeta de crédito.");
        }
        else if(metodoPago == transferencia){
            System.out.println("El método de pago es mediante transferencia.");
        }
    }
    Venta v = new Venta();
}