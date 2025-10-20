public class Paciente {
    private final String nombre;
    private final String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Paciente [Nombre=" + nombre + ", ObraSocial=" + obraSocial + "]";
    }
}
