public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        // Dependencia de creación: el EditorVideo crea un Render
        Render render = new Render(formato, proyecto);
        render.mostrarInfo();
        System.out.println("Exportación finalizada con éxito.\n");
    }
}
