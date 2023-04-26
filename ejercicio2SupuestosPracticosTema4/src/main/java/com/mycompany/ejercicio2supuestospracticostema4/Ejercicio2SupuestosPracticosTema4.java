package com.mycompany.ejercicio2supuestospracticostema4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio2SupuestosPracticosTema4 {

    public static void main(String[] args) {
        
        
    }
    {
    try{
    SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
    
    Date d1 = d.parse("01/11/1991");
    Date d2 = d.parse("02/11/1992");
    Date d3 = d.parse ("03/11/1993");
    Date d4 = d.parse("04/11/1994");
    
    Persona p1 = new Persona("1321123N", "Enrique", "Palma", "Bullejos", d1);
    Persona p2 = new Persona("5416841D", "Ana", "Candenas", "Condenas", d2);
    Persona p3 = new Persona("8616168A", "Jose", "Garcia", "Holiwi", d3);
    Persona p4 = new Persona("3516818X", "Jaime", "Jaimito", "Jaimón", d4);
}
    catch(Exception e){
    }
}
}
