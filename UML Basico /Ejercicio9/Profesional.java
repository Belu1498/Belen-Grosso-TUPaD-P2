public class Profesional {
    private final String nombre;
    private final String especialidad;

    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Profesional [Nombre=" + nombre + ", Especialidad=" + especialidad + "]";
    }
}
