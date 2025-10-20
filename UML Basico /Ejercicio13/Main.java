public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario u = new Usuario("Belu Grosso", "belu@gmail.com");

        GeneradorQR generador = new GeneradorQR();
        generador.generar("QR12345ABC", u);
    }
    
}
