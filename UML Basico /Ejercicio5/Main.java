public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PlacaMadre placa = new PlacaMadre("ATX", "X870");
        Computadora compu = new Computadora("Ryzen", "100-100000591WOF", placa );
        Propietario propiet = new Propietario("Belen Grosso", "40123456");

        compu.setPropietario(propiet);

        
        System.out.println(propiet.getComputadora());
    }
    }
