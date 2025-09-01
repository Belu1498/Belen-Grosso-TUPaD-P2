import java.util.Scanner;

/**
 *
 * @author belen
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anio;
        
        System.out.print("Ingrese el anio: ");
        anio = Integer.parseInt(input.nextLine());
               
        if (anio % 4 == 0 && anio % 100 > 0) {
            
            System.out.print("El anio " + anio + " es bisiesto.");
            
            if (anio % 100 == 0 && anio % 400 == 0) {
            
            System.out.print("El anio " + anio + " es bisiesto."); 
        }
            } else { 
             System.out.print("El anio " + anio + " no es bisiesto.");    
            
        }            
        }
        
    }
