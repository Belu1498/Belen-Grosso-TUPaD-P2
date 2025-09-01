package ejercicio3;

/**
 *
 * @author belen
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    
    String getTitulo() {
        
        System.out.println("El principito");
        return titulo;
        
    }
    
    String getAutor() {
        
        System.out.println("Antoine de Saint Exupery");
        return autor;
    }
    
    
    void setAnioPublicacion(int nuevoAnio) { // validacion de año
        
        if (nuevoAnio > 1500) {
           anioPublicacion = nuevoAnio;
           System.out.print(nuevoAnio);
        
        
    } else {
            System.out.println("Año invalido.");
        }
       
}
}
