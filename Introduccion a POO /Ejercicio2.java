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
        Mascota masc = new Mascota();
        
        masc.nombre = "Bruno";
        masc.especie = "Breton";
        masc.edad = 6;
        masc.mostrarInfo();
           
        masc.cumplirAnios(8);

        
    }
    
}

