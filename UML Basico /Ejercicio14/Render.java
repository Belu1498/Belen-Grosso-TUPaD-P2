public class Render {
    private final String formato;
    private final Proyecto proyecto; // Asociación unidireccional

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    public void mostrarInfo() {
        System.out.println("Renderizando proyecto: " + proyecto.getNombre());
        System.out.println("Duración: " + proyecto.getDuracionMin() + " minutos");
        System.out.println("Formato de salida: " + formato);
    }

    // Getters
    public String getFormato() { return formato; }
    public Proyecto getProyecto() { return proyecto; }
}
