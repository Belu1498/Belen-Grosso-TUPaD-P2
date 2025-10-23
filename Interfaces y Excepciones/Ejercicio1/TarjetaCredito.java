public class TarjetaCredito implements PagoConDescuento {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pagando $" + monto + " con tarjeta de credito.");
    }

    @Override
    public double aplicarDescuento(double monto) {
        double totalConDescuento = monto * 0.9; // 10% de descuento
        System.out.println("se aplico descuento. Total: $" + totalConDescuento);
        return totalConDescuento;
    }
}
