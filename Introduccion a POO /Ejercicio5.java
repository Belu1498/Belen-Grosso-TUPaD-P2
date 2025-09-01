package ejercicio5;

/**
 *
 * @author belen
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NaveEspacial nav = new NaveEspacial();
        
        nav.nombre = "Hercules";
        
        nav.despegar();
        nav.avanzar(100);
        nav.recargarCombustible(100);
        nav.avanzar(100);
        nav.mostrarEstado();
        
    }
    
}
