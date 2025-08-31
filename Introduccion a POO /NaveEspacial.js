package ejercicio5;

/**
 *
 * @author belen
 * 
 */
    


    public class NaveEspacial {
    String nombre;
    int combustible;
    int limiteCombustible = 100;


    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado.");
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        int consumo = distancia / 2;
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " km.");
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia + " km.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad inválida para recargar.");
        } else if (combustible + cantidad > limiteCombustible) {
            combustible = limiteCombustible;
            System.out.println("Combustible recargado al máximo.");
        } else {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Estado de " + nombre + ":");
        System.out.println("Combustible: " + combustible + "/" + limiteCombustible);
    }
}
