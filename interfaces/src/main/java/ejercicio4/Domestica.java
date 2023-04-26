package ejercicio4;

/**
 *
 * @author Enrique Palma
 */
public class Domestica extends Maquinaria implements IMaquina{
    
    // 1. Atributos
    double potencia = 0;
    private boolean encendido;
    
    
    
    // 2. Constructores
    public Domestica(){
    }

    public Domestica(String numeroSerie, String modelo, int horasFuncionamiento, double potencia) {
        super(numeroSerie, modelo, horasFuncionamiento);
        this.potencia = potencia;
    }
    
    // 3. Métodos
    @Override
    public void encender(){
        System.out.println("Se enciende la máquin ...");
        encendido = true;   
    }
    
    @Override
    public void apagar(){
        System.out.println("Se está apagando la máquina ...");
        encendido = false;
    }
    
    @Override
    public String caracteristicas(){
        return IMaquina.super.caracteristicas()
                + "Número de serie: " + numeroSerie + "\n"
                + "Modelo: " + modelo + "\n"
                + "Horas de funcionamiento: " + horasFuncionamiento + "\n"
                + "Estado de la máquina: " + isEncendido();
    }
  
    
    
    // 4. Getter & Setter
    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

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

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
}