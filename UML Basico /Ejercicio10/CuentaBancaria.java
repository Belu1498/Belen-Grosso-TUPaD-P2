public class CuentaBancaria {
     private final String cbu;
    private final double saldo;
    private final ClaveSeguridad clave; 
    private Titular titular;     

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = clave;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [CBU=" + cbu + ", Saldo=" + saldo +
               ", Clave=" + clave +
               ", Titular=" + (titular != null ? titular.getNombre() + " - " + titular.getDni() : "sin titular") + "]";
    }
}
