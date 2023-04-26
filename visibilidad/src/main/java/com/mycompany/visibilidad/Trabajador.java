package com.mycompany.visibilidad;

public class Trabajador extends Persona {
    
    private String puesto;

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    void prueba(){
        Persona p = new Persona();
        p.nombre="Enrique";
        p.nif="11111111-A";
    }
}