import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author belen
 */
public class Profesor {


    private final String id;
    private final String nombre;
    private final String especialidad;
    private final List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    // --- Métodos principales ---
    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) {
                c.setProfesor(this); // sincroniza el otro lado
            }
        }
    }

    public void eliminarCurso(Curso c) {
        if (c != null && cursos.remove(c)) {
            if (c.getProfesor() == this) {
                c.setProfesor(null); // quita referencia del curso
            }
        }
    }

    public void listarCursos() {
        System.out.println("Cursos del profesor " + nombre + ":");
        for (Curso c : cursos) {
            System.out.println("- " + c.getCodigo() + " | " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " (" + id + ")");
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cantidad de cursos: " + cursos.size());
    }

    // --- Getters y setters ---
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public List<Curso> getCursos() { return cursos; }
    public String getEspecialidad() {return especialidad; }

    @Override
    public String toString() {
        return nombre + " (" + especialidad + ")";
    }
}
