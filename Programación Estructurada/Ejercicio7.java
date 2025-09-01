import java.util.Scanner;

/**
 *
 * @author belen
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nota = 0;  
        do {
            
          {
                System.out.print("Ingrese una nota (0-10): ");
                nota = Integer.parseInt(input.nextLine());
                
               if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10. ");
               }
                
            } 
} while (nota < 0 || nota > 10);
        
         System.out.println("Nota guardada correctamente. ");
        }
}
