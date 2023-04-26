package com.mycompany.supuestospracticostema7;

abstract public class SerVivo {
    
    // Campos
    protected String nombreCientifico;
    protected String nombreComun;
 
    
    // Getter & Setter
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    // Método abstracto de alimentarse
    public abstract void alimentarse();
}

/**
 * Las clases abstractas NO LLEVAN CONSTRUCTORES!!!
 */