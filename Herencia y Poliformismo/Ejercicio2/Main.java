public class Ejercicio2 {
  
    public static void main(String[] args) {
      
        // array polimorfico
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo(5);
        figuras[1] = new Rectangulo(4, 6);
        figuras[2] = new Circulo(2.5);

        // polimorfismo
        for (Figura f : figuras) {
            f.mostrarInfo();
        }

        for (Figura f : figuras) {
            if (f instanceof Circulo) {
                Circulo c = (Circulo) f;  // downcasting
                System.out.println("→ El radio del circulo es: " + c.getRadio());
            }
        }
    }
    }
   
