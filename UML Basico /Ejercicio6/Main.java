public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Belen Grosso", "1122334455");
        Mesa mesa = new Mesa("11 ", "4 personas");
        
        Reserva reserva = new Reserva("20-9", "20:00hrs", cliente);
        
        reserva.setMesa(mesa);
        
        System.out.println(reserva);
    }
    
}
