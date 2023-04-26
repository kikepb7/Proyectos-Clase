package com.mycompany.curso;

public class Alumnos {
    
    // Estático clase (inicializándolo a 0)
    private static int nAlumnos = 0;
    private static double mediaTotal = 0;
    
    // Instancias
    private String nombre;
    private String apellidos;
    private double notaMedia;
    
    
    public Alumnos(String nombre, String apellidos, double notaMedia){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.notaMedia = notaMedia;
        nAlumnos++;
        mediaTotal = mediaTotal + notaMedia;
    }
    
    public String toString(){
        return "Nombre: " + nombre
                + ", Apellidos: " + apellidos 
                + ", Nota Media: " + notaMedia;
    }


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

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        //Actualizar media total, quitar media antigua y sumar nueva
        mediaTotal = mediaTotal - this.notaMedia;
        mediaTotal = mediaTotal + notaMedia;
        
        this.notaMedia = notaMedia;
    }
    
    public static int getnAlumnos() {
        return nAlumnos;
    }

    public static double getMediaTotal() {
        return mediaTotal/nAlumnos;
    }
}