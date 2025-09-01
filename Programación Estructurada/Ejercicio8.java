import java.util.Scanner;

/**
 *
 * @author belen
 */
public class Ejercicio8 {

    /**
     * @param impuesto
     * @param descuento

     * @param precioBase
     * @return 
     */
    
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {

       double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
       return precioFinal;
     
}
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double impuesto;
        double descuento;
        double precioBase;
       
        
        System.out.print("Ingrese el precio base de un producto: ");
        precioBase = input.nextDouble();
        
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        impuesto = input.nextDouble() / 100;
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        descuento = input.nextDouble() / 100;
        
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
       
        System.out.print("El precio final del producto es: $" + precioFinal);
       
        
      
           
       }
        
        
        
    }
