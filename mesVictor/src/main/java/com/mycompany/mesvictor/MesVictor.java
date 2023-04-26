package com.mycompany.mesvictor;

public class MesVictor {

    public static void main(String[] args) {

        String month = args[0];
        int days = 0;
        month = month.toLowerCase();
        
            switch(month){
                case "enero", "marzo", "mayo", "julio", "agosto", "octubre", "diciembre":
                    days = 31;
                    break;
                case "febrero":
                    days = 28;
                    break;
                case "abril", "junio", "septiembre", "noviembre":
                    days = 30;
                    break;
                default: days = -1;
            }
            // Formatear mes para mostrar
            String showMonth = month.substring(0,1).toUpperCase() + month.substring(1);

            if(days != -1){
                System.out.println("El mes de " + showMonth + " tiene " + days + " dias.");
            }
            else{
                System.out.println(showMonth + " no existe.");
            }
     }
}