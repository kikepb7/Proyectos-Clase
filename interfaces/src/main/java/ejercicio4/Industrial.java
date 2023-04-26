package ejercicio4;

/**
 *
 * @author Enrique Palma
 */
public class Industrial extends Maquinaria implements IMaquina{

    // 1. Atributos
    private double consumo = 0;
    private boolean armado;
    
    
    
    // 2. Constructores
    public Industrial(){
    }

    public Industrial(String numeroSerie, String modelo, int horasFuncionamiento) {
        super(numeroSerie, modelo, horasFuncionamiento);
        this.consumo = consumo;
    }
    
    
    
    
    // 3. Métodos
    @Override
    public void encender(){
        System.out.println("Armando sistema ...");
        armado = true;
    }
    
    @Override
    public void apagar(){
        System.out.println("Apagando sistema ...");
        armado = false;
    }

    @Override
    public String caracteristicas(){
        return IMaquina.super.caracteristicas()
                + "Número de serie: " + numeroSerie + "\n"
                + "Modelo: " + modelo + "\n"
                + "Horas de funcionamiento: " + horasFuncionamiento + "\n"
                + "Estado de la máquina: " + isArmado();
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
    
    public double getConsumo(){
        return consumo;
    }
    
    public void setConsumo (double consumo){
        this.consumo = consumo;
    }

    public boolean isArmado() {
        return armado;
    }

    public void setArmado(boolean armado) {
        this.armado = armado;
    }
}