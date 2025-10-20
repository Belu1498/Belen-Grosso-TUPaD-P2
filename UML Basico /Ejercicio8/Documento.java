public class Documento {
     private final String titulo;
    private final String contenido;
    private final FirmaDigital firma; // Composición

    public Documento(String titulo, String contenido, Usuario usuario, String codigoHash, String fecha) {
        this.titulo = titulo;
        this.contenido = contenido;
        // Composición: el Documento crea su propia FirmaDigital
        this.firma = new FirmaDigital(codigoHash, fecha, usuario);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public FirmaDigital getFirma() {
        return firma;
    }

    @Override
    public String toString() {
        return "Documento [Título=" + titulo +
               ", Contenido=" + contenido +
               ", Firma=" + firma + "]";
    }
}
