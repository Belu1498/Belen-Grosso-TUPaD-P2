public class FirmaDigital {
    private final String codigoHash;
    private final String fecha;
    private Usuario usuario; // Agregación

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "FirmaDigital [Hash=" + codigoHash +
               ", Fecha=" + fecha +
               ", Usuario=" + usuario.getNombre() +
               " (" + usuario.getEmail() + ")]";
    }
}
