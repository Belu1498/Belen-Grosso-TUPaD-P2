public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        Usuario usuario = new Usuario("Belen Grosso", "belen@gmail.com");
        Documento documento = new Documento("Contrato Laboral", "Contenido confidencial", usuario, "A1B2C3D4", "20/10/2025");

        System.out.println(documento);
        System.out.println("Usuario asociado: " + documento.getFirma().getUsuario());
    }
    }
    
