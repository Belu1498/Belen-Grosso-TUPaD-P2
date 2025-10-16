public class Libro {
    private final String titulo;
    private final String isbn;
    private Editorial editorial;      
    private Autor autor; 

    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
      
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
        if (editorial != null && editorial.getLibro() != this) {
            editorial.setLibro(this);
        }
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro [Titulo=" + titulo + ", ISBN=" + isbn + 
               ", Autor=" + (autor != null ? autor.getNombre() : "sin autor") + 
               ", Editorial=" + (editorial != null ? editorial.getNombre() : "sin editorial") + "]";
    }
}
