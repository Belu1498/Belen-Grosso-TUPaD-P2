public class Libro {
    private final String isbn;
    private final String titulo;
    private final int anioPublicacion;
    private final Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " (" + anioPublicacion + ")");
        System.out.println("ISBN: " + isbn);
        System.out.println("Autor: " + autor);
        System.out.println("-----------------------------");
    }

    // Getters
    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public Autor getAutor() { return autor; }

    @Override
    public String toString() {
        return titulo + " - " + autor.getNombre();
    }
}
