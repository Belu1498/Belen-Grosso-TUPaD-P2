public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          ClaveSeguridad clave = new ClaveSeguridad("ABC123", "20/10/2025");
        CuentaBancaria cuenta = new CuentaBancaria("00112233445566778899", 50000.0, clave);
        Titular titular = new Titular("Belen Grosso", "40123456");

        cuenta.setTitular(titular);

        System.out.println(cuenta);
        System.out.println(titular.getCuenta());
    }
    }
    
