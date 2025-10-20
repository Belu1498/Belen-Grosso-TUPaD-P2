import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author belen
 */
public class Universidad {
     private final String nombre;
    private final List<Profesor> profesores;
    private final List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    // --- Métodos de gestión ---
    public void agregarProfesor(Profesor p) {
        if (p != null && !profesores.contains(p)) {
            profesores.add(p);
        }
    }

    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) return p;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) return c;
        }
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
            System.out.println(" Profesor " + profesor.getNombre() + " asignado a " + curso.getNombre());
        } else {
            System.out.println(" No se pudo asignar: datos inválidos.");
        }
    }

    public void listarProfesores() {
        System.out.println("\nProfesores en " + nombre + ":");
        for (Profesor p : profesores) {
            System.out.println("- " + p.getNombre() + " (" + p.getEspecialidad() + ")");
        }
    }
