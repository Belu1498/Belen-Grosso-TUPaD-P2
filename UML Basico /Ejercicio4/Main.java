public class Ejercicioo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco banco = new Banco("Galicia", "21414328151");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("42251425889", "30/12");
        tarjeta.setBanco(banco);

        Cliente cliente = new Cliente("Belen Grosso", "41432515");
        cliente.setTarjetaDeCredito(tarjeta);

        System.out.println(cliente);
    
}
}
