package com.mycompany.academia;
/**
 * Clase contenedora de alumnos con información de sus notas por asignatura y media de notas
 * @author Enrique
 * 
 */

public class Alumno {
    
    private String name;
    private String surname;
    private float notaProgramacion;
    private float notaLenguajeMarcas;
    private float notaSistemasInformaticos;
    private float notaMedia;
    
    public Alumno(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    
    /**
     * 
     * @param name Nombre del alumno
     * @param surname Apellidos del alumno, dos apellidos
     * @param notaProgramacion Nota asignatura Programación
     * @param notaLenguajeMarcas Nota asignatura Lenguaje de Marcas
     * @param notaSistemasInformaticos Nota Sistemas informáticos
     */
    
    public Alumno(String name, String surname, float notaProgramacion, float notaLenguajeMarcas, float notaSistemasInformaticos) {
        this.name = name;
        this.surname = surname;
        this.notaProgramacion = notaProgramacion;
        this.notaLenguajeMarcas = notaLenguajeMarcas;
        this.notaSistemasInformaticos = notaSistemasInformaticos;
        this.notaMedia = notaMedia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getNotaProgramacion() {
        return notaProgramacion;
    }

    public void setNotaProgramacion(float notaProgramacion) {
        this.notaProgramacion = notaProgramacion;
    }

    public float getNotaLenguajeMarcas() {
        return notaLenguajeMarcas;
    }

    public void setNotaLenguajeMarcas(float notaLenguajeMarcas) {
        this.notaLenguajeMarcas = notaLenguajeMarcas;
    }

    public float getNotaSistemasInformaticos() {
        return notaSistemasInformaticos;
    }

    public void setNotaSistemasInformaticos(float notaSistemasInformaticos) {
        this.notaSistemasInformaticos = notaSistemasInformaticos;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    private void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    
    
    public float notaMedia(){
        float resultado=((notaProgramacion+notaLenguajeMarcas+notaSistemasInformaticos)/3);
        return resultado;
    }
    
    
    //public void notaMedia(){
    //    this.notaMedia = (this.notaProgramacion 
                // + this.notaLenguajeMarcas
                // + this.notaLenguajeMarcas.SistemasInformaticos)/3);
    //}  
}