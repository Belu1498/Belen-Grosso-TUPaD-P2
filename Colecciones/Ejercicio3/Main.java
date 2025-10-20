public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Universidad uni = new Universidad("UTN");

        // crear profesores
        Profesor p1 = new Profesor("P1", "Ana Torres", "Matemática");
        Profesor p2 = new Profesor("P2", "Luis Pérez", "Programación");
        Profesor p3 = new Profesor("P3", "María Gómez", "Historia");

        // agregar profesores
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        // crear cursos
        Curso c1 = new Curso("C101", "Álgebra");
        Curso c2 = new Curso("C102", "POO en Java");
        Curso c3 = new Curso("C103", "Historia Moderna");
        Curso c4 = new Curso("C104", "Cálculo I");
        Curso c5 = new Curso("C105", "Bases de Datos");

        // agregar cursos
        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // asignar profesores a cursos
        uni.asignarProfesorACurso("C101", "P1");
        uni.asignarProfesorACurso("C104", "P1");
        uni.asignarProfesorACurso("C102", "P2");
        uni.asignarProfesorACurso("C105", "P2");
        uni.asignarProfesorACurso("C103", "P3");

       
        uni.listarProfesores();
        uni.listarCursos();

        // cambiar profesor de un curso
        System.out.println("\nCambio de profesor para C104...");
        uni.asignarProfesorACurso("C104", "P3");

        // eliminar curso
        uni.eliminarCurso("C105");

        // eliminar profesor
        uni.eliminarProfesor("P1");

        // reporte final
        uni.reporteCursosPorProfesor();
    }
    }
