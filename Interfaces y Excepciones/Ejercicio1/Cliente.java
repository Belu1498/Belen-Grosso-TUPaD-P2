public class Cliente implements Notificable {
    private final String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificacion para " + nombre + ": " + mensaje);
    }
}
