package ejercicio4;

/**
 *
 * @author belen
 */
public class Gallina {
    
    String idGallina;
    int edad;
    int huevosPuestos;
    
   public void ponerHuevo() {
        
            huevosPuestos++;
            
            System.out.println(idGallina + " puso un huevo.");
            
        
        
    
   }
    
    public void envejecer() {
        
        edad++;
        System.out.println(idGallina + " envejecio. Edad actual: " + edad);
          
            
        }
    
    
   public void mostrarEstado() {
        
       System.out.println("Gallina: " + idGallina + " Edad: " + edad + " Huevos Puestos: " + huevosPuestos);
        
    }
    
}
