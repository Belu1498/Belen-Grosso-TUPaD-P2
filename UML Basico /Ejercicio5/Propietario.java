public class Propietario {
        private final String nombre;
    private final String dni;
    private Computadora compu; // vínculo bidireccional

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Computadora getComputadora() {
        return compu;
    }

    public void setComputadora(Computadora compu) {
        this.compu = compu;
        if (compu != null && compu.getPropietario() != this) {
            compu.setPropietario(this);
        }
    }

    @Override
    public String toString() {
        return "Propietario [nombre=" + nombre + ", dni=" + dni + "]";
    }
}
