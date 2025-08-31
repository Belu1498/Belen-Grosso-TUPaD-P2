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
        Libro lib = new Libro();
        
        
      lib.getTitulo();
      lib.getAutor();
        
      
      lib.setAnioPublicacion(7); // año invalido
      
      lib.getTitulo();
      lib.getAutor();
      
      lib.setAnioPublicacion(1943);
        
        
    }
    
}
