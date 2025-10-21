package ejercicio3;


public abstract class Empleado {
    protected String nombre;
    protected String dni;

    public Empleado(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // metodo abstracto
    public abstract double calcularSueldo();

    // metodo comun para mostrar informacion
    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + " | DNI: " + dni);
        System.out.println("Sueldo: $" + calcularSueldo());
        System.out.println("---------------------------");
    }
}
