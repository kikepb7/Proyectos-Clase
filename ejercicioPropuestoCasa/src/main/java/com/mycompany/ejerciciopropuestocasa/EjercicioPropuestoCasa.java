package com.mycompany.ejerciciopropuestocasa;

public class EjercicioPropuestoCasa {

    public static void main(String[] args) {
        
                String month = args[0];
                String lowerCase = month.toLowerCase();
                String startUpperCase = lowerCase.substring(0,1).toUpperCase();
                String endLowerCase = lowerCase.substring(1);

                switch(lowerCase){
                case "enero", "marzo", "mayo", "julio", "agosto", "octubre", "diciembre": System.out.println("El mes de " + startUpperCase + endLowerCase +  " tiene 31 días");
                break;
                case "abril", "junio", "septiembre", "noviembre": System.out.println("El mes de " + startUpperCase + endLowerCase + " tiene 30 días");
                break;
                case "febrero": System.out.println("El mes de " + startUpperCase + endLowerCase + " tiene 28 días (29 días si es año bisiesto)");
                break;
                default: System.out.println("El mes introducido no es válido");
                }
        }
}



/* 
    **EXPLICACIÓN DEL EJERCICIO**

    1º Asignamos una variable String para el argumento en la posición args[0] (mes)
    2º Definimos una variable "lowerCase" para mostrar el argumento dado, sin importar si lleva mayúsculas
        o minúsculas, y devolverlo todo en minúsculas (toLowerCase())
    3º Definimos otra variable "startUpperCase" para iniciar el argumento con la primera letra en mayúscula
        haciendo uso del método substring() y separar la cadena en dos partes
    4º Para terminar, definimos otra variable "endLowerCase" para iniciar el argumento con la segunda parte
        en minúscula
    5º Mandamos un switch con parámetro lowerCase y lo dividimos entre todas las posibles combinaciones
*/



/*  Con el menor código posible
            Programa que pase por argumento (mes, en cadena) un valor cada vez que lo ejecuto
            SALIDA: números del día del mes
            Podemos aceptar varios argumentos, pero solo va a tomar el primero
            Si paso por parámetro enero, tiene que decir: "Enero tiene 31 días"
            Si paso por parámetro JUNIO, tiene que decir: "Junio tiene 30 días" */


// .trim() es un método para eliminar espacios en blanco