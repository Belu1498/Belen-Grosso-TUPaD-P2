public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Contribuyente contrib = new Contribuyente("Belen Grosso", "27-40123456-3");
        Impuesto impuesto = new Impuesto(139800.50, contrib);
        Calculadora calc = new Calculadora();

        calc.calcular(impuesto);
    }
    
}
