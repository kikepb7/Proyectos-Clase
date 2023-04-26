package ejercicio4;

/**
 *
 * @author Enrique Palma
 */
public interface IMaquina {

   public void encender();
   
   public void apagar();
   
   default public String caracteristicas(){
       return ("FICHA DE LA MÁQUINA\n"
               + "---------------------\n");
   }
}