import java.util.Scanner;
/**
 * Esta clase permite visualizar las principales características de la POO con la clase BankAccount
 * @author Wendy Arcila.
 * @version 14/07/2022
 */
public class BankAccount {
    private int accountNumber, password;
    private double balance;
    protected boolean activated;
    public Scanner input;

    /**
     * Constructor, evalúa si la cuenta se encuentra activa, de ser así permite visualizar el saldo.
     */
    public BankAccount(){
        if (activated){
            input=new Scanner(System.in);
            System.out.println("Número de cuenta: ");
            this.accountNumber=input.nextInt();
            System.out.println("Clave: ");
            this.password= input.nextInt();
            balance=0;
            seeBalance(balance);
        }else{
            System.out.println("Cuenta desactivada");
        }

    }

    /**
     * Retorna el valor del atributo activated.
     * @return si la cuenta está activa.
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * Asigna un valor al atributo activated
     * @param activated Actividad de la cuenta
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * Imprime en pantalla en saldo de la cuenta
     * @param balance Saldo de la cuenta
     */
    private void seeBalance(double balance){
        System.out.println("Su saldo actual es de " + balance);
    }
}
