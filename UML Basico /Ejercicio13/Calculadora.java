public class Calculadora {
    // dependencia: usa Impuesto como parámetro
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto de " 
            + impuesto.getContribuyente().getNombre() 
            + " por un monto de $" + impuesto.getMonto());
    }
}
