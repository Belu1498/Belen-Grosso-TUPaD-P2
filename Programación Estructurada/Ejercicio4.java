import java.util.Scanner;

/**
 *
 * @author belen
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio, descuento, resultado, precioDescuento;
        char categoria;
        
        
        System.out.println("Descuentos aplicables:");
        System.out.println("Categoria 'A': 10% descuento");
        System.out.println("Categoria 'B': 15% descuento");
        System.out.println("Categoria 'C': 20% descuento");
        System.out.println("");
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Integer.parseInt(input.nextLine());
        
        
        
        System.out.print("Ingrese la categoria del producto(A, B o C): ");
        categoria = input.nextLine().charAt(0);
        
        switch (categoria) {

            case 'A':
               
                descuento = (precio * 10.0) / 100;
                precioDescuento = descuento;
                resultado = precio - precioDescuento;
                System.out.println("Descuento aplicado: 10%");
                System.out.println("Precio final: $" + resultado);
                break;
            case 'B':
                
                descuento = (precio * 10.0) / 100;
                precioDescuento = descuento;
                resultado = precio - precioDescuento;
                System.out.println("Descuento aplicado: 15%");
                System.out.println("Precio final: $" + resultado);
                break;
            case 'C':
                descuento = (precio * 10.0) / 100;
                precioDescuento = descuento;
                resultado = precio - precioDescuento;
                System.out.println("Descuento aplicado: 20%");
                System.out.println("Precio final: $" + resultado);
                break;
                default: 
                    System.out.print("Ingrese una categoria valida");
        }
  
    }
    
}
