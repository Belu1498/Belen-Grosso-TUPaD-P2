package ejercicio13;

/**
 *
 * @author belen
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] precios = {20.5, 83.0, 91.6, 1260.6, 220.7, 990.5};

        // imprimir precios originales
        System.out.println("Precios originales:");
        imprimirPrecios(precios, 0);
        
        // cambiar el precio
        modificarPrecio(precios, 3, 300.9);
        
        System.out.println("Precios modificados:");
        // imprimir todos los precios con el modificado
        imprimirPrecios(precios, 0);
        
    }

    // caso base
    public static void imprimirPrecios(double[] precios, int indice) {
        if (indice >= precios.length) {
            return;
        } 
        System.out.println("Precio: $" + precios[indice]);
        imprimirPrecios(precios, indice + 1);
    }
    
    // caso base
    public static void modificarPrecio(double[] precios, int indice, double nuevoValor) {
        if (indice >= 0 && indice < precios.length) {
            precios[indice] = nuevoValor;
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }
}
