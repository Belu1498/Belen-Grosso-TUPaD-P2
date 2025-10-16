public class Autor {
    private final String nombre;
    private final String nacionalidad;
    private Libro libro;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public Autor(String nombre, String nacionalidad, Libro libro) {
        this(nombre, nacionalidad);
        this.libro = libro;
        libro.setAutor(this);
    }
    
    
    
    public Libro getLibro() {
        return libro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    
    public void setLibro(Libro libro) {
        this.libro = libro;
        libro.setAutor(this);
    }
    
    
    @Override
    public String toString() {
        return "Autor [Nombre=" + nombre + ", Nacionalidad=" + nacionalidad + "]";
    }
}
