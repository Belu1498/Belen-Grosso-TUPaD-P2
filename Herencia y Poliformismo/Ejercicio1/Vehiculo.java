public class Vehiculo {
    protected String marca;
    protected String modelo;

    // el constructor
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // metodo para mostrar informacion
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
