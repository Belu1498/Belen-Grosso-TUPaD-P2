public class TarjetaDeCredito {

    private final String numero;
    private final String fechaVencimiento;
    private Banco banco;

    
    public TarjetaDeCredito(String numero, String fechaVencimiento) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
      
    }

    public String getNumero() {
        return numero;
    }

    public String fechaVencimiento() {
        return fechaVencimiento;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito [Numero=" + numero +
               ", Vencimiento=" + fechaVencimiento +
               ", Banco=" + banco + "]";
    }

    
}
