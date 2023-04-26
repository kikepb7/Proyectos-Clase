package ejercicio4;

/**
 *
 * @author Enrique Palma
 */
public class Maquinaria{
    
    // 1. Atributos
    public String numeroSerie = "";
    public String modelo = "";
    public int horasFuncionamiento = 0;
    
    
    // 2. Constructores
    public Maquinaria() {
    }
    
    public Maquinaria(String numeroSerie, String modelo, int horasFuncionamiento) {
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
        this.horasFuncionamiento = horasFuncionamiento;
    }
    

    

    // 4. Getter & Setter
    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getHorasFuncionamiento() {
        return horasFuncionamiento;
    }

    public void setHorasFuncionamiento(int horasFuncionamiento) {
        this.horasFuncionamiento = horasFuncionamiento;
    }
}