import java.util.Date;
import java.util.Scanner;
/**
 * Esta clase permite visualizar las principales características de la POO con la clase Person
 * @author Wendy Arcila.
 * @version 14/07/2022
 */
public class Person {
    public String names, lastName1, lastName2;
    public Date dateBirth;
    private float height;
    public Scanner input;

    /**
     * Constructor, solicita información de registro al usuario.
     */
    public Person() {
        input=new Scanner(System.in);
        System.out.println("Nombre:");
        this.names= input.nextLine();
        System.out.println("Primer apellido:");
        this.lastName1=input.nextLine();
        System.out.println("Segundo apellido:");
        this.lastName2=input.nextLine();
    }

    /**
     * Asigna un valor al atributo names.
     * @param names nombre de la persona
     */
    public void setNames(String names) {
        this.names = names;
    }

    /**
     * Retorna el valor del atributo names.
     * @return nombre de la persona
     */
    public String getNames() {
        return names;
    }

    /**
     * Retorna el valor del atributo lastName1.
     * @return El primer apellido de la persona
     */
    public String getLastName1() {
        return lastName1;
    }

    /**
     * Asigna un valor al atributo lastName1.
     * @param lastName1 Primer apellido de la persona
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    /**
     * Retorna el valor del atributo lastName2.
     * @return Segundo apellido de la persona
     */
    public String getLastName2() {
        return lastName2;
    }

    /**
     *  Asigna un valor al atributo lastName1.
     * @param lastName2 Segundo apellido de la persona
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }
}
