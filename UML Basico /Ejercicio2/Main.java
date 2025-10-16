package ejercicio2;

/**
 *
 * @author belen
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Bateria bateria = new Bateria("5200 mAh", "68W");

        Celular celular = new Celular("1234567891011121314", "Motorola", "Edge 60");
        Usuario usuario = new Usuario("Belen Grosso", "40123456");

        celular.setBateria(bateria);       // agregación
        celular.setUsuario(usuario); // asociación bidireccional

        System.out.println(celular);
        
    }
    
}
