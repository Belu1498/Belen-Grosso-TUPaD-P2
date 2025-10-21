package ejercicio3;

public class EmpleadoPlanta extends Empleado {
    private final double sueldoMensual;
    private final double bono;

    public EmpleadoPlanta(String nombre, String dni, double sueldoMensual, double bono) {
        super(nombre, dni);
        this.sueldoMensual = sueldoMensual;
        this.bono = bono;
    }

    @Override
    public double calcularSueldo() {
        return sueldoMensual + bono;
    }

    public double getBono() {
        return bono;
    }
}
