package caso.practico;

/**
 *
 * @author belen
 */
public class CasoPractico {

  
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Susana", "Secretaria");
        Empleado emp2 = new Empleado(20, "Juan", "Ingeniero", 200000);
        Empleado emp3 = new Empleado(25, "Marcos", "Conserge", 150000);
                
        emp1.actualizarSalarioPorc(10);
        emp2.actualizarSalario(15000);
        emp3.actualizarSalarioPorc(5);
                
        System.out.println(emp1);      
        System.out.println(emp2);    
        System.out.println(emp3);
        
        System.out.print("Total de empleados: " + Empleado.totalEmpleados());
    }
    
    
}
