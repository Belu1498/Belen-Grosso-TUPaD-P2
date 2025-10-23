/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;


import java.io.*;         // Para manejo de archivos
import java.util.Scanner; // Para leer desde teclado


class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}

public class Ejercicio2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n MENU DE EJERCICIOS SOBRE EXCEPCIONES");
            System.out.println("1. Division segura");
            System.out.println("2. Conversion de cadena a numero");
            System.out.println("3. Lectura de archivo");
            System.out.println("4. Excepcion personalizada (edad invalida)");
            System.out.println("5. Try-with-resources");
            System.out.println("0. Salir");
            System.out.print("Elija una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    divisionSegura(sc);
                    break;
                case 2:
                    conversionCadenaNumero(sc);
                    break;
                case 3:
                    lecturaArchivo();
                    break;
                case 4:
                    excepcionPersonalizada(sc);
                    break;
                case 5:
                    tryWithResources();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente otra vez.");
            }

        } while (opcion != 0);

        sc.close();
    }

    // división segura
    public static void divisionSegura(Scanner sc) {
        System.out.println("\n=== División segura ===");
        try {
            System.out.print("Ingrese el primer número: ");
            int num1 = sc.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int num2 = sc.nextInt();

            int resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } finally {
            sc.nextLine(); // limpiar buffer
        }
    }

    // conversión de cadena a número
    public static void conversionCadenaNumero(Scanner sc) {
        System.out.println("\n=== Conversión de cadena a número ===");
        try {
            System.out.print("Ingrese un número entero: ");
            String texto = sc.nextLine();
            int numero = Integer.parseInt(texto);
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: No ingresó un número válido.");
        }
    }

    // lectura de archivo
    public static void lecturaArchivo() {
        System.out.println("\n=== Lectura de archivo ===");
        try {
            File archivo = new File("datos.txt");
            Scanner lector = new Scanner(archivo);

            System.out.println("Contenido del archivo:");
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println(linea);
            }
            lector.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo 'datos.txt' no existe.");
        }
    }

    // excepcion personalizada
    public static void excepcionPersonalizada(Scanner sc) {
        System.out.println("\n=== Excepción personalizada ===");
        try {
            System.out.print("Ingrese una edad: ");
            int edad = sc.nextInt();
            validarEdad(edad);
            System.out.println("Edad válida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.nextLine(); // limpiar buffer
        }
    }

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120 años.");
        }
    }

    // try-with-resources
    public static void tryWithResources() {
        System.out.println("\n=== Try-with-resources ===");
        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
            String linea;
            System.out.println("Leyendo archivo con try-with-resources:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
