package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

    public static void main(String[] args) {
       List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Michi"));
        animales.add(new Vaca("Lola"));

        // polimorfismo
        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
            System.out.println("-----------------------");
        }
    }
    }
