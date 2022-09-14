import java.util.ArrayList;
import java.util.Scanner;
/**
 * Esta clase permite visualizar las principales características de la POO con la clase Fruit.
 * @author Wendy Arcila.
 * @version 14/07/2022
 */
public class Fruit {
    public String names;
    private float averageWeight;
    public ArrayList<String> colors;
    public Scanner input;

    /**
     * Constructor, instancia la clase y solicita el nombre de la fruta.
     */
    public Fruit(){
        input=new Scanner(System.in);
        this.colors=new ArrayList<String>();
        System.out.println("Fruta: ");
        this.names= input.nextLine();
    }

    /**
     * Retorna el valor del atributo colors
     * @return los colores de la fruta
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Asigna un valor al atributo colors
     * @param colors colores de la fruta
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    /**
     * Retorna el valor del atributo averageWeight
     * @return El peso promedio de la fruta
     */

    public float getAverageWeight() {
        return averageWeight;
    }

    /**
     * Asigna un valor al atributo averageWeight
     * @param averageWeight Peso promedio de la fruta
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }
}
