/**
 * Esta clase permite visualizar las principales características de la POO con la clase Skates.
 * @author Wendy Arcila.
 * @version 14/07/2022
 */
public class Skates {
    public int wheelsNumber;
    protected String bootType;
    private double speed;

    /**
     * Constructor, instancia la clase y ejecuta los métodos.
     */
    public Skates(){
        wheelsNumber=3;
        bootType= "Larga";
        speed=0;
        start();
        stop();
    }

    /**
     * Retorna el valor del atributo
     * @return Velocidad de los patines
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Asigna un valor al atributo speed.
     * @param speed Velocidad de los patines
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * Imprime en pantalla que se inició el movimiento
     */
    private void start(){
        if (speed >0){
            System.out.println("Moving");
        }
    }

    /**
     * Imprime en pantalla que no hay movimiento.
     */
    private void stop(){
        if (speed == 0 ){
            System.out.println("Stopped");
        }
    }

}
