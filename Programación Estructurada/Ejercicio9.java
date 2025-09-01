import java.util.Scanner;

/**
 *
 * @author belen
 */
public class Ejercicio9 {

    /**
     * @param peso
     * @param zona

     
     * @return 
     */
    
    public static double calcularCostoEnvio(double peso, String zona) {
        
        double costoEnvio = 0;
       
        
        switch (zona) {
            case "Nacional":
                costoEnvio = peso * 5.0;
                break;
            case "Internacional":
                costoEnvio = peso * 10.0;
                break; 
            default:
                System.out.print("Zona ingresada no valida.");
                break;
        }

        return costoEnvio;
    
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        
        
        
        return precioProducto + costoEnvio;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double precioProducto;
        double peso;
        String zona;

        
        
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        peso = Double.parseDouble(input.nextLine());
        
        
        System.out.println("Ingrese la zona de envío (Nacional/Internacional): ");
        zona = input.nextLine();
        
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        
        System.out.println("El costo de envío es: " + costoEnvio);
        
        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El total a pagar es: " + totalCompra);
    }    
        
    }
