public class Ejercicio11 {
    public static void main(String[] args) {
        Artista artista = new Artista("Metallica", "Heavy Metal");
        Cancion cancion = new Cancion("Whiskey in the Jar", artista);
        Reproductor reproductor = new Reproductor();

        reproductor.reproducir(cancion);
}
}
