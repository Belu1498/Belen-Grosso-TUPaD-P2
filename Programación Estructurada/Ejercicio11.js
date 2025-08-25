import java.util.Scanner;

/**
 *
 * @author belen
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    
    final static double DESCUENTO = 0.10;
    
    public static double calcularDescuentoEspecial(double precio) {
        
        double descEspecial = precio * DESCUENTO;
        return descEspecial;
        
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double precio;
        double precioFinal;
      
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        
        System.out.println("El descuento especial aplicado es: " + calcularDescuentoEspecial(precio));
         
        
        precioFinal = precio - calcularDescuentoEspecial(precio);
        
        System.out.print("El precio final con descuento es: " + precioFinal);
    }
    
}
