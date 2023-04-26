package ejercicio4;

/**
 *
 * @author Enrique Palma
 */
public class Lanzadera {

    public static void main(String[] args) {
        
        Industrial i = new Industrial("SDF23", "DDV", 5);
        System.out.println(i.caracteristicas());
        
        System.out.println("");
        
        Domestica d = new Domestica("123A", "Bosch 9000", 12, 20);
        System.out.println(d.caracteristicas());
        
        System.out.println(i.getClass());
        
        Maquinaria m = new Maquinaria();
        
        m.getHorasFuncionamiento();
        
        
    }
}