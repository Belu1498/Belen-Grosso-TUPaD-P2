import java.util.Scanner;

/**
 *
 * @author belen
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] numeros = new int[11];
        int numPositivo = 0;
        int numNegativo = 0;
        int cero2 = 0;

        for (int cont = 1; cont < numeros.length; cont++) {
            System.out.print("Ingresa un número " + cont + ": ");
            numeros[cont] = input.nextInt();
        }

        // Contar positivos, negativos y ceros
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                numPositivo++;
            } else if (numeros[i] < 0) {
                numNegativo++;
            } else {
                cero2++;
            }
        }

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Positivos: " + numPositivo);
        System.out.println("Negativos: " + numNegativo);
        System.out.println("Ceros: " + cero2);
    }
}
