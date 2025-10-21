// subclase que hereda de Vehiculo
public class Auto extends Vehiculo {
    private final int cantidadPuertas;

    // el constructor
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo); // Llama al constructor de la clase base
        this.cantidadPuertas = cantidadPuertas;
    }

    // sobrescritura del metodo mostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Reutiliza el código de la clase padre
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
    }
}
