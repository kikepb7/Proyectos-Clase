/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pregunta2;

/**
 *
 * @author Enrique Palma Bullejos
 * @version 1.0
 * @since 05/12/2022
 */
public class Alumno {

    private String nombre;

    private String apellidos;

    private float programacion;

    private float lenguajeMarcas;

    private float sistemasInformaticos;

    private float notaMedia;


    /**
     * Crea objetos de la clase Alumno con los atributos de Nombre y Apellidos
     * 
     * @param nombre Indica el nombre del alumno
     * @param apellidos Indica los apellidos del alumno
     */
     public Alumno(String nombre, String apellidos) {

        this.nombre = nombre;

        this.apellidos = apellidos;

    }


/**
 * Crea objetos de la clase Alumno con los atributos de Nombre, Apellidos y las notas de las asignaturas
 * de Programación, Lenguaje de Marcas y de Sistemas Informáticos
 * 
 * @param nombre Indica el nombre del alumno
 * @param apellidos Indica los apellidos del alumno
 * @param programacion indica la nota de la asignatura programación del alumno
 * @param lenguajeMarcas indica la nota de la asignatura lenguaje de marcas del alumno
 * @param sistemasInformaticos  indica la nota de la asignatura sistemas informáticos del alumno
 */
   public Alumno(String nombre, String apellidos, float programacion, float lenguajeMarcas, float sistemasInformaticos) {

        this.nombre = nombre;

        this.apellidos = apellidos;

        this.programacion = programacion;

        this.lenguajeMarcas = lenguajeMarcas;

        this.sistemasInformaticos = sistemasInformaticos;

    }



    

    
   /**
    * Constructor que devuelve el nombre del alumno
    * 
    * @return nombre
    */
    public String getNombre() {

        return nombre;

    }


    /**
     * Constructor que establece el nombre del alumno
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {

        this.nombre = nombre;

    }


    /**
     * Constructor que devuelve los apellidos del alumno
     * 
     * @return apellidos
     */
    public String getApellidos() {

        return apellidos;

    }


    /**
     * Constructor que establece los apellidos del alumno
     * 
     * @param apellidos 
     */
    public void setApellidos(String apellidos) {

        this.apellidos = apellidos;

    }


    /**
     * Constructor que devuelve la nota de programación del alumno
     * 
     * @return programacion
     */
    public float getProgramacion() {

        return programacion;

    }


    /**
     * Constructor que establece la nota de programación del alumno
     * 
     * @param programacion 
     */
    public void setProgramacion(float programacion) {

        this.programacion = programacion;

    }


    /**
     * Constructor que devuelve la nota de lenguaje de marcas del alumno
     * 
     * @return lenguajeMarcas
     */
    public float getLenguajeMarcas() {

        return lenguajeMarcas;

    }


    /**
     * Constructor que establece la nota de lenguaje de marcas del alumno
     * 
     * @param lenguajeMarcas 
     */
    public void setLenguajeMarcas(float lenguajeMarcas) {

        this.lenguajeMarcas = lenguajeMarcas;

    }


    /**
     * Constructor que devuelve la nota de sistemas informáticos del alumno
     * 
     * @return sistemasInformaticos
     */
    public float getSistemasInformaticos() {

        return sistemasInformaticos;

    }


    /**
     * Constructor que establece la nota de sistemas informáticos del alumno
     * 
     * @param sistemasInformaticos 
     */
   public void setSistemasInformaticos(float sistemasInformaticos) {

        this.sistemasInformaticos = sistemasInformaticos;

    }


   /**
    * Constructor que devuelve la nota media del alumno
    * 
    * @return notaMedia
    */
    public float getNotaMedia() {

        return notaMedia;

    }


    /**
     * Constructor que establece la nota media del alumno
     * 
     * @param notaMedia 
     */
    private void setNotaMedia(float notaMedia) {

        this.notaMedia = notaMedia;

    }

    
    
   public void calcularMedia()

    {

        this.notaMedia = (this.programacion 

                + this.lenguajeMarcas 

                + this.sistemasInformaticos)/3;

    }

    
   /**
    * Constructor que hace una consulta para devolver todos los valores de un alumno
    * 
    * @return nombre, apellidos, notaMedia
    */
    public String consultarAlumno()

    {

        return "El alumno " + this.nombre + " " + this.apellidos 

                + " tiene una nota media de " + this.notaMedia;

    }

    

    

}
