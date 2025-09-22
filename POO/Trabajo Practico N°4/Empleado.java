package caso.practico;

/**
 *
 * @author belen
 */
public class Empleado {
    int id;
    private static int contador = 0;
    String nombre, puesto;
    double salario;

         
    private static int totalEmpleados = 0;
    
    // Constructor 1:
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    // Constructor 2:
    public Empleado(String nombre, String puesto) {
        this(totalEmpleados + 1,nombre, puesto, 100000);
    }
    
    // Constructores actualizarSalario:
    
    public void actualizarSalarioPorc(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }
    
    public void actualizarSalario(int aumentoFijo) {
        this.salario += aumentoFijo;
    }
    
    // toString:
    
    @Override
    public String toString() {
        return "Empleado: " + 
                "ID = " + id + " " +
                "Nombre = " + nombre + " " +
                "Puesto = " + puesto + " " +
                "Salario = " + salario;
}



    public static int totalEmpleados() {
        return totalEmpleados;
}

    // Get y Set:

    public int getid() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }     
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    }
