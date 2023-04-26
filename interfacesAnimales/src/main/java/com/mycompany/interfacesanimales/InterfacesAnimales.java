package com.mycompany.interfacesanimales;

public class InterfacesAnimales {

    public static void main(String[] args) {

        // 1. Creamos las instancias de cada clase
        
        Perro rex = new Perro("Rex", 1000);
        Perro pluto = new Perro("Pluto", 10000);
        
        Pajaro canario = new Pajaro("Piolin", "Amarillo", 100);
        Pajaro loro = new Pajaro("Juan", "Verde", 500);
        
        EstrellaMar patricio = new EstrellaMar("Patricio", 50, 5);
        EstrellaMar jaime = new EstrellaMar("Jaime", 55, 4);
        
        Humano enrique = new Humano("Enrique", 31, 85);
        
        Mono amedio = new Mono("Amedio", "negro", 35);
        
        

        pluto.mover(10, 20);
        pluto.comer(300);
        pluto.ladrar();
        System.out.println("");
        System.out.println(pluto.informe());
        System.out.println("");
        System.out.println("");
        canario.mover(10, 20, 100);
        canario.comer(100);
        canario.piar();
        System.out.println("");
        System.out.println(canario.informe());
        System.out.println("");
        System.out.println("");
        jaime.mover(10, 20);
        jaime.comer(100);
        jaime.regenerar();
        System.out.println("");
        System.out.println(jaime.informe());
        System.out.println("");
        System.out.println("");
        System.out.println(enrique.informe());
        System.out.println("");
        System.out.println("");
        amedio.mover(10, 20);
        amedio.trepar(10,20,100);
        amedio.comer(300);
        amedio.crearHerramienta();
        System.out.println(amedio.informe());
    }
}



/**
 * Interfaz Evolución
 * hablar()
 * pensar()
 * 
 * crearHerramienta(){
 *      sout(usar "rama");
 * }
 * 
 * 
 * 
 * Clase Mono
 * trepar()
 * 
 * 
 * 
 * Clase Humano
 * herramientas complejas
 * cantar()
 * hacerFuerza
 */
