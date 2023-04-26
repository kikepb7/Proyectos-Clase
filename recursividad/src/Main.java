import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduzca la altura: ");
            int a = sc.nextInt();

            System.out.println("Introduzca la base: ");
            int b = sc.nextInt();

            // Instanciamos la clase FiguraGeometrica
            FigurasGeometricas fg1 = new FigurasGeometricas();

            fg1.rectIterativa(a, b);
            System.out.println();
            fg1.rectRecursiva(a, b);
        }
        while(true);
    }
}