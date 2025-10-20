public class ClaveSeguridad {
    private final String codigo;
    private final String ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    @Override
    public String toString() {
        return "ClaveSeguridad [Codigo=" + codigo + ", ÚltimaModificación=" + ultimaModificacion + "]";
    }
}
