public class CodigoQR {
    private final String valor;
    private final Usuario usuario; // Asociación unidireccional

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public void mostrarDatos() {
        System.out.println("Código QR: " + valor);
        System.out.println("Generado para el usuario: " + usuario.getNombre());
    }

    // Getters
    public String getValor() { return valor; }
    public Usuario getUsuario() { return usuario; }
}
