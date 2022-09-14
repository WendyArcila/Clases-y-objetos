/**
 * Esta clase permite visualizar las principales características de la POO con la clase Plant.
 * @author Wendy Arcila.
 * @version 14/07/2022
 */
public class Plant {
    public int rootSize, stemSize1,stemSize2;
    protected String leafType;
    private boolean hasFlower;

    /**
     * Constructor, instancia la clase plant
     */
    public Plant(){
        rootSize=4;
        hasFlower= true;
    }

    /**
     * Busca conocer el crecimiento que ha tenido la planta
     * @return El crecimiento que ha tenido la planta
     */
    public int growth (){
        int growth = stemSize2 - stemSize1;
        return growth;
    }

    /**
     * Imprime en pantalla las veces que requiere ser regada la planta según el tipo de hoja.
     * @param leafType Tipo de hoja.
     */
    protected void watered(String leafType){
        if(leafType == "cuadrada"){
            System.out.println("Regar cada dos días");
        } else if (leafType == "redonda"){
            System.out.println("Regar una vez a la semana");
        }
    }
}
