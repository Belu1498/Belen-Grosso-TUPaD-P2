
package ejercicio2;

public class VerificarEdad {
    public static void main(String[] args) {
        try {
            validarEdad(-5);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120.");
        }
        System.out.println("Edad válida: " + edad);
    }
}

