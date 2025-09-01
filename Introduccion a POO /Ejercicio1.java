package ejercicio1_1;

import java.util.Scanner;

/**
 *
 * @author belen
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        Scanner input = new Scanner(System.in);
        
        double nota;
        
        System.out.print("Ingrese nombre: ");
        e.nombre = input.nextLine();
        
        System.out.print("Ingrese apellido: ");
        e.apellido = input.nextLine();
        
        System.out.print("Ingrese curso: ");
        e.curso = input.nextInt();
        
        
        System.out.print("Ingrese nota: ");
        e.nota = input.nextDouble();
        
        e.subirCalificacion(6);
        e.bajarCalificacion(3);
        
        e.mostrarInfo();
    }
    
}
