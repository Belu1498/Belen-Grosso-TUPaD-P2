package ejercicio4;

/**
 *
 * @author belen
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gallina gall1 = new Gallina();
        Gallina gall2 = new Gallina();
        
       gall1.idGallina = "Gallina #1";
       gall2.idGallina = "Gallina #2";
       
        
       gall1.envejecer();
       gall1.ponerHuevo();
       gall1.ponerHuevo();
        
       gall2.envejecer();
       gall2.ponerHuevo();
       
      gall1.mostrarEstado();
      gall2.mostrarEstado();
    }
    
}
