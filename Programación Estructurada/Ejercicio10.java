package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author belen
 */
public class Ejercicio10 {

    /**
     * @param stockActual
     * @param cantidadVendida
     * @param cantidadRecibida
     * @return 
     */
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        
        
        int nuevoStock = (stockActual - cantidadVendida) + cantidadRecibida;
        
        
        
        return nuevoStock;
        
        
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int stockActual;
        int cantidadVendida;
        int cantidadRecibida;
        int nuevoStock;
        
        System.out.print("Ingrese el stock actual del producto: ");
        stockActual = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad vendida: ");
        cantidadVendida = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad recibida: ");
        cantidadRecibida = Integer.parseInt(input.nextLine());
        
        nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.print("El nuevo stock del producto es: " + nuevoStock);
    }
    
}
