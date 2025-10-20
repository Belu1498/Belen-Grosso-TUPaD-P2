import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author belen
 */
public class Biblioteca {

    private final String nombre;
    private final List<Libro> libros; // Composición: la biblioteca "posee" sus libros

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevo = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevo);
        System.out.println("Libro agregado: " + titulo);
    }

    
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            System.out.println("\n Libros en la biblioteca " + nombre + ":");
            for (Libro l : libros) {
                l.mostrarInfo();
            }
        }
    }

    
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null;
    }

    
    public void eliminarLibro(String isbn) {
        Libro encontrado = buscarLibroPorIsbn(isbn);
        if (encontrado != null) {
            libros.remove(encontrado);
            System.out.println("Libro eliminado: " + encontrado.getTitulo());
        } else {
            System.out.println("No se encontró el libro con ISBN " + isbn);
        }
    }

    
    public int obtenerCantidadLibros() {
        return libros.size();
    }

    
    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n Libros publicados en el año " + anio + ":");
        libros.stream()
                .filter(l -> l.getAnioPublicacion() == anio)
                .forEach(Libro::mostrarInfo);
    }

    
    public void mostrarAutoresDisponibles() {
        System.out.println("\n Autores en la biblioteca:");
        libros.stream()
                .map(Libro::getAutor)
                .distinct()
                .forEach(System.out::println);
    }
}
