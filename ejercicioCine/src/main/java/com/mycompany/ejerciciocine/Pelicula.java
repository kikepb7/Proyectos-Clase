 package com.mycompany.ejerciciocine;

/**
 *
 * @author Usuario
 */

public class Pelicula {

    /**
     * Introducimos los atributos de nuestra clase Película (nombre, director, año y género)
     */
    private String name;
    private String director;
    private int year;
    private String type;
    
    /**
     * Creamos un objeto película con sus atributos
     * @param name nombre de la película
     * @param director nombre del director
     * @param year año de estreno de la película
     * @param type género de la película
     */
    public Pelicula(String name, String director, int year, String type){
        this.name = name;
        this.director = director;
        this.year = year;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pelicula --> " + "Nombre: "  + name + " - " + "Director: " + director + " - " + "Año: " + year + " - "+ "Género: " + type;
    }
    

    /**
     * Creamos los métodos get y set de cada atributo
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
