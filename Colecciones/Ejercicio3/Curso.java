package ejercicio3;

/**
 *
 * @author belen
 */
public class Curso {
    private final String codigo;
    private final String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void setProfesor(Profesor p) {
        // Si ya tenía profesor, se elimina de su lista
        if (this.profesor != null && this.profesor != p) {
            this.profesor.eliminarCurso(this);
        }

        this.profesor = p;

        // Si el nuevo profesor no lo tiene en su lista,se agrega
        if (p != null && !p.getCursos().contains(this)) {
            p.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        System.out.println("Curso: " + nombre + " (" + codigo + ")");
        if (profesor != null) {
            System.out.println("Profesor: " + profesor.getNombre());
        } else {
            System.out.println("Profesor: [Sin asignar]");
        }
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    @Override
    public String toString() {
        return codigo + " - " + nombre + 
               (profesor != null ? " (" + profesor.getNombre() + ")" : " [Sin profesor]");
    }
}
