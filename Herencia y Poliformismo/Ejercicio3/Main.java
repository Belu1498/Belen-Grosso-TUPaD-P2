import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana Gómez", "12345678", 250000, 20000));
        empleados.add(new EmpleadoTemporal("Luis Pérez", "87654321", 120, 1800));
        empleados.add(new EmpleadoPlanta("María López", "11223344", 300000, 50000));

        // polimorfismo
        for (Empleado e : empleados) {
            e.mostrarInfo();
        }

        // clasificacion usando instanceof
        System.out.println("=== Clasificación de empleados ===");
        for (Empleado e : empleados) {
            if (e instanceof EmpleadoPlanta) {
                System.out.println(e.nombre + " es empleado de planta. Bono: $" + ((EmpleadoPlanta) e).getBono());
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println(e.nombre + " es empleado temporal. Horas trabajadas: " + ((EmpleadoTemporal) e).getHorasTrabajadas());
            }
        }

    }
    
}
