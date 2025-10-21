public abstract class Figura {
     protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // metodo abstracto
    public abstract double calcularArea();

    // metodo concreto
    public void mostrarInfo() {
        System.out.println("Figura: " + nombre);
        System.out.println("Area: " + calcularArea());
        System.out.println("-----------------------");
    }
}
