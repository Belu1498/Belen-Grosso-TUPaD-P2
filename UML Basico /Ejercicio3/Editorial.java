public final class Editorial {
    private final String nombre;
    private final String direccion;
    private Libro libro; // asociación bidireccional

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public Libro getLibro() {
        return libro;
    }

     public void setLibro(Libro libro) {
        this.libro = libro;
        
    }

    @Override
    public String toString() {
        return "Editorial [Nombre=" + nombre + ", Direccion=" + direccion + "]";
    }
}
