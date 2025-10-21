package ejercicio3;

public class EmpleadoTemporal extends Empleado {
    private final double horasTrabajadas;
    private final double valorHora;

    public EmpleadoTemporal(String nombre, String dni, double horasTrabajadas, double valorHora) {
        super(nombre, dni);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * valorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }
}
