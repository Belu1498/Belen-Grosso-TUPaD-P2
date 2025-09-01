
package ejercicio12;

/**
 *
 * @author belen
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
                
        double[] precios = {20.5,83.0, 91.6, 1260.6, 220.7, 990.5};

        System.out.println("Precios originales:");
        
        // uso de for-each
        for (double precio : precios) {
            System.out.println("$" + precio);
        }
        
        precios[3] = 300.9;
        
        System.out.println("Precios modificados:");
        
         for (double precio : precios) {
            System.out.println("$" + precio);
        }
    }
    
}
