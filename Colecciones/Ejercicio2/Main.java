public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        Autor a1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor a2 = new Autor("A002", "J.K. Rowling", "Británica");
        Autor a3 = new Autor("A003", "Julio Cortázar", "Argentina");

        biblioteca.agregarLibro("L001", "Cien años de soledad", 1967, a1);
        biblioteca.agregarLibro("L002", "El amor en los tiempos del cólera", 1985, a1);
        biblioteca.agregarLibro("L003", "Harry Potter y la piedra filosofal", 1997, a2);
        biblioteca.agregarLibro("L004", "Rayuela", 1963, a3);
        biblioteca.agregarLibro("L005", "Bestiario", 1951, a3);

        biblioteca.listarLibros();
       
        System.out.println("\n Buscar libro por ISBN L004:");
        Libro buscado = biblioteca.buscarLibroPorIsbn("L004");
        if (buscado != null) buscado.mostrarInfo();
        
        biblioteca.filtrarLibrosPorAnio(1967);
        
        System.out.println("\n Eliminar libro con ISBN L002:");
        biblioteca.eliminarLibro("L002");
        biblioteca.listarLibros();
      
        System.out.println("\nTotal de libros en la biblioteca: " + biblioteca.obtenerCantidadLibros());

        biblioteca.mostrarAutoresDisponibles();
    }
    }
