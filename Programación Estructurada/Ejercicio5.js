import java.util.Scanner;

/**
 *
 * @author belen
 */
public class Ejercicio5_2 {

    /**
     * @param args the command line arguments
     */
    
    static final int CORTE = 0;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            
        int num = 0;
        int suma = 0;
        
        do {
            
           System.out.print("Ingresa un numero (0 para terminar): ");
           num = Integer.parseInt(input.nextLine());
   
       
        if (num % 2 == 0 && num != CORTE) {
            suma = suma + num;
        }
        } while (num != CORTE);
           
           System.out.println("La suma de los numeros pares es: " + suma);
  
        }
        
        }
