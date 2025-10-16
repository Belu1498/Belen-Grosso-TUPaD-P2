package ejercicio1;

/**
 *
 * @author belen
 */
public class Ejercicio1 {
    
    
     public static void main(String[] args) {
        Foto foto = new Foto("selfie.jpg", "JPG");
        Pasaporte pasaporte = new Pasaporte("A12345", "2025-8-25", foto);
        Titular titular = new Titular("Belen Grosso", "40123456");

        pasaporte.setTitular(titular);

        System.out.println(pasaporte);
        System.out.println(titular.getPasaporte());
    }
    
}
