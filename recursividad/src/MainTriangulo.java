import java.util.Scanner;

public class MainTriangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduzca la base del triángulo: ");
            int a = sc.nextInt();

            // Instanciamos la clase FiguraGeometrica
            FigurasGeometricas fg1 = new FigurasGeometricas();

            fg1.triIterativa(a);
            System.out.println();
            fg1.triRecursiva(a);
        }
        while(true);
    }
}