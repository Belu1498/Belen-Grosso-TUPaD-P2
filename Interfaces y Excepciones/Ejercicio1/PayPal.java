public class PayPal implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pagando $" + monto + " con PayPal.");
    }
}
