/**
 * Esta clase permite visualizar las principales características de la POO con la clase Book.
 * @author Wendy Arcila.
 * @version 14/07/2022
 */
public class Book {
    public String title, cover;
    protected String foreword;
    private int totalPages, pagesRead;

    /**
     * Constructor, instancia la clase y ejecuta los métodos.
     */
    public Book(){
        title="La casa de los espíritus";
        totalPages=300;
        foreword="Por Zoé Valdés";
        int percentage= readingRate(totalPages,pagesRead);
    }

    /**
     * Retorna el valor del atributo pagesRead
     * @return páginas leídas
     */
    public int getPagesRead() {
        return pagesRead;
    }

    /**
     * Asigna un valor al atributo pagesRead
     * @param pagesRead páginas leídas
     */
    public void setPagesRead(int pagesRead) {
        this.pagesRead = pagesRead;
    }

    /**
     * Calcula el porcentaje del libro que se ha leído
     * @param totalPages Total de páginas
     * @param pagesRead las páginas leídas
     * @return el porcentaje leído del libro.
     */
    protected int readingRate(int totalPages, int pagesRead){
        int percentage = pagesRead * 100/totalPages ;
        return percentage;
    }
}

