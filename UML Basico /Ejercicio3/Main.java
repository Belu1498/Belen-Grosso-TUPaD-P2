package ejercicio3;

/**
 *
 * @author belen
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Editorial editorial = new Editorial("El Ateneo", "Manuel Acevedo 71");

        Libro libro = new Libro("1984", "978-0-452-28423-4");
        libro.setEditorial(editorial);

        Autor autor = new Autor("Jorge Orwell", "Británico", libro);

        System.out.println(libro);
        System.out.println(autor.getLibro());
    }
    
}
