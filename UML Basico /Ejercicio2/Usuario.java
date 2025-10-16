package ejercicio2;

/**
 *
 * @author belen
 */
public class Usuario {
    private final String nombre;
    private final String dni;
    private Celular celular; // vínculo bidireccional

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        if (celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }

    @Override
    public String toString() {
        return " Nombre=" + nombre + ", dni=" + dni;
    }

   
}
