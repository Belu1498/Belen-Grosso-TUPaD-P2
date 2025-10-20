public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proyecto proyecto1 = new Proyecto("Video musical", 3);

        EditorVideo editor = new EditorVideo();
        editor.exportar("MP4", proyecto1);
    }
    
}
