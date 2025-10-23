public class Producto  implements Pagable  {
    private final String nombre;
    private final double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // interfaz
    @Override
    public double calcularTotal() {
        return precio;
    }
}
