public class FigurasGeometricas {

    /*
        Método rect(b,a) muestra un rectángulo de b*a asteriscos
     */

    // FORMA ITERATIVA
    public void rectIterativa(int a, int b){
        for(int i=0; i<a; i++){ // Creamos un bucle que muestre asteriscos con los valores a y b
            for(int j=0; j<b; j++) {
                System.out.print("*");
            }
                System.out.println(); // Mostramos por pantalla hacer un salto de línea por cada bucle
        }
    }


    // FORMA RECURSIVA
    public void rectRecursiva(int a, int b){
        // CASO BASE --> No hay columnas para mostrar
        if(a<=0){
            System.out.println("Te peines y metas un número en condiciones, coone!");
        }
        else{
            base(b); // Mostramos por pantalla la base con "b" asteriscos
            System.out.println();
            rectRecursiva(a-1, b); // Llamamos de nuevo al método restándole una fila
        }
    }

    public void base(int b){
        // CASO BASE --> No hay base para mostrar
        if(b<=0){
            return;
        }
        else{
            System.out.print("*"); // Mostramos por pantalla un asterisco
            base(b-1); // Llamamos de nuevo al método restando un asterisco
        }
    }





    /*
        Método tri(b, a) muestra un triángulo rectángulo de base b y altura a
     */
    // FORMA ITERATIVA
    public void triIterativa(int a){
        for(int i=0; i<=a; i++) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // FORMA RECURSIVA
    public void triRecursiva(int a) {
        // CASO BASE
        if(a<=0){
            return;
        }
        else{
            triRecursiva(a-1);
            base2(a);
            System.out.println();
        }
    }

    public void base2(int a){
        if(a<=0){
            return;
        }
        else{
            base2(a-1);
            System.out.print("*");
        }
    }




    // SOLUCIÓN REFACTORIZANDO
    public static void dibujarLinea(int longitud){
        if(longitud > 0){ // Si el número que introducimos es mayor que 0, mostramos por pantalla los * y llamamos inmediatamente al método restando de uno en uno
            System.out.print("* ");
            dibujarLinea(longitud - 1);
        }
        else{ // Si el número es menor o igual que 0, hacemos un salto de línea
            System.out.println();
        }
    }

    public static void dibujarRectangulo(int longitud, int altura){
        if(altura > 0){
            dibujarLinea(longitud);
            dibujarRectangulo(longitud, altura - 1);
        }
    }

    public static void dibujarTrianguloRectangulo(int altura) {
        if (altura > 0) {
            dibujarLinea(altura);
            dibujarTrianguloRectangulo(--altura);
        }
    }
}