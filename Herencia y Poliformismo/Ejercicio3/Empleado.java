package ejercicio3;


public abstract class Empleado {
    protected String nombre;
    protected String dni;

    public Empleado(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Método abstracto: cada tipo de empleado calcula su sueldo distinto
    public abstract double calcularSueldo();

    // Método común para mostrar información
    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + " | DNI: " + dni);
        System.out.println("Sueldo: $" + calcularSueldo());
        System.out.println("---------------------------");
    }
}
