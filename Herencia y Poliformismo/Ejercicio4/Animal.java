package ejercicio4;


public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // metodo que va a ser sobrescrito
    public void hacerSonido() {
        System.out.println("El animal hace un sonido generico.");
    }

    // el metodo comun a todos
    public void describirAnimal() {
        System.out.println("Soy un animal llamado " + nombre + ".");
    }
}
