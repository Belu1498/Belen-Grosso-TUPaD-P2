public class Ejercicio1 {

    public static void main(String[] args) {
       Cliente cliente1 = new Cliente("Belu");

        // productos
        Producto p1 = new Producto("Zapatos", 2580);
        Producto p2 = new Producto("Remera", 1000);

        // pedido
        Pedido pedido = new Pedido(cliente1);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        System.out.println("Total del pedido: $" + pedido.calcularTotal());

        // cambiar estado del pedido y notifica al cliente
        pedido.cambiarEstado("Enviado");

        // pago
        TarjetaCredito tarjeta = new TarjetaCredito();
        double totalConDescuento = tarjeta.aplicarDescuento(pedido.calcularTotal());
        tarjeta.procesarPago(totalConDescuento);

        PayPal paypal = new PayPal();
        paypal.procesarPago(pedido.calcularTotal());
    }
    
}
