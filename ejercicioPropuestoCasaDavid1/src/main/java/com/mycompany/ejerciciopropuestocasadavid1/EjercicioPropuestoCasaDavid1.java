package com.mycompany.ejerciciopropuestocasadavid1;

public class EjercicioPropuestoCasaDavid1 {

    public static void main(String[] args) {
        
        if(args != null && args.length > 0){
            
            String month = args[0].toLowerCase();
            String days = " ";
            
            switch(month){
                case "enero", "marzo", "mayo", "julio", "agosto", "octubre", "diciembre": days = "31";
                case "febrero": days = "28/29";
                case "abril", "junio", "septiembre", "noviembre": days = "30";
            }
            
            if(!days.isEmpty()){
                System.out.println(Capitalize(month) + " tiene " + days + " días");
            }
            else{
                System.out.println(month + " no es un mes correcto.");
            }
        } else{
            System.out.println("Ningún argumento ingresado.");
        }
    }
    
    private static String Capitalize(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
}
